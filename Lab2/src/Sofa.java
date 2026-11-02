public interface Sofa {

    double getWidth();

    String setWidth(double width);

    double getLength();

    String setLength(double length);

    int getPillow();

    String setPillow(int pillow);

    String describe();

    int maxSeatPeople();

    boolean canSeatPeoples(int countPeople);
}