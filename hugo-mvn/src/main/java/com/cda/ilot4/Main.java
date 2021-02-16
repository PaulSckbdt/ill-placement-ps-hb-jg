package com.cda.ilot4;

import org.apache.bcel.Repository;
import org.apache.bcel.classfile.JavaClass;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException {

		JavaClass clazz = Repository.lookupClass("java.lang.String");
		System.out.println(clazz);

	}

}
