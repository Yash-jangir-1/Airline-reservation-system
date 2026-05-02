public class Flight {
    private String flightID;
    private String source;
    private String destination;
    private int capacity;

    public Flight(String flightID, String source, String destination, int capacity) {
        this.flightID = flightID;
        this.source = source;
        this.destination = destination;
        this.capacity = capacity;
    }

    // Getters and Setters
    public String getFlightID() { return flightID; }
    public String getSource() { return source; }
    public String getDestination() { return destination; }
    public int getCapacity() { return capacity; }
}
