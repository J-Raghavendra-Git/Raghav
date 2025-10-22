import java.util.*;

public class Day1{
    public static void main(String[]args){
    Scanner s=new Scanner(System.in);
    //print name using user input
    System.out.print("Name:");
    String name=s.nextLine();
    System.out.println(name);
    //print age using user input 
    System.out.print("Age:");
    int age=s.nextInt();
    System.out.println(age);
    //give values
    System.out.print("a:");
    int a=s.nextInt();
    System.out.print("b:");
    int b=s.nextInt();
    //sum
    int sum=a+b;
    System.out.println(sum);
    }
}
