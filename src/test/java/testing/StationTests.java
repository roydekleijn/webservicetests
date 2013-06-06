package testing;

import java.io.StringReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.testng.annotations.Test;

import pojo.ActueleVertrekTijden;
import pojo.Station;
import pojo.Stations;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.filter.HTTPBasicAuthFilter;

public class StationTests {

    @Test
    public void getAllstations() throws JAXBException {
        
        Client client = Client.create();
        client.addFilter(new HTTPBasicAuthFilter("xxx",
                "xxx"));

        WebResource webResource = client
                .resource("http://webservices.ns.nl/ns-api-stations");

        ClientResponse response = webResource.accept("text/xml").get(
                ClientResponse.class);

        if (response.getStatus() != 200) {
            throw new RuntimeException("Failed : HTTP error code : "
                    + response.getStatus());
        }

        String output = response.getEntity(String.class);

        System.out.println("Output from Server .... \n");
        System.out.println(output);
        
        JAXBContext jaxbContext = JAXBContext
                .newInstance(Stations.class);

        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        StringReader reader = new StringReader(output);
        Stations stations = (Stations) jaxbUnmarshaller
                .unmarshal(reader);
        
        for (Station station : stations.getStations()) {
            System.out.println(station.getName());
        }
    }
}
