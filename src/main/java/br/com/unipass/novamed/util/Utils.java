package br.com.unipass.novamed.util;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;

import br.com.unipass.novamed.entity.UnipassForm;

public class Utils {

	public static String getRemoteIpAddress(HttpServletRequest request) {

		String ipAddress = null;
		if (request != null) {
			ipAddress = request.getHeader("X-FORWARDED-FOR");
			if (StringUtils.isBlank(ipAddress)) {
				ipAddress = request.getRemoteAddr();
			}
		}

		return ipAddress;
	}

	/**
	 * Monta a URL para redirecionamento
	 * 
	 * @param unipassForm
	 * @return
	 */
	public static String buildRedirectUrl(String url, String ticket) {
		String redirectUrl = !url.startsWith("http") ? "http://" : StringUtils.EMPTY;
		redirectUrl += url;
		if (ticket != null) {
			redirectUrl = redirectUrl + "?ticket=" + ticket;
		}
		return "redirect:" + redirectUrl;
	}

}
