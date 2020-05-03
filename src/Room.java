public class Room {
    private String surfaceRoom;
    private double temperature;
    private int roomNumber;

    public Room(String surfaceRoom,
                double temperature
            , int roomNumber) {
        this.surfaceRoom = surfaceRoom;
        this.temperature = temperature;
        this.roomNumber = roomNumber;
    }

    public String getSurfaceRoom() {
        return surfaceRoom;
    }

    public void setSurfaceRoom(String surfaceRoom) {
        this.surfaceRoom = surfaceRoom;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;

    }

    public double basicAirConditioner() {
        if (temperature > 20) {
            return temperature = temperature - 0.1;
        }
    }
        public double proAirConditioner () {
            if (temperature > 18) {
                return temperature = temperature - 0.2;
            }
        }
    }
