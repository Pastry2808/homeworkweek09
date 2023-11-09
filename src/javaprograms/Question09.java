package javaprograms;

import java.util.Scanner;

/*
9. Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
 */
public class Question09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int count = scanner.nextInt();
        int num1 =0;
        int num2 =1;
        int num3;


        System.out.print("Fibonacci series: "+num1+" "+num2);
        for (int i =0; i<=count; i++){
            num3 = num1+num2;
            System.out.print(" "+num3);
            num1 =num2;
            num2 =num3;
        }
    }
}

