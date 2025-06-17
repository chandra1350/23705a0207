import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sin= new Scanner(System.in);
        System.out.println("Enter the prime number");
        int factors=0;
        int n = sin.nextInt();
        for(int i=1; i<=n; i++) {
            if(n%i==0)  {
            factors++;
            }
        }
        if(factors==2) {
            System.out.println("Prime");
        }
        else {
            System.out.println("not prime");
        }
    }
}