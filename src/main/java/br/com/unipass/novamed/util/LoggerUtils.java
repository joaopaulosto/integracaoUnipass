package br.com.unipass.novamed.util;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggerUtils {
	private static Map<Class<?>, Logger> loggers = new HashMap();

	public static Logger getLogger(Class<?> classe) {
		Logger logger = (Logger) loggers.get(classe);
		if (logger == null) {
			logger = LoggerFactory.getLogger(classe);
			loggers.put(classe, logger);
		}
		return logger;
	}

	public static void logDebug(Class<?> classe, String mensagem, Object... params) {
		logDebug(getLogger(classe), mensagem, params);
	}

	public static void logDebug(Logger logger, String mensagem, Object... params) {
		if (logger.isDebugEnabled()) {
			logger.debug(mensagem, params);
		}
	}

	public static void logInfo(Class<?> classe, String mensagem, Object... params) {
		logInfo(getLogger(classe), mensagem, params);
	}

	public static void logInfo(Logger logger, String mensagem, Object... params) {
		if (logger.isInfoEnabled()) {
			logger.info(mensagem, params);
		}
	}

	public static void logError(Class<?> classe, String mensagem, Object... params) {
		logError(getLogger(classe), mensagem, params);
	}

	public static void logError(Logger logger, String mensagem, Object... params) {
		if (logger.isErrorEnabled()) {
			logger.error(mensagem, params);
		}
	}

	public static void logError(Class<?> classe, String mensagem, Throwable throwable) {
		logError(getLogger(classe), mensagem, throwable);
	}

	public static void logError(Logger logger, String mensagem, Throwable throwable) {
		if (logger.isErrorEnabled()) {
			logger.error(mensagem, throwable);
		}
	}

	public static void logTrace(Class<?> classe, String mensagem, Object... params) {
		logTrace(getLogger(classe), mensagem, params);
	}

	public static void logTrace(Logger logger, String mensagem, Object... params) {
		if (logger.isTraceEnabled()) {
			logger.trace(mensagem, params);
		}
	}

	public static void logWarning(Class<?> classe, String mensagem, Object... params) {
		logWarning(getLogger(classe), mensagem, params);
	}

	public static void logWarning(Logger logger, String mensagem, Object... params) {
		if (logger.isWarnEnabled()) {
			logger.warn(mensagem, params);
		}
	}

}
