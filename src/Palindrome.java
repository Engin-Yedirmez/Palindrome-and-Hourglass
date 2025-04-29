import java.util.Scanner;

public class Palindrome {
	public static void main(String args[]){  
	      
		while(true){
		Scanner input = new Scanner(System.in);
		System.out.print ("enter a 7-digit number (press -1 to quit):");
		while (!input.hasNextInt()) input.next();
		int n = input.nextInt();
		if(n == -1)
			System.exit(n);
		if(n<=9999999 && n>=1000000) {
			 int r,sum=0,temp;
			  
			  temp=n;    
			  while(n>0){    
			   r=n%10;    
			   sum=(sum*10)+r;    
			   n=n/10;    
			  }    
			  if (temp==sum)  
			   System.out.println(temp+ " is a palindrome number");    
			  else    
			   System.out.println(temp+ " is not palindrome"); 
		}
        else
        {
            System.out.println("Number must be 7 digit");
        }    
	  }
    }

}
