package lab07272024;

public class lab33 {
    public static void main(String[] args) {
        final int[] ages= new int[4];
        ages[3]=78;
        //System.out.println(ages[3]);
        final int a=60;
        //a= 90; can not assign value to a final variable error
        System.out.println(a+" "+ages[3]);
    }
}
