package com.laptrinhjavaweb.utils;

import java.lang.reflect.InvocationTargetException;
import jakarta.servlet.http.HttpServletRequest;
import org.apache.commons.beanutils.BeanUtils;

public class FormUtil {
	
	@SuppressWarnings("unchecked")
	public static <T> T toModel(Class<T> clazz, HttpServletRequest request) {
		T object = null;
		try {
			object = clazz.getDeclaredConstructor().newInstance();
			BeanUtils.populate(object, request.getParameterMap());
		} catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
			System.out.print(e.getMessage());
		}
		return object;
	}
}
