import java.util.Scanner;
import java.lang.Exception;

class WrongAge extends Exception{
    WrongAge(String s){
        super(s);
    }
}
class InputScanner {
    Scanner sc = new Scanner(System.in);
    int FatherAge, SonAge;
    InputScanner(){
        if (this.getClass() == Father.class){
            System.out.println("Enter father age: ");
            FatherAge = sc.nextInt();
        } else if (this.getClass() == Son.class){
            System.out.println("Enter son age: ");
            SonAge = sc.nextInt();
        }
    }
}
class Father extends InputScanner{
    int FatherAge;
    Father() throws WrongAge{
        FatherAge = super.FatherAge;
        // System.out.println("Father Age: " + FatherAge);
        if (FatherAge < 0){
            throw new WrongAge("Age cannot be < 0 for a person");
        } 
    }
    void display(){
        System.out.println("Father Age = " + FatherAge);
    }
}
class Son extends Father{
    int SonAge;
    Son(Father f) throws WrongAge{
        SonAge = super.SonAge;
        // System.out.println("Enter son age: ");
        // SonAge = sc.nextInt();
        // System.out.println("Father Age: " + f.FatherAge + "; Son Age: " + SonAge);
        if (f.FatherAge < SonAge){
            throw new WrongAge("Age cannot be greater for son");
        } else if (SonAge < 0){
            throw new WrongAge("Age cannot be < 0 for a person");
        }
    }
    void display(){
        System.out.println("Son Age = " + SonAge);
    }
}
class FatherMain{
    public static void main(String[] args) {
        try{
            Father father = new Father();
            Son son = new Son(father);
            father.display();
            son.display();
        }
        catch (WrongAge e){
            System.out.println(e.getMessage());
        } 
        
    }
}
