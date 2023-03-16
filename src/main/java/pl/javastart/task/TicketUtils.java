package pl.javastart.task;

public class TicketUtils {

    private static final String ONLINE = "internetowy";
    private static final String STANDARD = "standardowy";
    private static final String GIFT = "prezentowy";
    private static final int LOGISTICSCOST = 5;
    private static final double DISCOUNT = 0.5;

    double calculateFinalPrice(Ticket ticket) {
        double finalPrice = 0;
        switch (ticket.getType()) {
            case ONLINE -> finalPrice = getDiscountPrice(ticket);
            case STANDARD -> finalPrice = getStandardFinalPrice(ticket);
            case GIFT -> finalPrice = getGiftFinalPrice(ticket);
            default -> System.out.println("Nie ma biletu takiego typu.");
        }
        return finalPrice;
    }

    private double getDiscountPrice(Ticket ticket) {
        return ticket.getPrice() * (1 - ticket.getDiscount());
    }

    private double getStandardFinalPrice(Ticket ticket) {
        return getDiscountPrice(ticket) + LOGISTICSCOST;
    }

    private double getGiftFinalPrice(Ticket ticket) {
        return getStandardFinalPrice(ticket) + getDiscountPrice(ticket) * DISCOUNT;
    }

    public String getInfo(Ticket ticket) {
        String format = "%s, %s, bilet %s, identyfikator biletu: %d, cena podstawowa %.2f, cena finalna wyniesie %.2f";
        return String.format(format, ticket.getEvent(), ticket.getVenue(), ticket.getType(), ticket.getId(),
                ticket.getPrice(), calculateFinalPrice(ticket));

    }

}