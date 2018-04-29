import java.util.*;  
import java.util.Arrays;   
  
public class Main  
{  
    public static void main(String[] args)   
    {  
        int num;  
        int judgment = 0;  
        int[] a = new int[8];  
        a[0] = 0;  
        Scanner sc = new Scanner(System.in);  
        num = sc.nextInt();  
  
        if(num > 0 && num <= 127)  
        {  
            for(int i = 1;i < 8;i++)  
            {  
                if(num >= Math.pow(2,(7-i)))  
                {  
                    num = num - (int)(Math.pow(2,(7-i)));  
                    a[i] = 1;     
                }  
                else  
                {  
                    a[i] = 0;  
                }  
            }  
        }  
        else if(num == -128)  
        {  
            a[0] = 1;  
        }  
        else if(num < 0 && num > -128)  
        {  
            for(int i = 1;i < 8;i++)  
            {  
                if((-num) >= Math.pow(2,(7-i)))  
                {  
                    num = num + (int)(Math.pow(2,(7-i)));  
                    a[i] = 1;  
                }  
                else  
                {  
                    a[i] = 0;  
                }  
            }  
              
            for(int i = 7;i >= 0;i--)  
            {  
                if(judgment != 0)  
                {  
                    if(a[i] == 0)  
                    {  
                        a[i] = 1;  
                    }  
                    else  
                    {  
                        a[i] = 0;  
                    }  
                }     
                  
                if(a[i] == 0)  
                {  
                    a[i] = 0;  
                }  
                else  
                {  
                    a[i] = 1;  
                    judgment++;  
                }         
            }  
        }  
        for(int i = 0;i < a.length;i++)  
        {  
            System.out.print(a[i]);  
        }  
        System.out.println();  
    }  
}