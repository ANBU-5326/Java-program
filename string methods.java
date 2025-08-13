import java.util.Scanner;

class Main
{
	public static void main(String[] args) {
	    Scanner data=new Scanner(System.in);
	    System.out.println("Enter The string value");
	    String a=data.nextLine();
	    char y=a.charAt(2);
	    System.out.println(y);
	    
	    int x=a.codePointAt(2);
	    System.out.println(x);
	    
	    int s=a.codePointBefore(2);
	    System.out.println(s);
	    
	    int n=a.codePointCount(0,6);
	    System.out.println(n);
	    
	    String b=data.nextLine();
	    int u=a.compareTo(b);
	    System.out.println(u);
	    
	    int g=a.compareToIgnoreCase(b);
	    System.out.println(g);
	    
	    String e=a.concat(b);
	    System.out.println(e);
	    
	    
	}
}

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner data=new Scanner(System.in);
	    System.out.println("Enter the string ");
	    String a=data.nextLine();
	    System.out.println("Enter the string ");
	    String s=data.nextLine();
		System.out.println(a.contains(s));
		System.out.println(a.contentEquals(s));

		
	}
}


import java.util.Scanner;

class Main{
    
    public static void main (String[]args){
        Scanner data=new Scanner(System.in);
        String a=data.nextLine();
        String b=data.nextLine();
        System.out.println("anbuganesh".matches(a));
        System.out.println(a.regionMatches(7,a,4,5));
        
    }
}


class Main{
    
    public static void main (String[]args){
        String a="anbu";
        System.out.println(a.replace("a","b"));
        
    }
}

import java.util.Scanner;
class Main{
    public static void main (String[]args){
        Scanner data=new Scanner(System.in);
        String s=data.nextLine();
         System.out.println(s.endsWith("anbu"));
    }
} 


import java.util.Scanner;
class Main{
    public static void main (String[]args){
        Scanner data=new Scanner(System.in);
        String s=data.nextLine();
         System.out.println(s.startsWith("anbu"));
    }
} 

