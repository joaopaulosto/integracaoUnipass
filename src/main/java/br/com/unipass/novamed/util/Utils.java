package br.com.unipass.novamed.util;

import java.sql.Timestamp;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;

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
	public static String buildRedirectUrl(String protocol, String url, String ip) {
		
		long time = new Timestamp(System.currentTimeMillis()).getTime();
		
		String redirectUrl = String.format("%s://%s/%s%d", protocol, ip, url.trim(), time);		
		return "redirect:" + redirectUrl;
	}

	public static void persisterTicket(String ticket, HttpServletRequest request) {
		request.getSession().setAttribute("ticket", ticket);
	}

	public static String getTicket(HttpServletRequest request) {
		return (String)request.getSession().getAttribute("ticket");
	}

}
