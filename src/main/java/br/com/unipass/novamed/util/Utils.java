package br.com.unipass.novamed.util;

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

}
