package javaprograms;

import java.util.Scanner;

/*
15. Display left angle triangle of * using nested for loops
*
* *
* * *
* * * *
* * * * *
 */
public class Question15 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        for (int i =1; i<=number; i++){
            for (int j =1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
