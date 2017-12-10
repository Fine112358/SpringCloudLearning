package com.forezp;

import com.serotonin.modbus4j.ip.IpParameters;
import com.serotonin.modbus4j.ip.tcp.TcpMaster;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerApplication.class, args);
	}

	public void get() {
		IpParameters parameters =new IpParameters();
		parameters.setPort(502);
		parameters.setHost("10.0.3.243");
		TcpMaster tcpMaster = new TcpMaster(parameters,true);
	}
}
