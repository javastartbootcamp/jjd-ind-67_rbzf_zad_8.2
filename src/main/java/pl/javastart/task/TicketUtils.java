package pl.javastart.task;

public class TicketUtils {

    private static final String ONLINE = "internetowy";
    private static final String STANDARD = "standardowy";
    private static final String GIFT = "prezentowy";

    double calculateFinalPrice(Ticket ticket) {
        double finalPrice = 0;
        switch (ticket.getType()) {
            case ONLINE:
                finalPrice = getDiscountPrice(ticket);
                break;
            case STANDARD:
                finalPrice = getStandardFinalPrice(ticket);
                break;
            case GIFT:
                finalPrice = getGiftFinalPrice(ticket);
                break;
            default:
                System.out.println("Nie ma biletu takiego typu.");
        }
        return finalPrice;
    }

    double getDiscountPrice(Ticket ticket) {
        return ticket.getPrice() * (1 - ticket.getDiscount());
    }

    double getStandardFinalPrice(Ticket ticket) {
        return getDiscountPrice(ticket) + 5;
    }

    double getGiftFinalPrice(Ticket ticket) {
        return getStandardFinalPrice(ticket) + getDiscountPrice(ticket) * 0.05;
    }

    public String getInfo(Ticket ticket) {
        String format = "%s, %s, bilet %s, identyfikator biletu: %d, cena podstawowa %.2f, cena finalna wyniesie %.2f";
        return String.format(format, ticket.getEvent(), ticket.getVenue(), ticket.getType(), ticket.getId(),
                ticket.getPrice(), calculateFinalPrice(ticket));

    }

}