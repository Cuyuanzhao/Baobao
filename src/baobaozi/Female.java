package baobaozi;

public class Female extends Human{
    private boolean pregnant;
    private boolean hasHusband;

    public Female(String n, int a, int h, boolean p) {
        super(n, a, h);
        this.pregnant = p;
    }

    @Override
    public void setMarried() {
        this.married = true;
        this.hasHusband = true;
    }

    @Override
    public void speakMyName() {
        System.out.println("I am a female and my name is: " + this.getName());
    }

    public boolean isPregnant() {
        return pregnant;
    }

    public void setPregnant(final boolean pregnant) {
        this.pregnant = pregnant;
    }
}
