public class Gryffindor extends Hogwarts {
    private String name, surname;
    private int nobility, honor, courage, sum;

    public Gryffindor(int nobility, int honor, int courage, int powerOfMagic, int transgression, String name, String surname) {
        super(powerOfMagic, transgression, name);
        this.name = name;
        this.surname = surname;
        if ((nobility >= 0 && nobility <= 100) && (honor >= 0 && honor <= 100) && (courage >= 0 && courage <= 100)) {

            this.nobility = nobility;
            this.honor = honor;
            this.courage = courage;
        } else {
            System.out.printf("Введены не корректные данные");
        }
        sum = nobility + honor + courage;

    }

    @Override
    public void printInfo() {
        System.out.println(name + " " + surname + " " + nobility + " " + honor + " " + courage + " " + super.getPowerOfMagic() + " " + super.getTransgression());

    }

    @Override
    public void equils(Object a) {
        Gryffindor s = (Gryffindor) a;
        if (this.sum > s.sum) {
            System.out.println(this.name + " лучший Гриффиндорец, чем " + s.name);
        } else {
            System.out.println(s.name + " лучший Гриффиндорец, чем " + this.name);
        }
    }


}
