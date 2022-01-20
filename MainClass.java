package constructor.overloading;

public class MainClass extends ParentClass{
    public MainClass(){
        //this(10,20);
        super(100);
        System.out.println("Hi I am constructor");
    }
    public MainClass(int a){
        System.out.println("Value of a "+a);
    }
    public MainClass(int a, int b){
        System.out.println("Value of a "+a);
        System.out.println("Value of b " +b);
    }

    public static void main(String[] args) {
        MainClass mainClass = new MainClass();
    }
}
