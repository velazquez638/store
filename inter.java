package store;



import java.util.Locale;
import java.util.ResourceBundle;

public class inter {
	
	
	static String language = System.getProperty("user.country");
    static String country = System.getProperty("user.language");
	
    
    static String sring1;
    static String sring2;
	static String sring3;
    static String sring4;
    static String sring5;
    static String sring6;

	
	
	protected static void setLanguage(String language ) {
		inter.language = language;
	}

	protected static void setCountry(String country) {
		inter.country = country;
	}



	public static void translate() {
		
		
	        Locale currentLocale;
	        ResourceBundle messages;

	        currentLocale = new Locale(language, country);

	        messages = ResourceBundle.getBundle("MessagesBundle", currentLocale);
	        
	        sring1 = messages.getString("inicio");
	        sring2 = messages.getString("comprar");
	        sring3 = messages.getString("buscar");
	        sring4 = messages.getString("encuesta");
	        sring5 = messages.getString("datos_cuenta");
	        sring6 = messages.getString("salir");
	        
	}
	
	 protected static String getSring1() {
			return sring1;
	}

	protected static String getSring2() {
			return sring2;
	}

	protected static String getSring3() {
			return sring3;
	}
	protected static String getSring4() {
		return sring4;
	}
	
	protected static String getSring5() {
		return sring5;
	}
	protected static String getSring6() {
		return sring6;
	}
}