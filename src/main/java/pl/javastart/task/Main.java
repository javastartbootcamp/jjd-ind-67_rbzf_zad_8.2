package pl.javastart.task;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        TicketUtils ticketUtils = new TicketUtils();
        Ticket ticket1 = new Ticket("Pokaz lotniczy", "Okecie", "internetowy", 100, 0.05);
        Ticket ticket2 = new Ticket("Wystawa psow", "Torwar", "standardowy", 100, 0.05);
        Ticket ticket3 = new Ticket("Pokaz lotniczy", "Okecie", "prezentowy", 100, 0.05);
        System.out.println(ticketUtils.getInfo(ticket1));
        System.out.println(ticketUtils.getInfo(ticket2));
        System.out.println(ticketUtils.getInfo(ticket3));

        Scanner scanner = new Scanner(System.in);
        Ticket ticket4 = new Ticket("Pokaz lotniczy", "Okecie", 100, 0.05);
        System.out.println("Bilety na pokaz lotniczy na Okeciu.");
        System.out.println("Wybierz rodzaj biletu: internetowy, standardowy, prezentowy");
        ticket4.setType(scanner.nextLine());

        System.out.println(ticketUtils.getInfo(ticket4));
    }
}

