package Server;

import WS.BanqueService;
import jakarta.xml.ws.Endpoint;

public class ServerWS {
    public static void main(String[] args){
        String url = "http://localhost:3000/";
        Endpoint.publish(url,new BanqueService());
        System.out.println("Web Service Deploye Sur "+url);
    }
}