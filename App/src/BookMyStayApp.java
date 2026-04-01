public class BookMyStayApp {
    public static void main(String[] args) {
        SingleRoom single = new SingleRoom();
        DoubleRoom doubleRoom = new DoubleRoom();
        SuiteRoom suite = new SuiteRoom();

        int singleAvailable = 5;
        int doubleAvailable = 3;
        int suiteAvailable = 2;

        System.out.println("Hotel Room Initialization\n");

        System.out.println("Single Room:");
        single.displayRoomDetails(singleAvailable);
        System.out.println();

        System.out.println("Double Room:");
        doubleRoom.displayRoomDetails(doubleAvailable);
        System.out.println();

        System.out.println("Suite Room:");
        suite.displayRoomDetails(suiteAvailable);
    }

}
