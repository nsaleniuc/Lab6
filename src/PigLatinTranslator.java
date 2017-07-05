import java.util.Scanner;

/**
 * Created by Nathan Saleniuc on 6/30/2017.
 */
public class PigLatinTranslator {
    public static void main(String[] args) {
        //1. Display welcome message
        System.out.println("Welcome to the Pig Latin Translator! \n");

        String cont = "y";
        while (cont.equalsIgnoreCase("y")) {
            //2. Prompt for user input
            System.out.println("Enter a line to be translated: ");

            //3. Get user input
            Scanner scan = new Scanner(System.in);
            String userInput = scan.nextLine();

            //4. Translate user input
            //4.1 convert to lowercase
            userInput = userInput.toLowerCase();
            String result;

            if (isVowels(userInput)) {//vowels
                result = translatedVowels(userInput);
            } else {// consonant
                result = translatedConsonants(userInput);
                userInput.
            }

            //5. Display result
            System.out.println(result);

            System.out.println("Enter another word? y/n");
            cont = scan.nextLine();
        }
        System.out.println("Goodbye!");

        //6. Prompt user to try again

    }

    /*
    * Translates a word using consonant pig latin logic
    * */
    private static String translatedConsonants(String userInput) {
        String wordEnding = null;
        String newWord = null;
        if (!(userInput.charAt(0) == 'a' || userInput.charAt(0) == 'e' ||
                userInput.charAt(0) == 'i' || userInput.charAt(0) == 'o' || userInput.charAt(0) == 'u')) {
            wordEnding = userInput.substring(0, 1) + "ay";
            newWord = userInput.substring(1).concat(wordEnding);

            if (!(userInput.charAt(1) == 'a' || userInput.charAt(1) == 'e' ||
                    userInput.charAt(1) == 'i' || userInput.charAt(1) == 'o' || userInput.charAt(1) == 'u')) {
                wordEnding = userInput.substring(0, 2) + "ay";
                newWord = userInput.substring(2).concat(wordEnding);

                if (!(userInput.charAt(2) == 'a' || userInput.charAt(2) == 'e' ||
                        userInput.charAt(2) == 'i' || userInput.charAt(2) == 'o' || userInput.charAt(2) == 'u')) {
                    wordEnding = userInput.substring(0, 3) + "ay";
                    newWord = userInput.substring(3).concat(wordEnding);
                }
            }
        }
            userInput = newWord;
            return userInput;
        }

    /*
    * Translates a word using vowel pig latin logic
    * */

    private static String translatedVowels(String userInput) {
        if (true) {
            userInput = userInput.concat("way");
        }
        return userInput;
    }
    /*
    *Determines if a word starts with a vowel or consonant
     *  */

    private static boolean isVowels(String userInput) {
        if (userInput.charAt(0) == 'a' || userInput.charAt(0) == 'e' ||
                userInput.charAt(0) == 'i' || userInput.charAt(0) == 'o' || userInput.charAt(0) == 'u') {
            return true;
        }

        return false;
    }

}
