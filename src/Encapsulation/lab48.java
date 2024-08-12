package Encapsulation;
//without encapsulation making atribute public
public class lab48 {
    public static void main(String[] args) {
        laptoplogin user1=new laptoplogin("admin","password123");
        System.out.println(user1.password);
        user1.password="pwchanged456";
        System.out.println(user1.password);

    }


}
        class laptoplogin
{
public String username;
public String password;

    public laptoplogin(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
