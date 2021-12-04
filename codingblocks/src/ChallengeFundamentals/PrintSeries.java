package ChallengeFundamentals;
import java.util.Scanner;
public class PrintSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N1 = sc.nextInt();
        int N2 = sc.nextInt();
        if (N1 > 0 && N1 < 100 && N2 > 0 && N2 < 100) {
            for (int i = 1; i <=N1 ; i++) {
                if ((3 * i + 2) % N2 == 0) {
                    N1=N1+1;
                    continue;

                } else {
                    System.out.println(3 * i + 2);
                }
            }
        }
      }
    }

