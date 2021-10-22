import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    System.out.println("Welcome to the calculator!");
    boolean looping = true;
    while (looping) {
      Calculator calc = new Calculator();

      Scanner in = new Scanner(System.in);
      String input = in.nextLine();

      String[] inputArr = input.split(" ");

      if (inputArr[0].equals("add")) {
        int result = calc.add(Integer.parseInt(inputArr[1]), Integer.parseInt(inputArr[2]));
        System.out.println(result);
      } else if (inputArr[0].equals("subtract")) {
        int result = calc.subtract(Integer.parseInt(inputArr[1]), Integer.parseInt(inputArr[2]));
        System.out.println(result);
      } else if (inputArr[0].equals("multiply")) {
        int result = calc.multiply(Integer.parseInt(inputArr[1]), Integer.parseInt(inputArr[2]));
        System.out.println(result);
      } else if (inputArr[0].equals("divide")) {
        int result = calc.divide(Integer.parseInt(inputArr[1]), Integer.parseInt(inputArr[2]));
        System.out.println(result);
      } else if (inputArr[0].equals("fibonacciNumberFinder")) {
        int result = calc.fibonacciNumberFinder(Integer.parseInt(inputArr[1]));
        System.out.println(result);
      } else if (inputArr[0].equals("intToBinaryNumber")) {
        String result = calc.intToBinaryNumber(Integer.parseInt(inputArr[1]));
        System.out.println(result);
      } else if (inputArr[0].equals("xit")) {
        looping = false;
        System.out.println("Goodbye!");
      } else {
        System.out.println("Unrecognized action");
      }
    }
  }
}
