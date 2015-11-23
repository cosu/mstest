package eu.foo.bar;

import org.junit.Test;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;

public class FooClientIT {

    @Test
    public void testFoo() throws Exception {

        Client client = ClientBuilder.newClient();
        final WebTarget target = client.target("http://localhost:8080").path("/foo/bar");

        final String result = target.request(MediaType.TEXT_PLAIN).get(String.class);
        assertThat(result.length(), not(0));

    }
}
