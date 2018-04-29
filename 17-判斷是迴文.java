import java.util.Scanner;  
class Main {  
  public static void main(String[] args) {  
    Scanner sc = new Scanner(System.in);  
    String s = sc.next();  
    int i;  
    for (i = 0; i < s.length()/2; i++){  
      if (s.charAt(i) != s.charAt(s.length()-1-i))  
        break;  
    }  
    if (i == s.length()/2){ // complete  
      System.out.println("YES");  
    }  
    else { //not complete  
      System.out.println("NO");  
    }  
  }  
}  