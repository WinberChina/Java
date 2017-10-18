package exercises.access;
class Insect {
    private int i = 9;
    protected int j ;
    public Insect() {
        System.out.print("i=" + i + ",j = " + j +"\n");
        j=39;
    }
    
    private static int x1 = printInt("Insect.x1 init\n"); 
            
    static int printInt(String s) {
        System.out.print(s);
        return 47;
    }        
    
}

public class Beetle extends Insect {

    private int k  =printInt("Beetle.k init\n");
    
    public Beetle() {
        System.out.print("s=" + s + ",");
        System.out.print("k="+ k + ",");
        System.out.print("j="+j);
    }
    
    private static int x2 = printInt("Beetle.x2 is init\n");
    
    private int s = printInt("Beetle.s init\n");
    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.print("Starting\n");
        Beetle b = new Beetle();
    }

}
/*
 *Output:
 * Insect.x1 init
 * Beetle.x2 is init
 * Starting
 * i=9,j = 0
 * Beetle.k init
 * Beetle.s init
 * s=47,k=47,j=39
 */
