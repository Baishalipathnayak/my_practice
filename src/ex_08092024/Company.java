package ex_08092024;

public class Company {
    String name;
    int empid;

    Company()//this is a default constructor
    {
        System.out.println("A Object is created");
    }
    Company(String empname)//here is giving parameter to name
    {
        this.name=empname;
    }
    Company(String empname, int empidnumber)
    {
        this.name=empname;
        this.empid=empidnumber;
    }

}
