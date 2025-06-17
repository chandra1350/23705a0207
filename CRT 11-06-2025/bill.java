import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sin=new Scanner(System.in);
        System.out.println("Enter the nmber of units :");
        System.out.println("Enter the total bill pay :");
        int units = sin.nextInt();
        int bill = sin.nextInt();
        if(units<100) {
            if(units<=200) {
                if(units<300) {
                    bill = units*5;
                }
                else {
                    bill = units*6;
                }
                else {
                    bill = units*8;
                }
                System.out.println("India Electricty Board");
                System.out.println("unts" + units);
                System.out.println("bill " + bill);
            }
        }
    }