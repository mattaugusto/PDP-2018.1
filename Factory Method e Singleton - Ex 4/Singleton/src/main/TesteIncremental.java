package main;
import singleton.Incremental;
/**
 *
 * @author Matheus
 */
public class TesteIncremental {
    public static void main(String[] args) {
        Incremental inc = Incremental.getInstance();
        System.out.println(inc);
    }

}
