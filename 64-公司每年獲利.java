import java.util.*;  
import java.lang.*;  
import java.io.*;  

public class Main {   
public static void main(String[] args) {   
    int Money=50000, Minus=10000,HowdoIlive=0;   
    Scanner sc = new Scanner (System.in);   
            int n=sc.nextInt();  
            Money=(int)(50000*((float)(Math.pow(1.36,n))));   
            Minus=(int)(10000*((float)(Math.pow(1.02,n))));   
              
            HowdoIlive=Money-Minus;   
            HowdoIlive=(int)(HowdoIlive/(35.2-(n)*0.2));   
            System.out.println("The Company will earn " +HowdoIlive+ " US dollars after " +n+ " year");   
            }   
}  