import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BookingSystem {
    public List<Flight> getAvailableFlights() {
        List<Flight> flights = new ArrayList<>();
        String query = "SELECT * FROM flights";

        try (Connection conn = DatabaseConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {
                flights.add(new Flight(
                    rs.getString("flight_id"),
                    rs.getString("source"),
                    rs.getString("destination"),
                    rs.getInt("capacity")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return flights;
    }

    public boolean bookFlight(String flightID) {
        // Logic for updating capacity in DB
        return true; 
    }
}
