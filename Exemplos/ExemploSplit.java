import java.util.ArrayList;
import java.util.Collections;

public class ExemploSplit { 
  public static void main(String[] args) { 
    ArrayList<Integer> lsNumeros = new ArrayList<Integer>();
    String txNumeros = "9,3,8,4,9,0,8,3,4";
    String[] arrayN = txNumeros.split(",");
    for (String n : arrayN) {
        lsNumeros.add(Integer.parseInt(n));
    }
    // System.out.println(arrayN);
    System.out.println(lsNumeros);
    lsNumeros.set(5,30);
    System.out.println(lsNumeros);
    System.out.println(lsNumeros.get(5));
    
    System.out.println("tamanho > "+ lsNumeros.size());
    lsNumeros.remove(6);    
    System.out.println("tamanho > "+lsNumeros.size());

    System.out.println(lsNumeros);
    Collections.sort(lsNumeros);
    System.out.println(lsNumeros);
  } 
}
