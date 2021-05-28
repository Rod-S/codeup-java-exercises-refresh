import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String[] args) {
        double pi = 3.14159;

        System.out.println("The value of pi is " + pi);

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an integer.");
        int userInt = sc.nextInt();
        System.out.println(userInt);
        //non-integer input will throw InputMismatchException
        System.out.println("Enter 3 words");
        String word1 = sc.nextLine();
        String word2 = sc.nextLine();
        String word3 = sc.nextLine();

        System.out.println(word1 + " " + word2 + " " + word3);
    }
}
