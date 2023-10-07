public class Slytherin extends Hogwarts {
    private String name, surname;
    private int cunning, determination, ambition, resourcefulness, thirstForPower, sum, sum1;

    public Slytherin(int cunning, int determination, int ambition, int resourcefulness, int thirstForPower, int powerOfMagic, int transgression, String name, String surname) {
        super(powerOfMagic, transgression, name);
        this.name = name;
        this.surname = surname;
        if ((cunning >= 0 && cunning <= 100) && (determination >= 0 && determination <= 100) && (ambition >= 0 && ambition <= 100) && (resourcefulness >= 0 && resourcefulness <= 100) && (thirstForPower >= 0 && thirstForPower <= 100)) {
            this.cunning = cunning;
            this.determination = determination;
            this.ambition = ambition;
            this.resourcefulness = resourcefulness;
            this.thirstForPower = thirstForPower;
        } else {
            System.out.printf("Введены не корректные данные");
        }
        sum = cunning + determination + ambition + resourcefulness + thirstForPower;
        sum1 = super.getPowerOfMagic() + super.getTransgression();
    }

    @Override
    public void printInfo() {
        System.out.println(name + " " + surname + " " + cunning + " " + determination + " " + ambition + " " + resourcefulness + " " + thirstForPower + " " + super.getPowerOfMagic() + " " + super.getTransgression());
    }

    @Override
    public void equils(Object a) {
        Slytherin s = (Slytherin) a;
        if (this.sum < s.sum) {
            System.out.println(this.name + " лучший Слизеринец, чем " + s.name);
        } else {
            System.out.println(s.name + " лучший Слизеринец, чем " + this.name);
        }
    }


}
