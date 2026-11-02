public class Premises {
    private double area;
    private int floor;
    private boolean hasWindow;

    public Premises(double area, int floor, boolean hasWindow) {
        this.area = area;
        this.floor = floor;
        this.hasWindow = hasWindow;
    }

    public double calculateAreaPerPerson(int people) {
        if (people <= 0) {
            throw new IllegalArgumentException("Количество людей должно быть больше 0");
        }
        return area / people;
    }

    public void increaseArea(double additionalArea) {
        if (additionalArea <= 0) {
            throw new IllegalArgumentException("Дополнительная площадь должна быть больше 0");
        }
        area += additionalArea;
    }

    public boolean hasNaturalLight() {
        return hasWindow;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        if (area <= 0) {
            throw new IllegalArgumentException("Площадь должна быть больше 0");
        }
        this.area = area;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        if (floor <= 0) {
            throw new IllegalArgumentException("Этаж не может быть меньше 1");
        }
        this.floor = floor;
    }

    public boolean isHasWindow() {
        return hasWindow;
    }

    public void setHasWindow(boolean hasWindow) {
        this.hasWindow = hasWindow;
    }
}