
public enum TestEnum {
	// 1) enum class first line must end with ;
	
	// 2) enum class is a final class that extend java.lang.Enum
	
	// 3) VARIABLES INSIDE ENUM CLASS IS PUBLIC STATIC FINAL thus can be accessed
	// from any where
	
	// 4) enum can be created inside and out aside any class but not inside a method
	
	// 5) java.lang.Enum implements the serializable interface and comparable
	// interface
	
	// SWITCH CASE
	// 6) enum can be used with in switch statment but all cases must be valid enum
	// value ow exception will be thrown
	// enum Bear { KF,KO,RC;}
	// class Test {public static void main (String args[])
    //Bear b1 = Bear.KF;switch(b1)
    //{
    //case KF : 
    //	System.out.println("its is kf");
    //	break ; 
    //case KO : 
    //	System.out.println("its is ko ");
    //	break ; 
    //case RC :
    //	System.out.println("its Rc");
    //	break; 
    //	default :
    //	System.out.println("default case ");
  //}
}
