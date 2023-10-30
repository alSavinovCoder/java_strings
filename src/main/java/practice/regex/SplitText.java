package practice.regex;

public class SplitText {

  public static void main(String[] args) {

  }

  public static String splitTextIntoWords(String text) {
    if (text.isEmpty()) {
      return "";
    } else {
      return text.replaceAll("-", " ")
              .replaceAll("\\p{Punct}|[0-9]+", "")
              .replaceAll("\\s+", "\n");
    }
  }
}





