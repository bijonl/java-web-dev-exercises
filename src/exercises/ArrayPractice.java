package exercises;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] nums = {1,1,2,3,5,8};
        String sentence  = "I would not, could not, in a box. "+
                "I would not, could not with a fox. "+
                "I will not eat them in a house. " +
                "I will not each them with a mouse.";
        String[] arr = sentence.split(" ");
        System.out.println(Arrays.toString(arr));

        for(int i = 0; i<nums.length;i++){
            if(nums[i] % 2 != 0) {
                System.out.println(nums[i]);
            }

        }

    }
}
