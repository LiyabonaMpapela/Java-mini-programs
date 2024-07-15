import java.util.*;

public class WordCountString
{
 public static void main (String[] args)
 {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a word or Sentence :");
    String sen = input.nextLine();
    String[] words = sen.split(" ");
    int length = words.length;
    if (sen ==  "")
     System.out.println("The are 0 words");
    else if (length == 1) 
     System.out.println("There is 1 words");
    else
     System.out.println("The are "+ length +" words");
 
}






//Write a code to write the number in words






}