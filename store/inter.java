package store;



import java.util.Locale;
import java.util.ResourceBundle;

public class inter {
	
	
	static String language = System.getProperty("user.country");
    static String country = System.getProperty("user.language");
	
    
    static String string1;
    static String string2;
	static String string3;
    static String string4;
  
    static String string5;
    static String string6;
    
  
    public inter(String language1, String country1, String string11, String string21, String string31, String string41,String string51, String string61) {
  		language1=language;
  		country1=country;
  		string11=string1;
  		string21=string2;
  		string31=string3;
  		string41=string4;	
  		string51=string5;
  		string61=string6;
  		
  	}
  

	public static void translate() {
		
		
        Locale currentLocale;
        ResourceBundle messages;

        currentLocale = new Locale(language, country);

        messages = ResourceBundle.getBundle("MessagesBundle", currentLocale);
        
        string1 = messages.getString("inicio");
        string2 = messages.getString("comprar");
        string3 = messages.getString("buscar");
        string4 = messages.getString("encuesta"); 
        string5 = messages.getString("datos_cuenta");
        string6 = messages.getString("salir");
        

        
}

   public static void setLanguage(String language ) {
		inter.language = language;
	}

    public static void setCountry(String country) {
		inter.country = country;
	}

	
	 public static String getSring1() {
			return string1;
	}

	 public static String getSring2() {
			return string2;
	}

	 public static String getSring3() {
			return string3;
	}
	 public static String getSring4() {
		return string4;
	}
	

	 public static String getSring5() {
			return string5;
		}
	 public static String getSring6() {
		return string6;
	}

	public String language() {
		
		return language;
	}

	public String country() {
		
		return country;
	}
}