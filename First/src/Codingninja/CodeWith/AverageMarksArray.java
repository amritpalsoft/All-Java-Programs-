package CodeWith;

public class AverageMarksArray {
    public static void main(String[] args) {
        float [] marks={70,80,77,95,82};
        float avg;
        float sum=0;
        for(float element:marks){
            sum=sum+element;
        }
        avg=sum/5;
        System.out.println("The average marks are "+avg);
    }
}
