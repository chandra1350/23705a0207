import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sin=new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int n = sin.nextInt();
        for(int i=1; i<=n; i++) {
            System.out.println();
            for(int j=1; j<=i; j++) {
                
                System.out.print("*");
            }
        }
    }
}