public class DuplaClasse {
    
    int x = 10;

    class InternarClasse{
        int x = 100;
    }

    public static void main(String[] args) {
        DuplaClasse dc = new DuplaClasse();
        System.out.println(dc.x);
        DuplaClasse.InternarClasse ic = dc.new InternarClasse();
        System.out.println(ic.x);
    }
}
