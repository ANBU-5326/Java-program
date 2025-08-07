import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner data=new Scanner(System.in);
	    System.out.println("enter the First value");
	   
	    int  a=data.nextInt();
	    System.out.println("enter the second value");
	    
	    int b=data.nextInt();
	    Double an=a+Math.random()*((a+b)+1);
		System.out.println("here the random value"+an);
	}
}
