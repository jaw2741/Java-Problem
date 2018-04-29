import java.util.*;    
     
public class Main {    
     
    public static void main(String[] args) {    
        Scanner sc = new Scanner(System.in);    
        while (sc.hasNext()) {    
            String s[] = sc.nextLine().split(" ");    
            for (int i = s.length - 1; i >= 0; i--) {    
                if (i != s.length - 1)    
                    System.out.print(" ");    
                System.out.print(s[i]);    
            }    
            System.out.println();    
        }    
    }    
}  