package HW1;

public class Wall implements IWall{
    private double height;

    public Wall(double height) {
        this.height = height;
    }

    @Override
    public double getHeight() {
        return height;
    }
}
