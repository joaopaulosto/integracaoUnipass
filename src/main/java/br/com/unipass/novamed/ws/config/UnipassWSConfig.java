package br.com.unipass.novamed.ws.config;

import java.net.MalformedURLException;
import java.net.URL;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.jaxws.JaxWsPortProxyFactoryBean;

import br.com.unipass.novamed.ws.domain.DomainWSImpl;

//@Configuration
public class UnipassWSConfig {

	
	//@Bean
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
