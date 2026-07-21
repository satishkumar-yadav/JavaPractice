package com.mvc.student;

import org.jspecify.annotations.Nullable;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class StudentInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?> @Nullable [] getRootConfigClasses() {
		return null;
	}

	@Override
	protected Class<?> @Nullable [] getServletConfigClasses() {
		return new Class [] {StudentConfig.class};  // to get package name from config
	}

	@Override
	protected String[] getServletMappings() {
		return new String [] {"/"};
	}

	@Override
	protected String getServletName() {
	    return "studentDispatcher"; // unique name
	}
	
}
