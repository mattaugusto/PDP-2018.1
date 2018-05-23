package singleton;

/**
 *
 * @author Matheus
 */
public class Incremental {
    private static int count = 0;
    private final int numero;
    private static Incremental instance;

    private Incremental(){
        numero = ++count;
    }
    
    public static Incremental getInstance(){
        if(Incremental.instance == null){
            Incremental.instance = new Incremental();
        }

        return Incremental.instance;
    }

    @Override
    public String toString() {
        return "Incremental"  + numero;
    }
}

