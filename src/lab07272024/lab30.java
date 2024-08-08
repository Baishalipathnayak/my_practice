package lab07272024;


import java.util .Scanner;
public class lab30 {
    public static void main(String[] args) {
        int[] mark=new int[6];//setting the length of the arry
        /*System.out.println(mark[0]);
        System.out.println(mark[1]);
        System.out.println(mark[2]);
        System.out.println(mark[3]);
        System.out.println(mark[4]);
        System.out.println(mark[5]);*/
        //System.out.println(mark[6]);//index out of bound
        /*mark[0]=90;
        mark[1]=80;
        mark[ 2]=100;
        mark[3]=97;
        mark[4]=99;
        mark[5]=92;*/
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number");
        mark[0]=sc.nextInt();
        mark[1]=sc.nextInt();
        mark[2]=sc.nextInt();
        mark[3]=sc.nextInt();
        mark[4]=sc.nextInt();
        mark[5]=sc.nextInt();
        /*System.out.println(mark[0]);
        System.out.println(mark[1]);
        System.out.println(mark[2]);
        System.out.println(mark[3]);
        System.out.println(mark[4]);
        System.out.println(mark[5]);*/

        for (int i=0;i<mark.length;i++)
        {
            System.out.println(mark[i]);
        }

    }
}
