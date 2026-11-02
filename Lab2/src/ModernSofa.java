public final class ModernSofa implements Sofa {
    private int pillow;
    private double length;
    private double width;

    public ModernSofa(int pillow, double length, double width) {
        if (pillow >= 0 && length > 0 && width > 0) {
            setPillow(pillow);
            setLength(length);
            setWidth(width);
        } else {
            throw new IllegalArgumentException("Количество подушек должно быть неотрицательным, а длина и ширина - положительными.");
        }
    }

    @Override
    public int getPillow() {
        return pillow;
    }
    @Override
    public double getLength() {
        return length;
    }

    @Override
    public double getWidth() {
        return width;
    }

    @Override
    public String setLength(double length) {
        if (length > 0) {
            this.length = length;
            return "Длина изменена";
        }
        return "Длина не может быть равна 0 или быть отрицательной";
    }

    @Override
    public String setWidth(double width) {
        if (width > 0) {
            this.width = width;
            return "Ширина изменена";
        }
        return "Ширина не может быть равна 0 или быть отрицательной";
    }

    @Override
    public String setPillow(int pillow) {
        if (pillow >= 0) {
            this.pillow = pillow;
            return "Количество подушек изменено";
        }
        return "Количество подушек не может быть отрицательным";
    }

    @Override
    public String describe() {
        return "Современный диван\nДлина: " + length + " см, ширина: " + width + " см." + " Количество подушек = " + this.pillow;
    }

    @Override
    public int maxSeatPeople() {
        return (int) (this.width / 60);
    }

    @Override
    public boolean canSeatPeoples(int countPeople) {
        return countPeople >= 0 && countPeople <= maxSeatPeople();
    }
}