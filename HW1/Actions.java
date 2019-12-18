package HW1;

public interface Actions extends Run, Jump {
    boolean isActivePlayer();

    default void disablePlayer() {
        System.out.println(getName() + " выбывает из игры.");
    }

    default void tryHandle(double barrierSize, double playerMax, ActionType type) {
        if (barrierSize <= playerMax) {
            System.out.println(getName() + " смог" + type.getText());
        } else {
            System.out.println(getName() + " не смог" + type.getText());
            disablePlayer();
        }
    }

    String getName();

    enum ActionType {
        RUN(" пробежать."), JUMP(" перепрыгнуть.");

        private final String text;

        ActionType(String text) {
            this.text = text;
        }

        public String getText() {
            return text;
        }
    }
}
