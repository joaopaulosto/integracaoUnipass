package br.com.unipass.novamed;

import java.net.MalformedURLException;
import java.net.URL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.remoting.jaxws.JaxWsPortProxyFactoryBean;

import br.com.unipass.novamed.config.ApplicationConfig;
import br.com.unipass.novamed.ws.domain.DomainWSImpl;

@SpringBootApplication
public class LoginUnipassApplication {

	@Autowired
	private ApplicationConfig applicationConfig;

	public static void main(String[] args) {
		SpringApplication.run(LoginUnipassApplication.class, args);
	}

	@Bean
	public JaxWsPortProxyFactoryBean domainWebServiceClient() throws MalformedURLException {

		JaxWsPortProxyFactoryBean domainWS = new JaxWsPortProxyFactoryBean();
		domainWS.setWsdlDocumentUrl(new URL(this.applicationConfig.getUnipassDomainWsdl()));
		domainWS.setServiceInterface(DomainWSImpl.class);
		domainWS.setServiceName("DomainWSImplService");
		domainWS.setPortName("DomainWSImplPort");
		domainWS.setLookupServiceOnStartup(false);
		return domainWS;
	}

	@Bean
	public MessageSource messageSource() {
		ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
		messageSource.setBasename("classpath:messages");
		//messageSource.setCacheSeconds(10); // reload messages every 10 seconds
		return messageSource;
	}

}
