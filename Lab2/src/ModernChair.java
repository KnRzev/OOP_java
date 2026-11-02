public class ModernChair implements Chair {
    private double height;
    private double length;
    private double width;

    public ModernChair(double height, double length, double width) {
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
        return "Современный стул\nВысота: " + height + " см, длина: " + length + " см, ширина: " + width + " см.";
    }

    @Override
    public double calculateSeatArea(){
        return this.length * this.width;
    }

    @Override
    public boolean isWithTable(double height){
        double difference = height - this.height;
        return difference >= 20 && difference <= 40;
    }
}

