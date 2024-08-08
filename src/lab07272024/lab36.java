package lab07272024;

import java.util.Scanner;
public class lab36 {
    public static void main(String[] args) {
        float sub[]=new float[5];
        float total=0;
        float avg=0;
        //Scanner sc=new Scanner(System.in);
        for(int i=0; i<sub.length;i++)
        {
            System.out.println("enter mark of sub "+(i+1));
            Scanner sc=new Scanner(System.in);
            //sub[i]= sc.nextFloat();
            sub[i]= sc.nextFloat();
            total= total+sub[i];
        }
        System.out.println(total);
        System.out.println(total/sub.length);

    }
}
