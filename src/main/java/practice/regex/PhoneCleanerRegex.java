package practice.regex;

import java.util.Scanner;

public class PhoneCleanerRegex {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    while (true) {
      String input = scanner.nextLine();
      if (input.equals("0")) {
        scanner.close();
        break;
      }
      // TODO:напишите ваш код тут, результат вывести в консоль.
      String regex = "\\D";
      String checkInput = input.replaceAll(regex, "");
      if (checkInput.length() == 10) {
        System.out.println("7" + checkInput);
      } else if (checkInput.length() != 11 ) {
        System.out.println("Неверный формат номера");
      } else if (checkInput.charAt(0) != '7' && checkInput.charAt(0) != '8') {
        System.out.println("Неверный формат номера");
      } else if (checkInput.charAt(0) == '8') {
        System.out.println(checkInput.replaceAll("8", "7"));
      } else {
        System.out.println(checkInput);
      }
      }
    }
  }


