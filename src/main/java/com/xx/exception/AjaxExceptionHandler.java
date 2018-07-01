package com.xx.exception;

import javax.servlet.http.HttpServletRequest;

import com.xx.pojo.JSONResult;

//@RestControllerAdvice
public class AjaxExceptionHandler {

//	@ExceptionHandler(value = Exception.class)
	public JSONResult defaultErrorHandler(HttpServletRequest req, 
			Exception e) throws Exception {

		e.printStackTrace();
		return JSONResult.errorException(e.getMessage());
	}
}
