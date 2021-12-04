package CodeWith;

public class Array {
        public static void main(String[] args) {
            int[] marks = new int[5];
            marks[0] = 5;
            marks[1] = 15;
            marks[2] = 88;
            marks[3] = 55;
            marks[4] = 87;
            int no = 88;
            for (int i = 0; i < marks.length; i++) {
                if (no == marks[i]) {

                    System.out.println("Number present");
                    break;
                }

            }
        }

    }
