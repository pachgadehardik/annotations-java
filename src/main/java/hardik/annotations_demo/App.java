package hardik.annotations_demo;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * Hello world!
 *
 */
public class App {
	public static void main( String[] args )
    {
    	try {
			for(Method method:AnnotationTest.class.getMethods()) {
				if(method.isAnnotationPresent(MethodInfo.class)) {
					try {
						for(Annotation anno : method.getDeclaredAnnotations()) {
							System.out.println("Annotation in method: "+method+": "+anno);
						}
						MethodInfo methodAnno = method.getAnnotation(MethodInfo.class);
								if(methodAnno.revision() ==1 )System.out.println("Method with revision 1 = "+method);
					} catch (Throwable x) {
						x.printStackTrace();
					}
				}
			}
		} catch (SecurityException e) {
			e.printStackTrace();
		}
    }
}
