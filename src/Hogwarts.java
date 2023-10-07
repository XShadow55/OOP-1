public abstract class Hogwarts {
    private String name;
    private int powerOfMagic, transgression, sum;

    public Hogwarts(int powerOfMagic, int transgression, String name) {

        this.powerOfMagic = powerOfMagic;
        this.transgression = transgression;
        this.name = name;
        sum = powerOfMagic + transgression;
    }

    public int getTransgression() {
        return transgression;
    }

    public String getName() {
        return name;
    }

    public int getSum() {
        return sum;
    }

    public int getPowerOfMagic() {
        return powerOfMagic;
    }

    public abstract void printInfo();

    public abstract void equils(Object a);
}
