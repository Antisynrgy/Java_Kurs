public class Party {
    public static void main(String[] args) {
        int guests = 11;

        guests -= 1;            //entspricht: guests = guests -1; oder guests--;

        System.out.println("Anzahl der Gäste, die kommen: " + guests);

        guests += 3;

        System.out.println("Anzahl der Gäste, die kommen: " + guests);
    }
}
