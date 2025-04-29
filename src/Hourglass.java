import java.util.Scanner;

public class Hourglass {public static void main(String[] args){
	
	while(true){
		Scanner input = new Scanner(System.in);
		String choice = "";
	    while(!choice.equals("q")){
	System.out.print ("enter a number (press q to quit):");
	choice = input.next();
	
	if(!choice.equals("q")){
        int n = Integer.parseInt(choice);
		if(n%2==0)
	    {	    int x,y,z,l;

	    for(x=0;x<n/2;x++)
	    {
	      for(y=0;y<x;y++)
	      {
	        System.out.print(" ");
	      }
	      for(z=0;z<n/2-x;z++)
	      {
	        System.out.print("*");
	      }
	      for(l=0;l<n/2-x;l++)
	      {
	        System.out.print("*");
	      }
	      System.out.println();
	    }

	  for(x=0;x<n/2;x++)
	    {
	      for(y=0;y<n/2-x-1;y++)
	      {
	        System.out.print(" ");
	      }
	      for(z=0;z<x+1;z++)
	      {
	        System.out.print("*");
	      }
	      for(l=0;l<x+1;l++)
	      {
	        System.out.print("*");
	      }
	      System.out.println();
	    }
     }
		else
	    {	    int x,y,z,l;

	    for(x=0;x<n/2+1;x++)
	    {
	      for(y=0;y<x;y++)
	      {
	        System.out.print(" ");
	      }
	      for(z=0;z<n/2+1-y;z++)
	      {
	        System.out.print("*");
	      }
	      for(l=0;l<n/2+1-x-1;l++)
	      {
	        System.out.print("*");
	      }
	      System.out.println();
	    }

	  for(x=0;x<n/2;x++)
	    {
	      for(y=0;y<n/2+1-x-2;y++)
	      {
	        System.out.print(" ");
	      }
	      for(z=0;z<x+2;z++)
	      {
	        System.out.print("*");
	      }
	      for(l=0;l<x+1;l++)
	      {
	        System.out.print("*");
	      }
	      System.out.println();
	    }
	   }
      }else {
      	System.exit(0);
      }
	 }
	}
  }
}
