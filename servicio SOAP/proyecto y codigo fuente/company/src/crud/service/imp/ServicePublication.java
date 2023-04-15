package crud.service.imp;

import javax.xml.ws.Endpoint;

public class ServicePublication {
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:2023/WS/Service", new ServiceImp());
		//Endpoint.publish("http://0.0.0.0:2023/WS/Service", new ServiceImp());
		//http://localhost:2023/WS/Service?WSDL
		System.out.println("Server is running...");
	}
}