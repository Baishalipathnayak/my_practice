package polymorphism.superthiskeyword;

public class lab53 {
    public static void main(String[] args) {
        car c1= new car();
        c1.display();

    }


}
class vehicle{

    public int maxSpeed= 100;


    void display()
    {
        System.out.println("This is a vehicle");
    }
    void message()
    {
        System.out.println("Check vehicles to buy");
    }
}
class car extends vehicle{

    public int maxSpreed =300;
    void message()
    {
        System.out.println("Buy this Car");
    }
    @Override
    void display(){
        System.out.println("The car speed is-->"+this.maxSpreed);
        System.out.println("The vehicle speed is-->"+super.maxSpeed);
        super.message();
        this.message();
    }


}