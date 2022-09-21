package org.comit.course.Util;

public class Util {
	
	public static int parseId(String id) {
		return (id==null)?0:Integer.parseInt(id.trim());
	
	}

	public static double parsedouble(String price) {
		return (price==null)?0:Double.parseDouble(price.trim());
	
	}

}
