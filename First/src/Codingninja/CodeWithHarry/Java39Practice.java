package CodeWithHarry;
import java.lang.Math;
/*class rectangle{
    int l;
    int b;
    public int area(){
        return l*b;
    }
    public int perimeter(){
        return 2*(l+b);
    }
}*/
class circle{
    double radius;
    public double area(){
        return Math.PI*radius*radius;
    }
    public double perimeter(){
        return Math.PI*2*radius;
    }
}
public class Java39Practice {
   /* public static void main(String[] args) {
        rectangle rec=new rectangle();
        rec.l=5;
        rec.b=5;
        System.out.println(rec.area());
        System.out.println(rec.perimeter());
    }*/
   public static void main(String[] args) {
       circle c=new circle();
       c.radius=5;
       System.out.println(c.area());
       System.out.println(c.perimeter());
   }
}
