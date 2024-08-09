package lab07272024;

import java.util.Scanner;
public class lab37 {
    public static void main(String[] args) {
        int[] salary= new int[5];
        int max=1;
        for(int i=0;i<salary.length;i++)
        {
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter salary for person "+(i+1));
            salary[i]=sc.nextInt();
            if(salary[i]>max)
            {
                max=salary[i];
            }


        }
        System.out.println(max);
       //ystem.out.println(min);     // }
}
}