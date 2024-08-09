package lab07272024;


import java.util.Scanner;
public class salary {
    public static void main(String[] args) {
        int[] salary=new int[6];
        int max=0;
        int smax=0;
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<salary.length;i++)
        {
            System.out.println("Enter salaries");
            salary[i]=sc.nextInt();
            for (int j=0;j<salary.length;j++)
            {
                if (salary[j]>max) {
                    smax=max;
                    max=salary[j];

                }
                else if(salary[j]>smax && salary[j]!=max)
                {
                    smax=salary[j];
                }
            }

        }
        System.out.println(max);
        System.out.println(smax);

    }
}
