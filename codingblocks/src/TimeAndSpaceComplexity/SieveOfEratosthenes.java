/*Sieve Of Eratosthenes is a most efficient way to find prime number upto that number n
* it means if we give number=25, it will give all prime no upto 25

* * actually we have other ways to find prime no, but the way we used previously to
* find prime no by dividing all no by 2 gives us a time complexity of O(n)
*
* So we find out that for n numbers, if number is not divisble by (n/2) numbers
*  tab vo aage bhi divide nahi hoga
* ex. let no=25 to n/2=12, to hum khali 12 tak divide karenge agar 12 tak koi
* divide kar liya to prime nahi hoga, aur agar 12 tak kisi ne divide nahi kiya to aage bhi koi
* nahi karega
* par iska time complexity O(n/2) aaya jo ki O(n) hi hai
*
* uske baad humne sqrt(n) vala method use kiya
* ex. agar n=25 diya hai to sqrt(25)=5, so agar 5 divide nahi hua to aage bhi divide
* nahi hoga
* is method ka O(sqrt(n)) aaya jo previous se better hai
*
* but Sieve of Eratosthenes ka complexity O(n*log(log n)) jo ki bohot kam hai */
/*ye method agar n=25 diya hai to hum agar ek array banate hai 26 length ka kyoki array
* me 0 bhi include hota hai
* sab index me true daal dete hai
* phir usme 2 se leke 5 tak table chalate hai aur jo-jo kat jaata hai usko false
* kar dete and jo bachta hai vo prime hoga */
package TimeAndSpaceComplexity;

import java.util.Arrays;

public class SieveOfEratosthenes {
    public static void main(String[] args) {
        SOE(1000);
    }
    public static void SOE(int n){
        boolean[] prime=new boolean[n+1];
        //jab hum  boolean ka array banate hai to usme har index me false aa jaata hai
        //so Array.fill se hum true kar rahe hai
        Arrays.fill(prime,true);


        //bcz 0 and 1 are neiher prime nor composite
        prime[0]=prime[1]=false;



        //ye 2 ke table se 5 tak chalega kyoki 6*6 > 25 so loop terminates
        for (int table=2;table*table<=n;table++){
            //jab 2 ka table chalega tab 4 cancel ho jyega
            // so prime[4]=false ho jayega
            //isliye hum check karenge ki prime[table]==false ho to uska table na chale
            if (prime[table]==false){
                continue;
            }

            for (int multiplier=2;table*multiplier<=n;multiplier++){
                prime[table*multiplier]=false;
            }

        }


        for (int i=0;i< prime.length;i++){
            if (prime[i]){
                System.out.println(i);
            }
        }
    }
}
