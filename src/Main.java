public class Main {
    public static void main(String[] args) {
        int counter = 10;
        boolean weiter = true;
        while(weiter) {
            System.out.println("Der Counter steht bei " + counter);
            counter--;
            if (counter < 0) {
                weiter = false;
            }
        }
        System.out.println("Programm beendet");
    }
}