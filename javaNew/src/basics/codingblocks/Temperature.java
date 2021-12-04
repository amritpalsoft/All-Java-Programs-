package basics.codingblocks;

public class Temperature {
    public static void main(String[] args) {

        for(int tminf=0;tminf<=300;tminf=tminf+20){
            int tcelcius= (int) ((5d/9d)*(tminf-32));
            System.out.print(tminf);
            System.out.print("   ");
            System.out.println(tcelcius);
            System.out.println();
        }


    }
}
