public class Main {
    public static void main(String[] args) {
        //exclusive or
        boolean jan_gewonnen = true;
        boolean tim_gewonnen = false;

        if (jan_gewonnen ^ tim_gewonnen) {
            System.out.println("Richtiges Ergebnis");
        } else {
            System.out.println("Da stimmt etwas nicht...");
        }
    }
}
