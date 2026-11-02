public class Penthouse extends Apartment {
    private double terraceArea;
    private int panoramicWindows;
    private boolean hasPrivateElevator;

    public Penthouse(
            double area,
            int floor,
            boolean hasWindow,
            int roomsCount,
            int residentsCount,
            boolean hasBalcony,
            double terraceArea,
            int panoramicWindows,
            boolean hasPrivateElevator) {

        super(
                area,
                floor,
                hasWindow,
                roomsCount,
                residentsCount,
                hasBalcony
        );
        this.terraceArea = terraceArea;
        this.panoramicWindows = panoramicWindows;
        this.hasPrivateElevator = hasPrivateElevator;
    }

    public double calculateTotalArea() {
        return getArea() + terraceArea;
    }
    public void addPanoramicWindow() {
        panoramicWindows++;
    }

    public void usePrivateElevator() {
        if (!this.hasPrivateElevator) {
            throw new IllegalStateException("У пентхауса нет отдельного лифта");
        }
        System.out.println("Отдельный лифт вызван");
    }

    public double getTerraceArea() {
        return terraceArea;
    }

    public void setTerraceArea(double terraceArea) {
        if (terraceArea < 0) {
            throw new IllegalArgumentException("Площадь террасы не может быть отрицательной");
        }
        this.terraceArea = terraceArea;
    }

    public int getPanoramicWindows() {
        return panoramicWindows;
    }

    public void setPanoramicWindows(int panoramicWindows) {
        if (panoramicWindows < 0) {
            throw new IllegalArgumentException(
                    "Количество панорамных окон не может быть отрицательным"
            );
        }
        this.panoramicWindows = panoramicWindows;
    }

    public boolean isHasPrivateElevator() {
        return this.hasPrivateElevator;
    }

    public void setHasPrivateElevator(boolean hasPrivateElevator) {
        this.hasPrivateElevator = hasPrivateElevator;
    }
}