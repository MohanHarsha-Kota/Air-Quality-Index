package environment.service;

import org.json.simple.parser.ParseException;

import java.io.IOException;

public interface AirData { //Interface

    public long FetchData() throws IOException, ParseException;
}
