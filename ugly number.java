import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner data=new Scanner(System.in);
	    System.out.println("Enter the First value");
	    int a=data.nextInt();
		if((a%2)==0){
		    System.out.println("it is an ugly number");
		    
		}
		else if((a%3)==0){
		    System.out.println("it is an ugly number");
		    
		}
		else if((a%5)==0){
		    System.out.println("it is an ugly number");
		}
		else{
		      System.out.println("it is not ugly number");
		    }
		
	}
}
