package br.com.unipass.novamed.config;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Component
@Configuration
@PropertySource("file:${config.unipass.novamed}")
public class ApplicationConfig implements Serializable {

	private static final long serialVersionUID = -1033628794249649911L;

	@Value("${wsclient.unipass.domain.wsdl}")
	private String unipassDomainWsdl;

	@Value("${domain.code.unipass}")
	private String domainCodeUnipass;

	@Value("${bypass.validate.unipass}")
	private boolean bypassValidate;

	@Value("${url.gestao.clinicas}")
	private String urlGestaoClinica;

	@Value("${server.ip.gestao.clinicas}")
	private String serverIpGestaoClinica;

	@Value("${protocol.http.gestao.clinicas}")
	private String protocolGestaoClinica;

	
}
