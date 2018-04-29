import java.util.*;   
   
public class Main {   
  public static void main(String[] args) {   
       Scanner sc = new Scanner(System.in);   
       char s[]=sc.nextLine().toCharArray();
       for(int i=s.length-1;i>=0;i--){
    	   if(s[i]>64&&s[i]<91)
    		   System.out.printf("%c",s[i]+32);
    	   else if(s[i]>96&&s[i]<123)
    		   System.out.printf("%c",s[i]-32);
    	   else
    		   System.out.print(s[i]);
       }
       System.out.println();
  }   

}  