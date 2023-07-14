package nl.johanvanderklift;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int[] numbers = {1, 2, 3, 5, 6, 8, 9};

    System.out.println("Please enter the number you want to search for: ");
    int numberToSearch = scanner.nextInt();

    System.out.println(binarySearch(numbers, numberToSearch));
  }

  private static int binarySearch(int[] array, int number) {
    int leftPos = 0;
    int rightPos = array.length - 1;

    while (leftPos <= rightPos) {
      int midPosition = (leftPos + rightPos) / 2;
      int numberAtIndex = array[midPosition];

      if (numberAtIndex == number) {
        return midPosition;
      }

      if (numberAtIndex < number) {
        leftPos = midPosition + 1;
      } else {
        rightPos = midPosition - 1;
      }
    }

    return -1;
  }
}