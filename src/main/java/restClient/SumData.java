package restClient;

import javax.ws.rs.Path;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
@RegisterRestClient
@Path("/data")
public class SumData {
    

   
public int addData(int num1){
    int num2=3;
    int sum=num2*num1;
    return sum;
}

}
