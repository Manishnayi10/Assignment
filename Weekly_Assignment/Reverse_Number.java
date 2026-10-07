package Java_Assignment_2;

public class Reverse_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int num = 12345;
	     int reverse = 0;
		for(;num>0;)
		{
			int lastdigit=num%10;
			reverse = reverse*10+lastdigit;
			num=num/10;

		}

		 System.out.println("Reverse = " + reverse); 
	} 

}

//-- How it works:- 

//-- 12345 % 10 = 5
//reverse = 0 * 10 + 5 = 5
//
//1234 % 10 = 4
//reverse = 5 * 10 + 4 = 54
//
//123 % 10 = 3
//reverse = 54 * 10 + 3 = 543
//
//12 % 10 = 2
//reverse = 543 * 10 + 2 = 5432
//
//1 % 10 = 1
//reverse = 5432 * 10 + 1 = 54321

//-- Key logics:-  

//int lastDigit = num % 10;
//reverse = reverse * 10 + lastDigit;
//num = num / 10;

