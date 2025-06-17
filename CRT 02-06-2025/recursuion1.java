import java.util.*;
public class Recurrsion {
    public static void main(String[] args) {
       Scanner sin=new Scanner(System.in);
       System.out.println("enter the sum of number:");
       int a = sin.nextInt();
         int result = sum(a);
        System.out.println(result);
    }
    public static int sum(int k) {
        if(k>0) {
            return k + sum(k-1);
            } else {
                    return 0;
                }
        }
    }


