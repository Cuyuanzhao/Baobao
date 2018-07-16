package baobaozi;

public interface HorizontalMovingSystem {
    void run(int distanceInMeter);

    void run(int speedInMeterPerSecond, int timeInSecond);

    default void test(){
        System.out.println("Using test method in HorizontalMovingSystem");
    }
}
