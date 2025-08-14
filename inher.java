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



import java.util.Scanner;
class Vehical{
    void vehical(){
        System.out.println("Vehical");
    }
}

class FourWheeler extends Vehical{
    FourWheeler(){
        System.out.println("FourWheele");
    }
}

class Car extends FourWheeler{
    Car(){
        System.out.println("Car");
    }
}

public class Main{
    public static void main(String[] args){
        Car obj = new Car();
        
    }
}

import java.util.Scanner;

class Gf {
    Scanner data = new Scanner(System.in); 

    Gf() {
        System.out.print("Enter gf name: ");
        String i = data.nextLine();
        System.out.println("gf name: " + i);
    }
}

class Mother extends Gf {
    Mother() {
        System.out.print("Enter mother name: ");
        String c = data.nextLine();
        System.out.println("mother name: " + c);
    }
}

class Fath extends Gf {
    Fath() {
        System.out.print("Enter father name: ");
        String e = data.nextLine();
        System.out.println("father name: " + e);
    }
}

public class Main {
    public static void main(String[] args) {
        Mother m = new Mother(); 
        Fath f = new Fath();
    }
}

