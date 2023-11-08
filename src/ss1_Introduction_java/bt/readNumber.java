package ss1_Introduction_java.bt;
import java.util.Scanner;
public class readNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số cần đọc: ");
        int number = scanner.nextInt();
        scanner.close();

        if (number >= 0 && number < 10) {
            switch (number) {
                case 0:
                    System.out.println("zero");
                    break;
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3:
                    System.out.println("three");
                    break;
                case 4:
                    System.out.println("four");
                    break;
                case 5:
                    System.out.println("five");
                    break;
                case 6:
                    System.out.println("six");
                    break;
                case 7:
                    System.out.println("seven");
                    break;
                case 8:
                    System.out.println("eight");
                    break;
                case 9:
                    System.out.println("nine");
                    break;
                default:
                    System.out.println("out of ability");
                    break;
            }
        } else if (number >= 10 && number < 20) {
            int ones = number % 10;
            String numberString;
            switch (ones) {
                case 0:
                    numberString = "ten";
                    break;
                case 1:
                    numberString = "eleven";
                    break;
                case 2:
                    numberString = "twelve";
                    break;
                case 3:
                    numberString = "thirteen";
                    break;
                case 4:
                    numberString = "fourteen";
                    break;
                case 5:
                    numberString = "fifteen";
                    break;
                case 6:
                    numberString = "sixteen";
                    break;
                case 7:
                    numberString = "seventeen";
                    break;
                case 8:
                    numberString = "eighteen";
                    break;
                case 9:
                    numberString = "nineteen";
                    break;
                default:
                    numberString = "out of ability";
                    break;
            }
            System.out.println(numberString);
        } else if (number >= 20 && number < 100) {
            int tens = number / 10;
            int ones = number % 10;
            String tensString;
            String onesString;
            switch (tens) {
                case 2:
                    tensString = "twenty";
                    break;
                case 3:
                    tensString = "thirty";
                    break;
                case 4:
                    tensString = "forty";
                    break;
                case 5:
                    tensString = "fifty";
                    break;
                case 6:
                    tensString = "sixty";
                    break;
                case 7:
                    tensString = "seventy";
                    break;
                case 8:
                    tensString = "eighty";
                    break;
                case 9:
                    tensString = "ninety";
                    break;
                default:
                    tensString = "out of ability";
                    break;
            }
        }
    }
}