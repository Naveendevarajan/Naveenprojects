package PrintNumbersInWords;
import java.util.Scanner;
public class NumbersIntoWords {
    public void checkNumbers(int valueofnumber, String suffix) {
            String[] singleanddoubledigits = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
            String[] tens = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
            if (valueofnumber > 19) {
                System.out.print(tens[valueofnumber / 10] + " " + singleanddoubledigits[valueofnumber % 10]);
            } else {
                System.out.print(singleanddoubledigits[valueofnumber]);
            }
            if (valueofnumber > 0) {
                System.out.print(suffix);
            }
        }
        public void convertToWords(int number) {
            if (number / 100000 > 0) {
                checkNumbers(number / 100000, " Lakh ");
                number =number% 100000;
            }
            if (number / 1000 > 0) {
                checkNumbers(number / 1000, " Thousand ");
                number %= 1000;
            }
            if (number / 100 > 0) {
                checkNumbers(number / 100, " Hundred ");
                number %= 100;
            }
            if (number > 0) {
                checkNumbers(number, "");
            }
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a number to be changed into words:");
            int numbertobechanged = scanner.nextInt();
            NumbersIntoWords numbersIntoWords = new NumbersIntoWords();
            if (numbertobechanged > 100000 || numbertobechanged <= 0) {
                System.out.print("Enter number wihin 1 to one lakh");

            } else {
                numbersIntoWords.convertToWords(numbertobechanged);
            }
        }
    }


