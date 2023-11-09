package javaprograms;

import java.util.Scanner;

/*
8. Display right angle triangle of @ using nested for loops
@
@@
@@@
@@@@
@@@@@
 */
public class Question08 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of Rows: ");
        int rows = scanner.nextInt();

        for (int i=1; i<=rows;i++){
            for (int j =1; j<=i;j++){
                System.out.print("@");
            }
            System.out.println(" ");
        }
    }
}
