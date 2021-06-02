import java.util.Scanner;

public class ControlFlowExercises {

    public static void main(String[] args) {

//        int i = 5;
//        while (i < 15) {
//            System.out.println(i);
//            i++;
//        }


//        int j = 0;
//        do {
//            System.out.println(j);
//            j+=2;
//        } while (j <= 100);
//        int j = 100;
//        do {
//            System.out.println(j);
//            j-=5;
//        } while (j >= -10);

//        for (int i = 5; i < 15; i++) {
//            System.out.println(i);
//        }
//
//        for (int j=100; j>=-10; j-=5) {
//            System.out.println(j);
//        }

        //fizzbuzz
//        int j=1;
//        do {
//            if (j % 3 == 0 && j % 5 == 0) {
//                System.out.println("FizzBuzz");
//            } else if (j % 3 == 0) {
//                System.out.println("Fizz");
//            } else if (j % 5 == 0) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println(j);
//            }
//            j++;
//        }
//        while (j<=100);
    }

        Scanner sc = new Scanner(System.in);
        boolean userContinue = true;
        do {
            System.out.printf("What number would you like to go up to?\n");
            int userInt = sc.nextInt();
            String leftAlignFormat = "%-8d | %-9d | %-4d %n";
            System.out.printf("Here is your table!%n");
            System.out.format("number   | squared   | cubed   %n");
            System.out.format("------   | -------   | -----   %n");
            for (int i = 1; i <= userInt; i++) {
                System.out.format(leftAlignFormat, i, i * i, i * i * i);
            }

            System.out.print("Would you like to continue (y/n)");
            String userResponse = sc.next();
            if (!userResponse.equalsIgnoreCase("y")) {
                 userContinue = false;
            }
        } while (userContinue);

}
