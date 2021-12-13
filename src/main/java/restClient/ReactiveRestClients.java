package restClient;

// import javax.enterprise.context.ApplicationScoped;
// import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import io.smallrye.mutiny.Uni;
//@Singleton
//@ApplicationScoped
//@Path("http://localhost:8080/api/bahl/sms/db")
@RegisterRestClient
public interface ReactiveRestClients {
    @GET
    @Path("/getData/{num1}")
    @Produces(MediaType.APPLICATION_JSON)
    Uni<ReactiveRestClients> sum(@PathParam("num1") int num1);
}