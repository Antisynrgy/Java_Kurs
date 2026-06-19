public class Main {
    public static void main(String[] args) {
        double temperatur = 18;

        if (!(temperatur > 20)) {           // ! : Nicht-Operator --> (!(temperatur > 20)) = (temperatur <= 20)
            System.out.println("Kalt");
        } else {
            System.out.println("Angenehm");
        }
    }
}
