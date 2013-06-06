package testing;

import java.io.StringReader;

import javax.ws.rs.core.MultivaluedMap;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.testng.annotations.Test;

import pojo.ActueleVertrekTijden;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.filter.HTTPBasicAuthFilter;
import com.sun.jersey.core.util.MultivaluedMapImpl;

public class AlleVertrektijdenTests {

    @Test
    public void basicRequest() {

        Client client = Client.create();

        WebResource webResource = client.resource("http://webservices.ns.nl");

        MultivaluedMap<String, String> params = new MultivaluedMapImpl();
        params.add("station", "ut");

        ClientResponse response = webResource.path("ns-api-avt")
                .queryParams(params).accept("text/xml")
                .get(ClientResponse.class);

        if (response.getStatus() != 200) {
            throw new RuntimeException("Failed : HTTP error code : "
                    + response.getStatus());
        }

        String output = response.getEntity(String.class);

        System.out.println("Output from Server .... \n");
        System.out.println(output);

        // 401 - Unauthorized response
    }

    @Test
    public void basicRequestWithHeader() throws JAXBException {

        Client client = Client.create();
        client.addFilter(new HTTPBasicAuthFilter("xxx",
                "xxx"));

        WebResource webResource = client.resource("http://webservices.ns.nl");
        MultivaluedMap<String, String> params = new MultivaluedMapImpl();
        params.add("station", "ut");

        ClientResponse response = webResource.path("ns-api-avt")
                .queryParams(params).accept("text/xml")
                .get(ClientResponse.class);

        if (response.getStatus() != 200) {
            throw new RuntimeException("Failed : HTTP error code : "
                    + response.getStatus());
        }

        String output = response.getEntity(String.class);

        System.out.println("Output from Server .... \n");
        System.out.println(output);

        JAXBContext jaxbContext = JAXBContext
                .newInstance(ActueleVertrekTijden.class);

        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        StringReader reader = new StringReader(output);
        ActueleVertrekTijden actueleVertrekTijden = (ActueleVertrekTijden) jaxbUnmarshaller
                .unmarshal(reader);
        System.out.println(actueleVertrekTijden.getVertrekkendeTrein().get(1)
                .getEindBestemming());
    }

}
