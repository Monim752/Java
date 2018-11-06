
package firstjavaclass;
import java.util.Scanner;
public class NumberToString {
    public static String amountInWords(int num)
    {
        String[] units = { "", "One", "Two", "Three", "Four","Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve","Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen","Eighteen", "Nineteen" };
        String[] tens = { 
		"",
		"",	
		"Twenty", 	
		"Thirty", 	
		"Forty", 	
		"Fifty", 	
		"Sixty", 	
		"Seventy",	
		"Eighty", 	
		"Ninety"};
       while(num!=-1)
       {
           if(num<20)
               return units[num];
	   if(num<100)
	       return tens[num/10] + " " + units[num % 10];
	   if(num<1000)
	       return units[num/100] + " Hundred " + tens[(num%100)/10]+ " "+units[(num%100)%10];
           if (num < 100000)
		return units[num/1000] + " Thousand " + units[(num % 1000)/100]+" Hundred "+tens[((num%1000)%100)/10]+" "+units[((num%1000)%100)%10];
       }   
        return null;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
         System.out.println("Enter Number(<10000): ");
        int n=input.nextInt();
        System.out.println(amountInWords(n));
    }
}
 

