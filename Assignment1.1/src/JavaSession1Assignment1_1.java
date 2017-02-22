
// Write a program to print the sum of two numbers without using + operator. Other operators have to be used.

public class JavaSession1Assignment1_1 {
	
	 
public static void main (String[] args) 
    
    {

	Sum S1 = new Sum();
	S1.Show();
		
	}
	
}

class Sum {
	
	
	  int a ; 
	  int b ;
	
	
	  Sum()
	  
	  {
		  
		  a = 9;
		  b = 21;
		  
	  }
	
	  
	  
	  void Show()
	  
	  {
		  
		  int sum = b-(-a);
	      System.out.println("sum of two numbers = " +sum);
	     
	  }
	
	  
}
