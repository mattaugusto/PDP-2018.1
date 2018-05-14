package observed;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Observable;
import java.util.TreeMap;
/**
 *
 * @author Matheus Augusto
 */
public class WeatherData extends Observable{

    private double temperature;
    private double humidity;
    private double pressure;
        
    public WeatherData(double temperature, double humidity, double pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
    }

    /**
     * @return the temperature
     */
    public double getTemperature() {
        return temperature;
    }

    /**
     * @param temperature the temperature to set
     */
    public void setTemperature(double temperature) {
        Double value = this.temperature;
        this.temperature = temperature;
        MeasurementsChanged("temperature", new ArrayList<>(Arrays.asList(value, this.temperature)));
    }

    /**
     * @return the humidity
     */
    public double getHumidity() {
        return humidity;
    }

    /**
     * @param humidity the humidity to set
     */
    public void setHumidity(double humidity) {
        Double value = this.humidity;
        this.humidity = humidity;
        MeasurementsChanged("humidity", new ArrayList<>(Arrays.asList(value, this.humidity)));
    }

    /**
     * @return the pressure
     */
    public double getPressure() {
        return pressure;
    }

    /**
     * @param pressure the pressure to set
     */
    public void setPressure(double pressure) {
        Double value = this.pressure;
        this.pressure = pressure;
        MeasurementsChanged("pressure", new ArrayList<>(Arrays.asList(value, this.pressure)));
    }


    public void MeasurementsChanged(String attribute, List<Double> values) {
        Map<String, List<Double>> measurement = new TreeMap<>();
        measurement.put(attribute, values);
        this.setChanged();
        this.notifyObservers(measurement);
    }

    @Override
    public String toString() {
        return "WeatherData{" + "temperature=" + temperature + ", humidity=" + humidity + ", pressure=" + pressure + '}';
    }

    
}
