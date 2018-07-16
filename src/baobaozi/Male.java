package baobaozi;

public class Male extends Human implements MotorSystem {
    private boolean hasWife;
    private int xAxis;
    private int yAxis;

    public Male(final String name, final int age, final int height) {
        super(name, age, height);
        this.xAxis = 0;
        this.yAxis = 0;
    }

    @Override
    public void setMarried() {
        this.married = true;
        this.hasWife = true;
    }

    @Override
    public void jump(int heightInMeter) {
        yAxis += heightInMeter;
    }

    @Override
    public void jump(final int speedInMeterPerSecond, final int timeInSecond) {
        yAxis += speedInMeterPerSecond * timeInSecond;
    }

    @Override
    public void run(final int distanceInMeter) {
        xAxis += distanceInMeter;
    }

    @Override
    public void run(int speedInMeterPerSecond, int timeInSecond) {
        xAxis += speedInMeterPerSecond * timeInSecond;
    }

    public void printMyLocation() {
        System.out.println(String.format("My location is (xAxis: %d, yAxis: %d)", xAxis, yAxis));
    }
}
