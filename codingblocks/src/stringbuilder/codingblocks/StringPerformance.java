/*aS strings are immutable so when we   add any thing to it,
 then it does not change the string, but string gets copied to
 new location and then addition takes place and a new string
  is formed at new location so for large operation strings
  gives very bad performance so String Builder are used*/
package stringbuilder.codingblocks;

public class StringPerformance {
    public static void main(String[] args) {
        long start=System.currentTimeMillis();

        appendString(100000);
        long end=System.currentTimeMillis();
        System.out.println(end-start);
    }
    public static void appendString(int n){
        String s="";
        for(int i=1;i<=n;i++){
            s=s+i;
        }
    }
}
