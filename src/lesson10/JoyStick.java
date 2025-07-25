package lesson10;

public interface JoyStick {

    void up();
    void down();
    void left();
    void right();

//    void upLeft();

    default void upLeft() {
        up();
        left();
    }

    default void upRight() {
        up();
        right();
    }

    default void downLeft() {
        down();
        left();
    }

    default void downRight() {
        down();
        right();
    }
}
