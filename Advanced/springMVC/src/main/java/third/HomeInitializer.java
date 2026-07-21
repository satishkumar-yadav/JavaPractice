package third;

import org.jspecify.annotations.Nullable;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

                                 // AACDSI
public class HomeInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

									@Override
									protected Class<?> @Nullable [] getRootConfigClasses() {
										// TODO Auto-generated method stub
										return null;
									}

									@Override
									protected Class<?> @Nullable [] getServletConfigClasses() {
										return new Class [] {MyConfig.class};  // to get package name from config
									}

									@Override
									protected String[] getServletMappings() {
										return new String [] {"/"};
									}

}
 
