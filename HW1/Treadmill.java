package HW1;

public class Treadmill implements ITreadmill {
    private double length;

    public Treadmill(double length) {
        this.length = length;
    }

    @Override
    public double getLength() {
        return length;
    }
}
