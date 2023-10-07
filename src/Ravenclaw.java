public class Ravenclaw extends Hogwarts {
    private String name, surname;
    private int smart, wise, witty, fullOfCreativity, sum, sum1;

    public Ravenclaw(int smart, int wise, int witty, int fullOfCreativity, int powerOfMagic, int transgression, String name, String surname) {
        super(powerOfMagic, transgression, name);
        this.name = name;
        this.surname = surname;
        if ((smart >= 0 && smart <= 100) && (wise >= 0 && wise <= 100) && (witty >= 0 && witty <= 100) && (fullOfCreativity >= 0 && fullOfCreativity <= 100)) {
            this.smart = smart;
            this.wise = wise;
            this.witty = witty;
            this.fullOfCreativity = fullOfCreativity;
        } else {
            System.out.printf("Введены не корректные данные");
        }
        sum = smart + wise + witty + fullOfCreativity;
        sum1 = super.getPowerOfMagic() + super.getTransgression();
    }

    @Override
    public void printInfo() {
        System.out.println(name + " " + surname + " " + smart + " " + wise + " " + witty + " " + fullOfCreativity + " " + super.getPowerOfMagic() + " " + super.getTransgression());
    }

    @Override
    public void equils(Object a) {
        Ravenclaw s = (Ravenclaw) a;
        if (this.sum < s.sum) {
            System.out.println(this.name + " лучший Когтевранец, чем " + s.name);
        } else {
            System.out.println(s.name + " лучший Когтевранец, чем " + this.name);
        }
    }


}
