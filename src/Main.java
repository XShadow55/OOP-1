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