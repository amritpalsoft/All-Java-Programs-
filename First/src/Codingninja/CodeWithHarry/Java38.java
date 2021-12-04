package CodeWithHarry;
 class Employee{
    int id;
    int salary;
    String name;
    public void printDetails(){
        System.out.println("The id is "+id);
        System.out.println("The name is "+name);
    }
    public int getSalary() {
        return salary;
    }
    }
        public class Java38 {
    public static void main(String[] args) {
        Employee amrit=new Employee(); //instantiating a new object
        Employee amit=new Employee();

        // Setting properties
        amrit.id=20;
        amrit.name= "amrit pal";
        amrit.salary=100000;
        amit.id=23;
        amit.name="Amit";
        amit.salary=20000;
        //System.out.println(amrit.id);
        //System.out.println(amrit.name);
        amrit.printDetails();
      //  amit.printDetails();
        amrit.getSalary();
        System.out.println("The salary is "+amrit.getSalary());

    }
}
