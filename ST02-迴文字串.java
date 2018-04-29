import java.util.Scanner;  
  
public class Main {  
      public static void main(String[] args) {  
  
         Scanner sc = new Scanner(System.in);  
            int n = sc.nextInt();  
             for (int k = 0; k<n; k++){  
  
                  String s = sc.next();  
  
                  for(int i = s.length()-1;i>=0; i--){  
  
                        System.out.print(s.charAt(i));  
  
                  }  
  
                  System.out.println();  
                                      }  
                        }    
         }  