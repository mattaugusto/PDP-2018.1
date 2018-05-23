package creator;

import java.util.ArrayList;
import java.util.List;
import product.Name;
/**
 *
 * @author Matheus
 */
public class NameManager{
    
    private static List<Name> names = new ArrayList<Name>();
    
    public static Name criar(String fullName) {
        String[] output = fullName.split("\\s");
        Name savedName = new Name(output[0],output[1]);
        names.add(savedName);
        return savedName;
    }
    
     /**
     * @return the names
     */
    public static List<Name> getNames() {
        return names;
    }

    /**
     * @param aNames the names to set
     */
    public static void setNames(List<Name> aNames) {
        names = aNames;
    }
    
    public static void printNames(){
        for(Name name: names)
            System.out.println(name);
    }
}
