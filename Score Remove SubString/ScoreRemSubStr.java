import java.util.*;
import java.io.*;


// Remove substring "ab" and gain x points.
// For example, when removing "ab" from "cabxbae" it becomes "cxbae".
// Remove substring "ba" and gain y points.
// For example, when removing "ba" from "cabxbae" it becomes "cabxe"
public class ScoreRemSubStr
{
 public static void main(String[] args)
 {
  Scanner input = new Scanner(System.in);
  System.out.println("Enter word: ");
  String word = input.nextLine();
  
  System.out.println("Enter x: ");
  int num1 = input.nextInt();
   
  System.out.println("Enter y: ");
  int num2 = input.nextInt();
  
  int score = maximumGain(word, num1, num2);
  System.out.println(score);

 }
 
  public static int maximumGain(String s, int x, int y)
   {
      int points =0;
      int len = s.length();
      for( int i=0; i<len-1; i++)
      {
       if (s.charAt(i)=='b' & s.charAt(i+1)=='a')
       {
        points=points+y;
        String first = s.substring(0,i);
        String second = s.substring(i+2);
        s= first+second;
        i=0;
        len = s.length();
       }
       
       else if (s.charAt(i)=='a' & s.charAt(i+1)=='b')
       {
        points=points+x;
        String first = s.substring(0,i);
        String second = s.substring(i+2);
        s= first+second;
        i=0;
        len = s.length();
       }


      }
      
      return points;
    }

}