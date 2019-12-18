package HW1;

public class Robot implements Actions {
    private double maxRunLength;
    private double maxJumpHeight;
    private boolean isActivePlayer = true;

    public Robot(double maxRunLength, double maxJumpHeight) {
        this.maxRunLength = maxRunLength;
        this.maxJumpHeight = maxJumpHeight;
    }

    @Override
    public void jump(IWall wall) {
        System.out.println("Робот прыгает.");
        tryHandle(wall.getHeight(), maxJumpHeight, ActionType.JUMP);
    }

    @Override
    public void run(ITreadmill track) {
        System.out.println("Робот побежал.");
        tryHandle(track.getLength(), maxRunLength, ActionType.RUN);
    }

    @Override
    public boolean isActivePlayer() {
        return isActivePlayer;
    }

    @Override
    public String getName() {
        return "Робот";
    }

    @Override
    public void disablePlayer() {
        Actions.super.disablePlayer();
        isActivePlayer = false;
    }
}
