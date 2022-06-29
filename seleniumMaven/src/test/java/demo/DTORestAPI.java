package demo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Data
@Component
public class DTORestAPI {
    public Coord coord;
    public ArrayList<Weather> weather;
    public String base;
    public Main main;
    public int visibility;
    public Wind wind;
    public Rain rain;
    public Clouds clouds;
    public int dt;
    public Sys sys;
    public int timezone;
    public int id;
    public String name;
    public int cod;

    @Data
    @Component
    public static class Main{
        public double temp;
        public double feels_like;
        public double temp_min;
        public double temp_max;
        public int pressure;
        public int humidity;
        public int sea_level;
        public int grnd_level;
    }

    @Data
    @Component
    public static class Clouds{
        public int all;
    }

    @Data
    @Component
    public static class Coord{
        public int lon;
        public int lat;
    }

    @Data
    @Component
    public static class Rain{
        @JsonProperty("1h")
        public double _1h;
    }

    @Data
    @Component
    public static class Sys{
        public int type;
        public int id;
        public String country;
        public int sunrise;
        public int sunset;
    }

    @Data
    @Component
    public static class Weather{
        public int id;
        public String main;
        public String description;
        public String icon;
    }

    @Data
    @Component
    public static class Wind{
        public double speed;
        public int deg;
        public double gust;
    }
}
