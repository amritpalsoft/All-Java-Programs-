package oopsAndStacks;

public class Constructor {
    public static void main(String[] args) {
        //here we are creating c4 with constructor so
        //we don't have to use setName(),setModel()
        Car c4=new Car(2020,"bmw");

        System.out.println(c4.getName());
    }
}
