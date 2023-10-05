abstract class Hogwarts {
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

class Gryffindor extends Hogwarts {
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

class Slytherin extends Hogwarts {
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

class Hufflepuff extends Hogwarts {
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

class Ravenclaw extends Hogwarts {
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

public class Main {
    public static void main(String[] args) {
        Hogwarts[] hogwarts = new Hogwarts[]{
                new Gryffindor(30, 40, 60, 30, 50, "Гарри", " Поттер"),
                new Hufflepuff(34, 5, 43, 45, 22, "Гермиона", " Грейнджер")
        };
        for (int i = 0; i <= hogwarts.length - 1; i++) {
            hogwarts[i].printInfo();
        }
//            hogwarts[0].equils(hogwarts[1]);
        zd(hogwarts[0].getName(), hogwarts[1].getName(), hogwarts[0].getSum(), hogwarts[1].getSum());

    }

    public static void zd(String a1, String b1, int a, int b) {
        if (a > b) {
            System.out.println(a1 + " обладает бОльшей мощностью магии, чем " + b1);
        } else {
            System.out.println(b1 + " обладает бОльшей мощностью магии, чем " + a1);
        }

    }


}