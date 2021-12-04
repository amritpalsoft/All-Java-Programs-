/*So here we can see StringBuilder takes very
* less time for same amount of work*/
package stringbuilder.codingblocks;

public class StringBuilderPerformance {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        appendStringBuilder(1000000);
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    public static void appendStringBuilder(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            sb.append(i);
        }
    }
}
