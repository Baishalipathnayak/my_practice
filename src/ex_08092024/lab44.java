package ex_08092024;

public class lab44 {
    public static void main(String[] args) {
        Company emp1=new Company();
        Company emp2=new Company();
        System.out.println(emp1.name);
        System.out.println(emp2.empid);
        Company emp3=new Company("Baishali");
        System.out.println(emp3.name);
        Company emp4=new Company("Ankita",100);
        System.out.println(emp4.name+" "+emp4.empid);



    }
}
