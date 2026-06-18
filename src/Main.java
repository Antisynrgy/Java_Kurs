public class Main {
    public static void main(String[] args) {
        //Übung: Alter > 18 --> Volljährig, sonst Minderjährig
        int number = 19;
        boolean Alter = (number >= 18);
        if (Alter) {
            System.out.println("Volljährig");
        } else {
            System.out.println("Minderjährig");
        }

    }
}
