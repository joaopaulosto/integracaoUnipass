package br.com.unipass.novamed.config;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Value;
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
public class ApplicationConfig implements Serializable {

	private static final long serialVersionUID = -1033628794249649911L;

	@Value("${wsclient.unipass.domain.wsdl}")
	private String unipassDomainWsdl;

	@Value("${domain.code.unipass}")
	private String domainCodeUnipass;

	@Value("${success.url.redirect}")
	private String successUrlRedirect;

}
