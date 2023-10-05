package testStreams;

public class Weather {
    String place;
    Double temperature;

    public Weather(){

    }

    public Weather(String place, Double temperature){
        this.place = place;
        this.temperature = temperature;
    }

    public String getPlace() {
        return place;
    }

    public Double getTemperature() {
        return temperature;
    }

    @Override
    public String toString() {
        return "Weather{" +
                "place='" + place + '\'' +
                ", temperature=" + temperature +
                '}';
    }
}
