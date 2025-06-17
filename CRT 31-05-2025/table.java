import java.util.*;
public class Table {
    public static void main(String[] args) {
        Scanner sin=new Scanner(System.in);
        System.out.println("Enter the table value:");
        int num = sin.nextInt();
        for(int i=1; i<=10; i++) {
            System.out.println(num + " X " + i + " = " + (num*i));
        }
    }
}