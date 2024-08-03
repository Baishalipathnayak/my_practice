package ex_07212024;

import java.sql.SQLOutput;
import java.util.Scanner;
public class lab027 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age= sc.nextInt();

        if(age>=18)
        {
            System.out.println("You can vote as per rule " +age);
        }
        else
        {
            System.out.println("No Go home");
        }



    }
}
