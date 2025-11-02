import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Rock_Paper_Scissors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        String[] options = {"stone", "paper", "scissors"};
        int count = 1;
        while (true) {
            System.out.print("Enter your choice (stone, paper, scissors): ");
            String choice = input.nextLine().toLowerCase();

            if (!Arrays.asList(options).contains(choice)) {
                System.out.println("Invalid choice! Try again.");
                continue;
            }

            String computer = options[random.nextInt(3)];
            System.out.println("Computer chose: " + computer);

            if (choice.equals(computer)) {
                System.out.println("It's a tie!");
            } else if ((choice.equals("stone")   && computer.equals("scissors")) ||  (choice.equals("scissors")   && computer.equals("paper")) ||   (choice.equals("paper")   && computer.equals("stone"))) {
                System.out.println("You win!");
            } else {
                System.out.println("You lose!");
            }
            if (count == 10) break;
            count++;

        }
        input.close();
        
    }
}

