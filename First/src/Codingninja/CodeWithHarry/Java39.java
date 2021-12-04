package CodeWithHarry;
class Employee1{
    int salary;
    String name;
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name=n;
    }
}

public class Java39 {
    public static void main(String[] args) {
        Employee1 amrit=new Employee1();
        amrit.salary=100000;
        amrit.setName("Amrit");
        System.out.println("Name is "+ amrit.getName());
        System.out.println("The salary is "+ amrit.getSalary());
    }
}
