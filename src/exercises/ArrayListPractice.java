package exercises;

import java.util.ArrayList;
import java.util.Scanner;
import exercises.AliceStrings;

public class ArrayListPractice {
    public static int sumOfEvens(ArrayList<Integer> nums){
        int sum = 0;
        for(int i=0; i<nums.size();i++){
            if(nums.get(i)%2==0){
                sum += nums.get(i);
            }
        }
        return sum;
    }
    public static void returnWords(String sentence,int wordLength) {
        String[] arr = sentence.split(" ");
        for(int i=0;i<arr.length;i++){
            if(arr[i].length()==wordLength){
                System.out.println(arr[i]);
            }
        }
    }
    public static void main(String[] args){
        ArrayList<Integer> sample = new ArrayList<>();
        Scanner input;
        int length;
        sample.add(2);
        sample.add(3);
        sample.add(4);
        sample.add(5);
        sample.add(6);
        sample.add(7);
        sample.add(8);
        sample.add(9);
        sample.add(10);
        sample.add(11);
        sample.add(12);
        System.out.println(sumOfEvens(sample));
        input = new Scanner(System.in);
        System.out.println("word length?");
        length = input.nextInt();
        String sampleSentence = "Lil Nat is reall great";
        returnWords(sampleSentence,length);
    }

}


