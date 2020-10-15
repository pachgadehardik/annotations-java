package hardik.annotations_demo;

public class AnnotationTest {

	@Override
	@MethodInfo(author = "Hardik", comments = "Main Method", date = "Oct 15 2020", revision = 1)
	public String toString() {
		return "Overrided toString Method";
	}

	@Deprecated
	@MethodInfo(comments = "deprecated method", date = "Oct 15 2020")
	public static void oldMethod() {
		System.out.println("Old Method, not to be used!");
	}
}
