package com.amritpal;
 class Circle2{
    private int radius;
    public void setRadius(int i){
        radius=i;

    }
    public void getRadius(){
    }
    public double area(){
        return Math.PI*radius*radius;
    }

}
public class Circle {
    public static void main(String[] args) {
        Circle2 obj=new Circle2();
     //   obj.radius=5;
        obj.setRadius(5);
        obj.getRadius();
        System.out.println(obj.area());
    }
}
