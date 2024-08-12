package Encapsulation;

public class lab50 {
    public static void main(String[] args) {

        hdfcbank user1 = new hdfcbank("amit", 100);
        System.out.println(user1.getUsername());
        System.out.println(user1.getBalance());
       // user1.setUsername("Amit Mohanty");//before authentication
        user1.setUsername("amit",false);
        user1.setBalance(200,false);

        hdfcbank user2 = new hdfcbank("Admin", 1000000);
        System.out.println(user2.getUsername());
        user2.setUsername("AdminUser",true);
        System.out.println(user2.getUsername());
        System.out.println(user2.getBalance());
        user2.setBalance(20000,true);
        System.out.println(user2.getBalance());


    }

}