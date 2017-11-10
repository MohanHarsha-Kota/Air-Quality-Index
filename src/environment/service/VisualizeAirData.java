package environment.service;

public class VisualizeAirData{


    public void visuals(int aqi)
    {
        System.out.println("Air Quality In Your Location is: "+aqi);
        if(aqi <= 50)
        {
           System.out.println("This Value Indicates That the Air Quality is Good");
        } else if(aqi > 50 && aqi <=100)
        {
            System.out.println("This Value Indicates That the Air Quality is Moderate");
        }else if(aqi > 100 && aqi <= 150)
        {
            System.out.println("This Value Indicates That the Air Quality is Unhealthy for Sensitive Groups");
        }else if(aqi > 150 && aqi <= 200)
        {
            System.out.println("This Value Indicates That the Air Quality is Unhealthy");
        }else if(aqi > 200 && aqi <= 300)
        {
            System.out.println("This Value Indicates That the Air Quality is Very Unhealthy");
        }else if(aqi>300)
        {
            System.out.println("This Value Indicates That the Air Quality is Hazardous");
        }
    }

}
