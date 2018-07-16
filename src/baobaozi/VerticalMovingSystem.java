package baobaozi;

public interface VerticalMovingSystem {
    void jump(int heightInMeter);

    void jump(int speedInMeterPerSecond, int timeInSecond);

    default void test() {
        System.out.println("Using test method in VerticalMovingSystem");
    }
}
