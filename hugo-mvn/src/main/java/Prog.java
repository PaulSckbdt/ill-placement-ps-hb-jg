import org.apache.bcel.Repository;
import org.apache.bcel.classfile.JavaClass;

public class Prog {

	public static void main(String[] args) throws ClassNotFoundException {
		JavaClass clazz = Repository.lookupClass("java.lang.String");
		System.out.println(clazz);
	}

}
