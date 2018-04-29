import java.util.*;     
public class Main {    
        
    public static void main(String[] args) {    
        
        Scanner sc = new Scanner(System.in);      
    int a=sc.nextInt();    
    int b=sc.nextInt();    
    int c=sc.nextInt();    
    int d=sc.nextInt();    
    int e=sc.nextInt();    
   int t=0;    
    if(a<=12){a=a+1;    
    }    
    else if(a<=25&&a>=13){a=a-12;    
    }    
    else if(a<=38&&a>=26){a=a-25;    
    }    
     else if(a<=51&&a>=39){a=a-38;    
    }    
    if(b<=12){b=b+1;    
    }    
    else if(b<=25&&b>=13){b=b-12;    
    }    
    else if(b<=38&&b>=26){b=b-25;    
    }    
     else if(b<=51&&b>=39){b=b-38;    
    }    
    if(c<=12){c=c+1;    
    }    
    else if(c<=25&&c>=13){c=c-12;    
    }    
    else if(c<=38&&c>=26){c=c-25;    
    }    
     else if(c<=51&&c>=39){c=c-38;    
    }    
    if(d<=12){d=d+1;    
    }    
    else if(d<=25&&d>=13){d=d-12;    
    }    
    else if(d<=38&d>=26){d=d-25;    
    }    
     else if(d<=51&&d>=39){d=d-38;    
    }    
    if(e<=12){e=e+1;    
    }    
    else if(e<=25&&e>=13){e=e-12;    
    }    
    else if(e<=38&&e>=26){e=e-25;    
    }    
     else if(e<=51&&e>=39){e=e-38;    
    }    
    t=a+b+c+d+e;    
    System.out.println(t);      
            
    }    
}  