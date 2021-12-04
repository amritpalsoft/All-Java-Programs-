/*There are 4 type of Access Specifiers are Java
* i.Public ii.Private iii.Default iv.Protected
*
* Private--> visible inside same class
* Public--> visible everywhere
* Protected-->
* Default--> visible inside same package */

package oopsAndStacks;

public class AccessSpecifiers {
    public static void main(String[] args) {
        Car c1=new Car(); //new object c1 being created from Car class
        Car c2=new Car(); //new object c2 being created from Car class

        //as in Car class name & model variable are private
        // so we can't directly access them
        // so here we are using getters() and setters()

        c1.setName("Audi");
        c1.setModel(2020);

        c2.setName("Mercedes");
        c2.setModel(2021);

        System.out.println(c1.getName());
        System.out.println(c2.getName());
        System.out.println(c2.getModel());
        System.out.println(c1.getModel());
    }
}
