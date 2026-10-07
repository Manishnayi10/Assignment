package Java_Assignment_2;

public class Program_Armstrong_4_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 1634;
		int originalNum = num ; 
		int armstrong = 0;
		
		while(num > 0)
		{
			 int lastDigit = num % 10;
			 armstrong = armstrong + (lastDigit * lastDigit * lastDigit * lastDigit);
			 num = num /10;
		} 
		
		 System.out.println(armstrong);  
		if(originalNum == armstrong)
		{
			System.out.println("it is an armstrong number");
		} 
		else 
		{
			System.out.println("it is not an armstrong number");
		}

	}
          

	}
