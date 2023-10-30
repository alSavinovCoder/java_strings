package practice.string;

public class SequentialWordsNumbers {

    public static String sequentialWordsNumbers(String text){
        StringBuilder newString = new StringBuilder("");
        int numberOfSpaceBar = 1;

        if (!(text.length() <= 1)) {
            newString.append("(" + numberOfSpaceBar + ") ");

            for (int i = 0; i < text.length(); i++) {
                Character currentChar = text.charAt(i);
                if (currentChar == ' ') {
                    numberOfSpaceBar++;
                    newString.append(currentChar + "(" + numberOfSpaceBar + ")");
                }

                newString.append(currentChar);
            }
        }
        String finalNewString = String.valueOf(newString);
        return finalNewString;
    }
}
