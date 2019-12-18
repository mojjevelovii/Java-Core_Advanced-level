package HW1;

public class Cat implements Actions {
    private double maxRunLength;
    private double maxJumpHeight;
    private boolean isActivePlayer = true;

    public Cat(double maxRunLength, double maxJumpHeight) {
        this.maxRunLength = maxRunLength;
        this.maxJumpHeight = maxJumpHeight;
    }

    @Override
    public void run(ITreadmill track) {
        System.out.println("Кот побежал.");
        tryHandle(track.getLength(),maxRunLength, ActionType.RUN);
    }

    @Override
    public void jump(IWall wall) {
        System.out.println("Кот прыгает.");
        tryHandle(wall.getHeight(),maxJumpHeight, ActionType.JUMP);
    }

    @Override
    public boolean isActivePlayer() {
        return isActivePlayer;
    }

    @Override
    public String getName() {
        return "Кот";
    }

    @Override
    public void disablePlayer() {
        Actions.super.disablePlayer();
        isActivePlayer = false;
    }
}
