
public class Test {

    public static void main(String[] args) {


        // Numerologija

        Numerologija num = new Numerologija();

        num.readFuture(26,2,1984);

        // treba da printa 5


        //Horoskop

        Mesecni h = new Mesecni();

        h.determine_sign(1,17);

        System.out.println(h.getSign());

        // treba da printa Capricorn (Jarac)


    }
}
