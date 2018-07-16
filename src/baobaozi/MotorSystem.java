package baobaozi;

public interface MotorSystem extends VerticalMovingSystem, HorizontalMovingSystem {
    default void move(int xDelta, int yDelta) {
        run(xDelta);
        jump(yDelta);
    }

    @Override
    default void test() {
        HorizontalMovingSystem.super.test();
    }
}
