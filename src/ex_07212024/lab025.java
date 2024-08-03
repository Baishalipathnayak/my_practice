package ex_07212024;

import java.util.Scanner;
public class lab025 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // obect of the scanner Class - OOPs
        System.out.println("Enter the number");
        int user_input = sc.nextInt();

        //System.out.println(user_input);

        if(user_input%2==0){
            System.out.println("Even number " +user_input);
        }else {
            System.out.println("Odd number " +user_input);
        }


    }
}
