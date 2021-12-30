/*
Write a program that gets a number from the user and then inserts a space between each pair of digits. 
For example, if the input number is 1234, the output string should be 1 2 3 4.
*/
import java.util.*;
class Question
{
	public static void main(String args[])
	{
		Scanner ob = new Scanner(System.in);;
		//Taking input from the user
		System.out.print("Enter a number: ");
		int num = ob.nextInt();
		
		//Reversing the number
		int rev_num = 0;
        while (num > 0) {
			int d = num % 10;
            rev_num = rev_num * 10 + d;
            num = num / 10;
        }
		
				
		//Taking each digit and converting it into string
		String ans = "";
        while (rev_num > 0) {
            int d= rev_num % 10;
			ans += Integer.toString(d); //Now d will turn into String type
			ans += " "; //adding space to it
			
			/*
				Above two statements can be written in a single statement
				ans += Integer.toString(d) + " ";
			*/
            rev_num = rev_num / 10;
        }
		
		System.out.println("\nYour answer is:" + ans);
	}
}
