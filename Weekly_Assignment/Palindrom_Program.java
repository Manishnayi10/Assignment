package Java_Assignment_2;

public class Palindrom_Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	  int num=1;
	  int original=num;
	  int count=0; 
	  int reverse=0;
	  for(;num>0;)
	  {
		  int Lastdigit = num %10;
		  reverse = reverse * 10 + Lastdigit;
		  num = num /10;
		  count++;
		  
	  }
	  System.out.println("Reverse:"+reverse); 
	  
	  if(original == reverse)
		  System.out.println("Palindrome");
	  else 
		  System.out.println("Not Palindrome");
	  System.out.println("Number of digits:"+count); 
	}  

}
