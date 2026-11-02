public final class ClassicTable implements Table {
    private double height;
    private double length;
    private double width;

    public ClassicTable(double height, double length, double width) {
        if (height > 0 && length > 0 && width > 0) {
            setHeight(height);
            setLength(length);
            setWidth(width);
        } else {
            throw new IllegalArgumentException("Длина, высота и ширина должны быть положительными.");
        }
    }

    @Override
    public double getHeight() {
        return height;
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
    public String setHeight(double height) {
        if (height > 0){
            this.height = height;
            return "Высота изменена";
        }
        return "Высота не может быть равна 0 или быть отрицательной";
    }

    @Override
    public String setLength(double length) {
        if (length > 0){
            this.length = length;
            return "Длинна изменена";
        }
        return "Длинна не может быть равна 0 или быть отрицательной";
    }

    @Override
    public String setWidth(double width) {
        if (width > 0){
            this.width = width;
            return "Ширина изменена";
        }
        return "Ширина не может быть равна 0 или быть отрицательной";
    }

    @Override
    public String describe() {
        return "Классический стол\nВысота: " + height + " см, длина: " + length + " см, ширина: " + width + " см.";
    }

    @Override
    public double calculateTableArea() {
        return this.length * this.width;
    }

    @Override
    public int calculateMaxPeoples() {
        return 2 * (int) (this.length / 60) + 2 * (int) (this.width / 60);
    }
}

