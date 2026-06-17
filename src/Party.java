public class Party {
    public static void main(String[] args) {
        int guests = 11;

        guests = guests -1;  //eine Absage       //Neue Zuweisung überschreibt vorherige
        guests = guests + 3; //drei Zusagen

        System.out.println("Anzahl der Gäste, die kommen: " + guests);
    }
}
