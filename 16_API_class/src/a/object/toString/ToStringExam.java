package a.object.toString;

public class ToStringExam {

	public static void main(String[] args) {
		Object obj = new Object();
		//return getClass().getName() + "@" + Integer.toHexString(hashCode());
		System.out.println(obj.toString());
		
		obj = new Person("최기근",184,75);
		System.out.println(obj);
	}

}




