package environment.airquality;

import environment.service.AirData;
import environment.service.FetchAirQData;
import environment.service.VisualizeAirData;
import org.json.simple.parser.ParseException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, ParseException {
        int aqi;
        //Loading Spring Container with required Object Configuration Details
        ApplicationContext container = new ClassPathXmlApplicationContext("beans.xml");
        //Initiating our esired Object Creation by calling getBean() //Updates
        AirData airobj = (FetchAirQData) container.getBean("DataBean");

        aqi = (int) airobj.FetchData();
        //Initialize Description Bean
        VisualizeAirData vobj = (VisualizeAirData) container.getBean("DescriptionBean");
        //Get Data
        vobj.visuals(aqi);
    }
}
