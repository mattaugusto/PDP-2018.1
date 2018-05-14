package observer;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
import java.util.TreeMap;
/**
 *
 * @author Matheus
 */
public class ActualConditions implements Observer {
    
    public ActualConditions(){
    }
    
    @Override
    public void update(Observable o, Object arg){
        TreeMap<String, List<Double>> measurement = (TreeMap<String, List<Double>>)arg;
        System.out.println("\tActualConditions - " + o.getClass() + " " + measurement.firstKey() + " changed!");
        System.out.println("\tBefore: " + measurement.get(measurement.firstKey()).get(0) + 
                " | After: " + measurement.get(measurement.firstKey()).get(1));
    }
}
