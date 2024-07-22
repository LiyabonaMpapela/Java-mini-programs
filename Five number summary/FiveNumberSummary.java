import java.util.*;
//find the mean, median, average, minimum and maximum of values rounded off to two decimal places  
public class FiveNumberSummary
{
 public static void main( String[] args)
 {
 
  Scanner input = new Scanner(System.in);
  System.out.println("Enter a sequence of numbers separated by a space");
  String numbers = input.nextLine();
  String[] strNum = numbers.split(" ");
  
  //creating an array to store the numbers in integer form
  double[] intNum =  new double[strNum.length];
  
  for (int i=0; i<strNum.length; i++)
  {
    intNum[i] = Double.parseDouble(strNum[i]);
  }
  
  //calculating minimum
  double min = Double.POSITIVE_INFINITY;
  
  for (int i=0; i< intNum.length; i++)
  {
  
   if (intNum[i] < min)
    min = intNum[i];
    
  }
  
  //Calculatimg maximum

  double max = Double.NEGATIVE_INFINITY;
  
  for (int i=0; i< intNum.length; i++)
  {
  
   if (intNum[i] > max)
    max = intNum[i];
    
  }

  
  //Calculating mode
 ArrayList<Double> mode = new  ArrayList<Double>();
 Arrays.sort(intNum);
 
 
double maxCount = Double.NEGATIVE_INFINITY;
int count =0;
 
for ( int i=0; i<intNum.length; i++)
{
 for ( int j=0; j<intNum.length; j++)
 {
  if (intNum[i]==intNum[j])
  {
   count++;
  }
 }
 
 if (count > maxCount)
 {
  mode.clear();
  mode.add(intNum[i]) ;
  maxCount=count;
 }
 else  if ((count==maxCount) & (mode.contains(intNum[i]) == false))
 {
  mode.add(intNum[i]) ;
 }

 count=0;

}


 
   
  
  //Calcutaling median
   //First sort
   Arrays.sort(intNum);
  double half = intNum.length/2.0;
  double median=0;
  if (intNum.length % 2 == 0) 
  {
     median = (intNum[(int)Math.round(half)-1] +intNum[(int)Math.round(half+1)-1])/2;
  }
  else if (intNum.length%2 != 0)
    median = intNum[(int)Math.round(half)-1];  
 
   
   
   
  
  
  
  //Calculating average 
  double sum=0;
  
  for (int i=0; i< intNum.length; i++)
  {
   sum = sum+intNum[i]; 
  }
  
  double ave = sum/intNum.length;

  


System.out.printf("Five number summary :\nMinimum = %.2f\nMedian =  %.2f\nMaximum=  %.2f \nAverage = %.2f ",min,median,max,ave);
System.out.println("");
System.out.print("Mode = ");
for(double i : mode)
{
 System.out.printf("%.2f ",i);
}











 }

}