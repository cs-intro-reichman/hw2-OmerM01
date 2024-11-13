// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
                String word = args[0];
                word = word.toUpperCase();
                int num = Integer.parseInt(args[1]);
                String an = " a";
                String specialChars = "AEFHILMNORSX";
                for(int i = 0; i < word.length(); i++){
                       for(int j = 0; j < specialChars.length(); j++){
                                if(specialChars.charAt(j) == word.charAt(i)){
                                        an = "an";
                                }
                       }
                        System.out.println("Give me " + an + " " + word.charAt(i) + ":  " + word.charAt(i) + "!");
                        an = " a";
                }
                System.out.println("What does that spell?");
                for(int i = 0; i < num; i++){
                        System.out.println(word + "!!!");
                }

        }
}
