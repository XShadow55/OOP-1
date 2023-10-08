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
        zd(hogwarts[0],hogwarts[1]);

    }

   public static void zd(Object a, Object b ) {
        Hogwarts s = (Hogwarts) a;
        Hogwarts s1 = (Hogwarts) b;
        if (s.getSum() > s1.getSum()) {
            System.out.println(s.getName() + " обладает бОльшей мощностью магии, чем " + s1.getName());
        } else {
            System.out.println(s1.getName() + " обладает бОльшей мощностью магии, чем " + s.getName());
        }

    }


}
