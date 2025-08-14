import java.util.Scanner;
class Fam{
    static Scanner data=new Scanner(System.in);
    void sound(){
        System.out.println("Family detail");
    }
}
class gf extends Fam{
    void sound(){
        System.out.println("GF name:");
        String gf=data.nextLine();
    }
}
class gm extends Fam{
    void sound(){
        System.out.println("GM name:");
        String gm=data.nextLine();
    }
}
class f extends Fam{
    void sound(){
        System.out.println("F name:");
        String f=data.nextLine();
    }
}
class m extends Fam{
    void sound(){
        System.out.println("M name:");
        String m=data.nextLine();
    }
}
class myn extends Fam{
    void sound(){
        System.out.println("MY name:");
        String myn=data.nextLine();
    }
}
public class Main{
    public static void main(String[]args){
        Fam a;
        a=new Fam();
        a.sound();
       
        a=new gf();
        a.sound();
       
        a=new gm();
        a.sound();
       
        a=new f();
        a.sound();
       
        a=new m();
        a.sound();
       
        a=new myn();
        a.sound();
    }
}
