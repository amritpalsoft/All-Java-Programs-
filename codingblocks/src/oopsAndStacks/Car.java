/*here we are creating a class Car in which 2 properties are defined i.e.
* name of the car and model of the car
* But we are making these variable as private, so they can't can be accessible outside
* this class
*
* So to make them accessible outside this class we have to make function which
* allow other Classes to get name, set name, get model, set model
*
* we can manually create these functions or use getters and setters
* just right click on variable for which getters is required and click
* Refactor item and the Encapsulate field
*
* As we have two objects so we created getters() and setters() for them
* but what if we have 1000's of objects
*
* Here comes into picture, concept of constructor
* Every time an object is created it is created with constructor
*
* Constructors: initialise the instance variable of particular object
*             : have no return type, not even void
*             : are of same name as our class,
*             : look like function only*/


package oopsAndStacks;

public class Car {
    private String name;
    private int model;

    //constructor without parameter
    public Car(){
        System.out.println("constructor with params");
    }

    //constructor with parameter
    public Car(int model,String name){
        this.model=model;
        this.name=name;
    }

    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }
}
