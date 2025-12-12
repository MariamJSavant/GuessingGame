import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Random random = new Random();
      Scanner scanner = new Scanner(System.in);

      int guess;
      int attempt = 0;
      int randomnumber = random.nextInt(1,101);
        System.out.println(randomnumber);
        System.out.println("NUMBER GUESSING GAME :)");
        System.out.println("ENTER A NUMBER FROM 1 TO 100");

        do {
            System.out.print("Enter a number: ");
            guess = scanner.nextInt();
            attempt++;

            if (guess > randomnumber){
                System.out.println("TO HIGH, try a smaller number");
            }else if (guess < randomnumber){
                System.out.println("TO LOW, try a higher number");
            }else {
                System.out.printf("Great the correct number is , %s \n ",randomnumber);
                System.out.printf("it took you  %d to get it",attempt);
            }

        }while (guess != randomnumber);
      scanner.close();
    }
}
