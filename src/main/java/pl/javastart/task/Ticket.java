package pl.javastart.task;

public class Ticket {

    private String event;
    private String venue;
    private String type;
    private double price;
    private double discount;
    private int id;
    private static int counter;

    public Ticket(String event, String venue, String type, double price, double discount) {
        this(event, venue, price, discount);
        this.type = type;
    }

    public Ticket(String event, String venue, double price, double discount) {
        counter++;
        this.id = counter;
        this.event = event;
        this.venue = venue;
        this.price = price;
        this.discount = discount;
    }

    public int getId() {
        return id;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

}

