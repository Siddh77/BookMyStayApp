import java.util.Map;
public class BookMyStayApp {
    public static void main(String[] args) {
        RoomInventory inventory = new RoomInventory();
        Map<String, Integer> availability = inventory.getRoomAvailability();

        System.out.println("Hotel Room Inventory Status");
        System.out.println();

        // Single Room Display
        displayRoomDetails("Single Room", 1, 250, 1500.0, availability.get("Single Room"));

        // Double Room Display
        displayRoomDetails("Double Room", 2, 400, 2500.0, availability.get("Double Room"));

        // Suite Room Display
        displayRoomDetails("Suite Room", 3, 750, 5000.0, availability.get("Suite Room"));
    }

    private static void displayRoomDetails(String type, int beds, int size, double price, int available) {
        System.out.println(type + ":");
        System.out.println("Beds: " + beds);
        System.out.println("Size: " + size + " sqft");
        System.out.println("Price per night: " + price);
        System.out.println("Available Rooms: " + available);
        System.out.println();
    }

}
