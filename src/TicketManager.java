import javax.swing.JOptionPane;

public class TicketManager {
    public static int getTicketsQuantity() {
        while (true) {
            try {
                String input = JOptionPane.showInputDialog("Enter the quantity of tickets:");
                int quantity = Integer.parseInt(input);
                if (quantity > 0) {
                    return quantity;
                } else {
                    JOptionPane.showMessageDialog(null, "Please enter a valid quantity.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please enter a valid number.");
            }
        }
    }

    public static double calculateTotalPrice(String event, int quantity) {
        double price = 0;
        switch (event) {
            case "Jazz Festival":
                price = 20.0;
                break;
            case "Modern Art Exhibition":
                price = 15.0;
                break;
            case "Theater Play":
                price = 12.0;
                break;
        }
        return price * quantity;
    }
}

