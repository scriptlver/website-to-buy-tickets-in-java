import javax.swing.JOptionPane;

public class Tickets {
    public static void main(String[] args) {
        String[] events = {"Jazz Festival", "Modern Art Exhibition", "Theater Play"};
        String[] details = {"Jazz Festival in Central Park. \nDate: April 12th, 7:00 p.m. \nPrice: $20.",
                "Modern art exhibition in the contemporary art gallery. \nDate: May 18th, 8:00 p.m. \nPrice: $15.",
                "Classic theater play at the municipal theater. \nDate: June 10th, 5:00 p.m. \nPrice: $12."};

        JOptionPane.showMessageDialog(null, "Welcome to the TicketWave website!");

        String name = JOptionPane.showInputDialog("Please enter your name:");
        String email = JOptionPane.showInputDialog("Please enter your email:");

        String chosenEvent = (String) JOptionPane.showInputDialog(null,
                "Choose an event:",
                "Event Selection",
                JOptionPane.PLAIN_MESSAGE,
                null,
                events,
                events[0]);

        int ticketsQuantity = TicketManager.getTicketsQuantity();

        String[] paymentOptions = {"Credit Card", "Debit Card", "Pix", "Cash"};
        String chosenPayment = (String) JOptionPane.showInputDialog(null,
                "Choose a payment method:",
                "Payment Method",
                JOptionPane.PLAIN_MESSAGE,
                null,
                paymentOptions,
                paymentOptions[0]);

        double totalPrice = TicketManager.calculateTotalPrice(chosenEvent, ticketsQuantity);

        JOptionPane.showMessageDialog(null,
                "Name: " + name +
                "\nEmail: " + email +
                "\nEvent: " + chosenEvent +
                "\nTickets Quantity: " + ticketsQuantity +
                "\nPayment Method: " + chosenPayment +
                "\nTotal Price: $" + totalPrice,
                "Purchase Summary",
                JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null,"Thank you, See you soon! :) ");
    }
}

