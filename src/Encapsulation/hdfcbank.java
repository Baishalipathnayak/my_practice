package Encapsulation;

public class hdfcbank {

   private String username;
    private int balance;

    public hdfcbank(String username, int balance) {
        this.username = username;
        this.balance = balance;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username,boolean isAdmin) {
        if(isAdmin)
        {
            this.username = username;
            System.out.println("Admin made the changes");
        }
        else
        {
            System.out.println("You are not allowed to changes username");
        }
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance, boolean isAdmin) {
        if(isAdmin)
        {
            this.balance = balance;
            System.out.println("Admin made the changes");
        }
        else
        {
            System.out.println("You are not allowed to change balance details");
        }
    }
}
