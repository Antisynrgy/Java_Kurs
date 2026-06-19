public class Main {
    public static void main(String[] args) {
        double temperatur = 25;

                //&& : Und-Operator, || : Oder-Operator --> (temperatur > 20 && temperatur < 35) = (temperatur < 20 -- temperatur > 35)

        if (temperatur > 20 && temperatur < 35) {

            System.out.println("Angenehm");
        } else {
            System.out.println("Unangenehm");
        }
    }
}
