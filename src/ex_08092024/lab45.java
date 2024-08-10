package ex_08092024;


import java.util.Scanner;
public class lab45 {
    public static void main(String[] args) {

        Bankaccount b1= new Bankaccount();
        /*System.out.println(b1.name);
        System.out.println(b1.bankcode);
        System.out.println(b1.balance);*/
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Bank name");
        String bName= sc.next();
        System.out.println("Enter Bank code");
        String bCode=sc.next();
        System.out.println("Enter Bank balance");
        int bBal=sc.nextInt();
        Bankaccount b2=new Bankaccount(bName,bCode,bBal);
       // System.out.println(b2.name);
       // System.out.println(b2.bankcode);
        //System.out.println(b2.balance);
        b2.printDetails();





    }
}
