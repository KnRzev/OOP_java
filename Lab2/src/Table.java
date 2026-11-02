public interface Table {
    double getHeight();

    String setHeight(double height);

    double getLength();

    String setLength(double length);

    double getWidth();

    String setWidth(double width);

    String describe();

    double calculateTableArea();

    int calculateMaxPeoples();
}