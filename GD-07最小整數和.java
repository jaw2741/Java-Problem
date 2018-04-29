import java.util.*;      
import java.math.BigInteger;      
public class Main  {      
    public static void main(String[] args) throws Exception{      
        Scanner sc = new Scanner(System.in);      
        while(sc.hasNext()){      
        ArrayList<Integer> list = new ArrayList<Integer>();      
        int n = sc.nextInt();      
        for(int i=0;i<n;i++){      
            int a = sc.nextInt();      
            list.add(a);      
        }      
        ArrayList<Integer> lista = new ArrayList<Integer>();      
        ArrayList<Integer> listb = new ArrayList<Integer>();      
        Collections.sort(list);      
        for(int i=0;i<list.size();i++){      
            if(list.get(i)!=0){      
                lista.add(list.get(i));      
                list.remove(i);      
            }      
            if(list.get(i)!=0){      
                listb.add(list.get(i));      
                list.remove(i);      
                break;      
            }      
        }      
        while(!list.isEmpty()){      
            if(list.size()!=1){      
                lista.add(list.get(0));      
                list.remove(0);      
                listb.add(list.get(0));      
                list.remove(0);      
            }else{      
                lista.add(list.get(0));      
                list.remove(0);      
            }      
        }      
        BigInteger bia = new BigInteger("0");      
        BigInteger bib = new BigInteger("0");      
        for(int i=0;i<lista.size();i++){      
            bia = bia.add(new BigInteger(Integer.toString(lista.get(i))));      
            if(i!=lista.size()-1){      
                bia = bia.multiply(new BigInteger("10"));      
            }      
        }      
        for(int i=0;i<listb.size();i++){      
            bib = bib.add(new BigInteger(Integer.toString(listb.get(i))));      
            if(i!=listb.size()-1){      
                bib = bib.multiply(new BigInteger("10"));      
            }      
        }      
        System.out.println(bia.add(bib));      
    }      
    }      
}  