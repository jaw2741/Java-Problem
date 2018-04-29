import java.util.*;    
    
public class Main {    
    
    public static void main(String[] args) {    
        Scanner sc=new Scanner(System.in);    
String str=sc.nextLine();    
int[] a =new int[]{10,11,12,13,14,15,16,17,34,18,19,20,21,22,35,23,24,25,26,27,28,29,32,30,31,33};    
char[] arr = str.toCharArray();    
int prod=0;    
int n1=arr[0]-65;    
int n2= a[n1];    
int num1 = n2/10 + (n2%10) *9;    
for(int i=1;i<=8;i++)    
{    
    int c =arr[i]-48;    
    prod =prod + c * (9-i);     
}    
int b= prod + (arr[9]-48) + num1;    
if(b%10==0)    
{    
    System.out.println("Yes");    
}    
else    
{    
    System.out.println("No");    
}    
    }    
}