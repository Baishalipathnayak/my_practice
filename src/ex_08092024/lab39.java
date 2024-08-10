package ex_08092024;

public class lab39 {
    public static void main(String[] args) {
        Bank bank1=new Bank();
        Bank bank2=new Bank();

        bank1.name= "SBI";
        bank2.name= "HDFC";
        bank1.Balance=25000;
        bank2.Balance=95000;


        System.out.println(bank1.name);
        if(bank1.Balance > bank2.Balance)
        {
            System.out.println(bank1.name+" has more balance");

        }
        else {
            System.out.println(bank2.name+" has more balance");
        }
    }
}
