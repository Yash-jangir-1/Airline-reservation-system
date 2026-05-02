import javax.swing.*;
import java.awt.*;
import java.util.List;

public class MainFrame extends JFrame {
    private BookingSystem controller;
    private JTextArea displayArea;

    public MainFrame() {
        controller = new BookingSystem();
        setTitle("Task Force: Airline Reservation System");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        displayArea = new JTextArea();
        JButton btnLoad = new JButton("View Available Flights");

        btnLoad.addActionListener(e -> loadFlights());

        add(new JScrollPane(displayArea), BorderLayout.CENTER);
        add(btnLoad, BorderLayout.SOUTH);
    }

    private void loadFlights() {
        List<Flight> flights = controller.getAvailableFlights();
        displayArea.setText("Flight ID | Source | Destination | Capacity\n");
        for (Flight f : flights) {
            displayArea.append(f.getFlightID() + " | " + f.getSource() + 
                               " | " + f.getDestination() + " | " + f.getCapacity() + "\n");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new MainFrame().setVisible(true);
        });
    }
}
