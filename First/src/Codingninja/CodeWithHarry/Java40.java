package CodeWithHarry;
class MyEmployee{
   private int id;
   private String name;
   public String getName(){
       return name;
   }
   public void setName(String n){
       name=n;
   }
   public void setId(int n){
       id=n;
   }
   public int getId(){
       return id;
   }

}
public class Java40 {
    public static void main(String[] args) {
        MyEmployee emp=new MyEmployee();
        emp.setName("Amrit");
        emp.setId(20);
        //emp.getId();
        System.out.println(emp.getName());
        System.out.println(emp.getId());

    }
}
