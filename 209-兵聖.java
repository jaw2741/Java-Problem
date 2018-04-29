import java.util.*;    
  
class Main    
{    
    public static void main (String[] args) throws java.lang.Exception    
    {    
        Scanner sc = new Scanner (System.in);  
        String [][] table = {{"","","","","",},    
                             {"","","","Staff","General"},    
                             {"","","","execute by shooting","Soldier"}};  
        int n = sc.nextInt(); int i=0;    
        for(i=0;i<n;i++)  
        {    
            String name = sc.next();    
            int x = sc.nextInt(), y = sc.nextInt();    
            System.out.println(name+" "+table[x][y]);    
        }    
     
    }    
}  