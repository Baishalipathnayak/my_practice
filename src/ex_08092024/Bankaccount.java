package ex_08092024;

public class Bankaccount {
    String name;
    String bankcode;
    int balance;

    Bankaccount() {//Default CONSTRUCTOR
        name="SBI";
        bankcode="SBI001";
        balance=0;
    }
    Bankaccount(String bN,String bC,int bB)//3 PARAMETER CONSTRUCTOR
    {
        this.name=bN;
        this.bankcode=bC;
        this.balance=bB;
    }

    void printDetails()
    {
        System.out.println("Bank name--> "+name);
        System.out.println("Bank balance--> "+balance);
        System.out.println("Bank code--> "+bankcode);
    }
}
