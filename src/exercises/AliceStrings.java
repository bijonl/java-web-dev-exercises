package exercises;

import java.util.Scanner;

public class AliceStrings {

    public static void main(String[] args){
        String alice = "Alice was beginning to get very tired of sitting " +
                "by her sister on the bank, and of having nothing to do: " +
                "once or twice she had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it, " +
                "'and what is the use of a book,' thought Alice" +
                "without pictures or conversation?'"
                ;
        String newAlice;
        Scanner input;
        String searchTerm;
        int index;
        int length;

        input = new Scanner(System.in);
        System.out.println("What word are you looking for?");
        searchTerm = input.nextLine();
        System.out.println(alice.toLowerCase().contains(searchTerm.toLowerCase()));
        index = alice.toLowerCase().indexOf(searchTerm.toLowerCase());
        length = searchTerm.length();
        System.out.println(searchTerm + " has an index of " + index);
        System.out.println(searchTerm + " has a length of " + searchTerm.length());
        newAlice = alice.substring(0,index) + alice.substring(index+length,alice.length());
        System.out.println(newAlice);





    }
}


