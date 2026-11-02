public class Apartment extends Premises {
    private int roomsCount;
    private int residentsCount;
    private boolean hasBalcony;

    public Apartment(
            double area,
            int floor,
            boolean hasWindow,
            int roomsCount,
            int residentsCount,
            boolean hasBalcony) {

        super(area, floor, hasWindow);
        this.roomsCount = roomsCount;
        this.residentsCount = residentsCount;
        this.hasBalcony = hasBalcony;
    }

    public void addResident() {
        residentsCount++;
    }

    public void removeResident() {
        if (residentsCount > 0) {
            residentsCount--;
        }
    }

    public double calculateAreaPerRoom() {
        if (roomsCount <= 0) {
            throw new IllegalArgumentException("Количество комнат должно быть больше 0");
        }
        return getArea() / roomsCount;
    }

    public int getRoomsCount() {
        return roomsCount;
    }

    public void setRoomsCount(int roomsCount) {
        if (roomsCount <= 0) {
            throw new IllegalArgumentException("Количество комнат должно быть больше 0");
        }
        this.roomsCount = roomsCount;
    }

    public int getResidentsCount() {
        return residentsCount;
    }

    public void setResidentsCount(int residentsCount) {
        if (residentsCount < 0) {
            throw new IllegalArgumentException("Количество жильцов не может быть отрицательным");
        }
        this.residentsCount = residentsCount;
    }

    public boolean isHasBalcony() {
        return hasBalcony;
    }

    public void setHasBalcony(boolean hasBalcony) {
        this.hasBalcony = hasBalcony;
    }
}