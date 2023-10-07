public class Hufflepuff extends Hogwarts {
    private String name, surname;
    private int hardworking, loyal, honest, sum, sum1;

    public Hufflepuff(int hardworking, int loyal, int honest, int powerOfMagic, int transgression, String name, String surname) {
        super(powerOfMagic, transgression, name);
        this.name = name;
        this.surname = surname;
        if ((hardworking >= 0 && hardworking <= 100) && (loyal >= 0 && loyal <= 100) && (honest >= 0 && honest <= 100)) {
            this.hardworking = hardworking;
            this.loyal = loyal;
            this.honest = honest;
        } else {
            System.out.printf("Введены не корректные данные");
        }
        sum = hardworking + loyal + honest;
        sum1 = super.getPowerOfMagic() + super.getTransgression();
    }

    @Override
    public void printInfo() {
        System.out.println(name + " " + surname + " " + hardworking + " " + loyal + " " + honest + " " + super.getPowerOfMagic() + " " + super.getTransgression());
    }

    @Override
    public void equils(Object a) {
        Hufflepuff s = (Hufflepuff) a;
        if (this.sum < s.sum) {
            System.out.println(this.name + " лучший Пуфендуец, чем " + s.name);
        } else {
            System.out.println(s.name + " лучший Пуфендуец, чем " + this.name);
        }
    }


}
