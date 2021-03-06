package testing;

import org.testng.annotations.Test;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.filter.HTTPBasicAuthFilter;

public class JourneyAdviceTests {

    
    @Test
    public void getAdvice() {
        Client client = Client.create();
        client.addFilter(new HTTPBasicAuthFilter("xxx",
                "xxx"));

        WebResource webResource = client
                .resource("http://webservices.ns.nl/ns-api-treinplanner?fromStation=Utrecht+Centraal&toStation=Wierden&departure=true");

        ClientResponse response = webResource.accept("text/xml").get(
                ClientResponse.class);

        if (response.getStatus() != 200) {
            throw new RuntimeException("Failed : HTTP error code : "
                    + response.getStatus());
        }

        String output = response.getEntity(String.class);

        System.out.println("Output from Server .... \n");
        System.out.println(output);
    }
}
