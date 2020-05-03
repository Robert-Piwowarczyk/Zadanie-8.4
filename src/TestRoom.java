public class TestRoom {
    public static void main(String[] args) {
        GuestRoom guestRoom = new GuestRoom("10m",20.0,
                1,"podstawowy klimatyzator");
        Kitchen kitchen = new Kitchen("8m",18.0,
                2,"profesionalny klimatyzator");

        System.out.println("Aktualna temperatura w pomieszczeniu: "
                + guestRoom.getRoomNumber()+"stopni Celciusza: "
                + Room.basicAirConditioner);

        System.out.println("Aktualna temperatura w pomieszczeniu: "
                + kitchen.getRoomNumber()+"stopni Celciusza: "
                + Room.proAirConditioner);
    }
}
