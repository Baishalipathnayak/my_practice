package polymorphism.polymorphism_runtime;

public class lab52 {
    public static void main(String[] args) {
        Dog d1=new Dog();
        d1.bark();
        hound h1= new hound();
        h1.bark();
        Dog h2= new hound();
        h2.bark();
    }
}
