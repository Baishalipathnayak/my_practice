package lab07272024;

import java.util.Scanner;
public class lab35 {
    public static void main(String[] args) {
        float avg[]=new float[5];
        System.out.println("enter the marks");
        Scanner sc= new Scanner(System.in);
        avg[0]= sc.nextFloat();
        avg[1]= sc.nextFloat();
        avg[2]= sc.nextFloat();
        avg[3]= sc.nextFloat();
        avg[4]= sc.nextFloat();
        float sum_avg=avg[0]+avg[1]+avg[2]+avg[3]+avg[4];
        float total_avg= sum_avg/avg.length;
        System.out.println(total_avg);


    }
}
