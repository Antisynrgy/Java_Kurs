import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        String letters = "ABCDEFGGHIJKLMNOPQRSTUVWXYZ";
        String word = "";
        for (int i = 0; i < 5; i++) {
          int stelle = random.nextInt(26);
          word += letters.charAt(stelle);

        }
        System.out.println(word);
    }
}