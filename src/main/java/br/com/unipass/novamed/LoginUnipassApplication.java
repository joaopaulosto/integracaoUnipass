package br.com.unipass.novamed;

import java.net.MalformedURLException;
import java.net.URL;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.remoting.jaxws.JaxWsPortProxyFactoryBean;

import br.com.unipass.novamed.ws.domain.DomainWSImpl;

@SpringBootApplication
public class LoginUnipassApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoginUnipassApplication.class, args);
	}
	
	@Bean
	public JaxWsPortProxyFactoryBean helloWorldWebServiceClient() throws MalformedURLException {

		JaxWsPortProxyFactoryBean domainWS = new JaxWsPortProxyFactoryBean();
		domainWS.setWsdlDocumentUrl(new URL("http://172.16.41.67:8080/unipass-webservice-mobile/mobilews?wsdl"));
		domainWS.setServiceInterface(DomainWSImpl.class);
		domainWS.setServiceName("DomainWSImplService");
		domainWS.setPortName("DomainWSImplPort");
		domainWS.setLookupServiceOnStartup(false);
		return domainWS;
	}

}
