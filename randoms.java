import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner data=new Scanner(System.in);
        System.out.println("Enter the first number:");
        int fn=data.nextInt();
        System.out.println("Enter the last number:");
        int ln=data.nextInt();
        int sn=fn+(int)(Math.random()*((fn+ln)+(int)1));
        System.out.println("Randon Number:"+sn);
    }
}
