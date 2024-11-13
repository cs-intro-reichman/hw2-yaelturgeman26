// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
        String inputString = args[0];
        int repeatCount = Integer.parseInt(args[1]);
        String anLetters = "AEFHILMNORSX";
        for (int i = 0; i < inputString.length(); i++) {
                char letter = inputString.charAt(i);
                String article;
            if (anLetters.indexOf(letter) != -1) {
                article = "an";
            } else {
                article = "a";
            }
            System.out.println("Give me " + article + " " + letter + ": " + letter + "!");
            System.out.println("What does that spell?");
        }
        for (int i = 0; i < repeatCount; i++) {
            System.out.println(inputString + "!!!");
        }
}
}
