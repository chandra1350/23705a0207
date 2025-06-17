import java.util.*;
public class Main {
    public static void main(String[] args) {
        int[] array = {4,6,8,9,20,15,12,1};
        int i,k,j;
        for(int i=1; i<nums.length; i++) {
            int key = nums[i];
            int j = i-1;
            while(j>=0 && nums[j]>key) {
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = keys;
        }
    } 
    }