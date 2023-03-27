package crud.service.imp;

import javax.xml.ws.Endpoint;

public class ServicePublication {
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:2022/WS/Service", new ServiceImp());
		System.out.println("Server is running...");
	}
}