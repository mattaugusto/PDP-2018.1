package main;
import observed.WeatherData;
import observer.ActualConditions;
import observer.Estatistics;
import observer.Prediction;
/**
 *
 * @author Matheus
 */
public class Teste {

    public static void main(String[] args){
        WeatherData wd = new WeatherData(15.5, 10.3, 0.9);
        Estatistics es = new Estatistics();
        ActualConditions ac = new ActualConditions();
        Prediction pr = new Prediction();
        
        wd.addObserver(es);
        wd.addObserver(ac);
        wd.addObserver(pr);
        
        System.out.println("WeatherData not modified: " + wd);
        System.out.println("WeatherData observers count: " + wd.countObservers());
        
        System.out.println("WeatherData - modifying temperature to 30.0");
        wd.setTemperature(30.0);
        
        System.out.println("WeatherData - modifying humidity to 7.0");
        wd.setHumidity(7.0);
        
        System.out.println("WeatherData - modifying pressure to 15.0");
        wd.setPressure(15.0);
        
        System.out.println("WeatherData modified: " + wd);
    }  
}
