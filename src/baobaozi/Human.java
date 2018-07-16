package baobaozi;

public abstract class Human {
    private String name;
    private int age;
    private int height;
    protected boolean married;

    public Human() {
        System.out.println("constructing an empty human...");
    }

    public Human(String name, int age, int height) {
        System.out.println("constructing a concise human...");
        this.name = name;
        this.age = age;
        this.height = height;
    }

    abstract public void setMarried();

    public void speak(String string) {
        System.out.println(string);
    }

    public void speakMyName() {
        this.speak(this.name);
    }



    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }
}
