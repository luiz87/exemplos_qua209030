public class UsarMain {
    
    public static void main(String[] args) {
        ExemploMain myObj = new ExemploMain();
        
        System.out.println(myObj.x+" - "+myObj.y);
        myObj.x = 9;
        System.out.println(myObj.x+" - "+myObj.y);      
  
        ExemploMain obj2 = new ExemploMain();
        obj2.x = 40;
  
        System.out.println(obj2.somar());  //  a)99 b)90 c)59 => 90
        System.out.println(myObj.somar()); //  a)99 b)90 c)59 => 59
  
      }
}
