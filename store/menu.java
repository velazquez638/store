package store;

import com.mitecode.inter.CuentaBancoAImpl;
import com.mitecode.inter.Icuenta;
import com.mitecode.model.cuenta;
import com.mitecode.proxy.cuentaProxy;

import java.util.Scanner;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;


public class menu {
	
// the program use two different list one of the list for books an other for costumers	 
	
	static int number3 = 0;
	
	
	static List<books> books_list = new ArrayList<books>();
	static List<costumer> costumer_list = new ArrayList<costumer>();

	
	
	public static void sing_in () {
		
		@SuppressWarnings("resource")
		Scanner respuesta1=new Scanner(System.in);
		int respuesta = 0;
		while (respuesta!=3) {
			System.out.println("\tselect de option");
			System.out.println(" -1- administrator");
			System.out.println(" -2- new user");
			System.out.println(" -3- come back to the main menu");

			respuesta = respuesta1.nextInt();
			
			switch (respuesta) {
			
			case 1: 
				
//-----------------------------------------------------------------------------------------------------------------------------------------
	   // we only have access if we have an other different user name an other password
	   // the program recognize two different user names and two different passwords
				
				String na = "";
				String pass = "";
				
				try(FileReader reader =  new FileReader("config")) {
					
			        Properties properties = new Properties();
			        properties.load(reader);
			        
			       
			       
			       String username = properties.getProperty("user_name");
			       String password = properties.getProperty("password");
			   
			        
			        na = username;
			        pass = password;
  
			       }catch (Exception e) {
			       
			       e.printStackTrace();
			       
			       }
				
				Scanner df = new Scanner(System.in);
				@SuppressWarnings("unused") Scanner dt = new Scanner(System.in);
				String user_ = "";
				String password_ = "";
				
				System.out.println("Introduce user name :");
				user_ = df.nextLine();
				System.out.println("Introduce password:");
				password_ = df.nextLine();
				
				
	
						
				
				if(user_.equals(na) && password_.equals(pass)) {

				@SuppressWarnings("resource")
				Scanner respuesta5=new Scanner(System.in);
				int respuesta4 = 0;
				
				while (respuesta4!=2) {
					System.out.println("\tselect de option");
					System.out.println(" -1- show all costumers");
					System.out.println(" -2- come back");
					respuesta4 = respuesta5.nextInt();
//---------------------------------------------------------------------------------------------------------------------------------------------------------------------
					
				
			switch(respuesta4)	{
			case 1:
				// the program save the names and passwords, these names and passwords only can checking by the administrator 
				
				for (int i = 0; i <= costumer_list.size()-1; i++) {
					System.out.println("NAME: " + costumer_list.get(i).getName() + ", USER NAME: " + costumer_list.get(i).getUser_name() + ", EMAIL: "+ costumer_list.get(i).getEmail() );
					System.out.println(" ");
		        }
				break;
			case 2:
				break;
			}
			
				}
		}
				else{
					System.out.println("------------------------------------");
					System.out.println("Sorry you dont have acces");
					System.out.println("------------------------------------");

					System.out.println("");
					break;
				}
				break;
             	
				
				
		
				
			case 2: 
				
				
				
                Scanner scn=new Scanner(System.in);
				String name = " ";
				System.out.println("introduce you name");
				name=scn.nextLine();

				String user_name = " ";
				System.out.println("introduce you user name");
				user_name=scn.nextLine();

				@SuppressWarnings("unused") String password =" ";
				System.out.println("introduce your password");
				password=scn.nextLine();

				String email=" ";
				System.out.println("introduce your email");
				email=scn.nextLine();
				
			// the program add the dates in a list 	
				
				costumer_list.add(new costumer(name, user_name, email));
		
				
				
		//-----------------------------------------------------------------------------------------------------------------------------	
				
		// we create a file which save the user list in the desktop.	
				
				
			String j = "\r\n";
			String s = "";
			String a = "";
			

			try {
				
		//we define the place of the file in our pc
				
				File f = new File("C:\\Users\\alvar\\Desktop/users.txt");
				
				
				if(f.exists()) {
					
					f.delete();
					f.createNewFile();
					
				}
	
				FileWriter f2 = new FileWriter(f, true);

				for(int i = 0;i<costumer_list.size();i++) {
					
					

					f2.write("name :" + costumer_list.get(i).getName() + " || user name :" + costumer_list.get(i).getUser_name()+" || email :" + costumer_list.get(i).getEmail() );
					f2.write(s);
					f2.write(j);
					f2.write(a);
				

				}
				f2.close();

			} catch (IOException e) {
			
				e.printStackTrace();
			}
		 		
        //---------------------------------------------------------------------------------------------------------------------------------------------------
				break;
				
				
				
			case 3:

				break;
	
			}
			
			
			}
		
	}
	
	public static void search() {
		
	
	
	

		@SuppressWarnings("resource")
		Scanner respuesta1=new Scanner(System.in);
		int respuesta = 0;
		while (respuesta!=6) {
			System.out.println("\tselect de option");
			System.out.println(" -1- horror");
			System.out.println(" -2- thriller");
			System.out.println(" -3- comedi");
			System.out.println(" -4- action");
			System.out.println(" -5- show all books");
			System.out.println(" -6- come back to the main menu ");
			respuesta = respuesta1.nextInt();
		
		switch (respuesta) {
			
		
		
		// the program show the different categories that we have in the list.
		
		
		case 1:
			
				String cat = "-Horror-";
			
			for(int i = 0;i<books_list.size();i++) {
			
			if(cat.equals(books_list.get(i).categorie)) {
				
				int t = i+1;
				System.out.println("---------------------");
				System.out.println("Book Number : "+ t);
				System.out.println("Book name : "+books_list.get(i).book_name);
				System.out.print(" Writer : "+ books_list.get(i).writer);
				System.out.print(" Price : "+ books_list.get(i).price);
				System.out.print(" Units : "+ books_list.get(i).units);
				System.out.println("");			
			}	
			}
			
			break;
		case 2:
	String cat1 = "-thriller-";
			
			for(int i = 0;i<books_list.size();i++) {
			
			if(cat1.equals(books_list.get(i).categorie)) {
				
				int t = i+1;
				System.out.println("---------------------");
				System.out.println("Book Number : "+ t);
				System.out.println("Book name : "+books_list.get(i).book_name);
				System.out.print(" Writer : "+ books_list.get(i).writer);
				System.out.print(" Price : "+ books_list.get(i).price);
				System.out.print(" Units : "+ books_list.get(i).units);
				System.out.println("");
		
			}
			}

			break;
			
		case 3:
	String cat2 = "-comedi-";
			
			for(int i = 0;i<books_list.size();i++) {
			
			if(cat2.equals(books_list.get(i).categorie)) {
				
				int t = i+1;
				System.out.println("---------------------");
				System.out.println(" Book Number : "+ t);
				System.out.println("Book name : "+books_list.get(i).book_name);
				System.out.print(" Writer : "+ books_list.get(i).writer);
				System.out.print(" Price : "+ books_list.get(i).price);
				System.out.print(" Units : "+ books_list.get(i).units);
				System.out.println("");		
			}		
			}
		
			break;
			
		case 4:
	        String cat3 = "-action-";
			
			for(int i = 0;i<books_list.size();i++) {
			
			if(cat3.equals(books_list.get(i).categorie)) {
				
				int t = i+1;
				System.out.println("---------------------");
				System.out.println("Book Number : "+ t);
				System.out.println("Book name : "+books_list.get(i).book_name);
				System.out.print(" Writer : "+ books_list.get(i).writer);
				System.out.print(" Price : "+ books_list.get(i).price);
				System.out.print(" Units : "+ books_list.get(i).units);
				System.out.println("");		
			}	
			}
			break;
			
		case 5:
			
			 System.out.println(" ");
			System.out.println("-----------------------------------");
			
	     // the program show all books in the list.
			
	        for (int i = 0; i <= books_list.size()-1; i++) {
	            System.out.println("-Categorie book: " + books_list.get(i).categorie + " -BOOK NAME: " + books_list.get(i).book_name + " -WRITER: "+ books_list.get(i).writer + " " + " -PRICE: " + books_list.get(i).price + " -BOOK UNITS: " + books_list.get(i).units);
	            
	        }
	        System.out.println("-----------------------------------");
			break;
					
		case 6:
			break;
			
			}
			
		}
	}
	
	public static void buy_books() {
			
			@SuppressWarnings("resource")
			Scanner respuesta1=new Scanner(System.in);
			int respuesta = 0;
			
			while(respuesta!=4) {
			System.out.println("choose the option");
			
					System.out.println(" -1- buy book");
					System.out.println(" -2- change coin");
					System.out.println(" -3- show cart");
					System.out.println(" -4- come back to the main menu ");

					System.out.println("select a option number");
					respuesta = respuesta1.nextInt();
			
			
			switch(respuesta) {
			
			case 1:
				
		// the program search the book that we want and save that. to show it in other option
				
				Scanner number1= new Scanner(System.in);
				int number = 0;
				System.out.println("introduce the number of the book");
				number = number1.nextInt();
				
				if (books_list.get(number).stock) {
					
					@SuppressWarnings("resource")
					Scanner number2=new Scanner(System.in);
					
					System.out.println("how many books do you want?");
					number3=number2.nextInt();
					
					if(number3 > books_list.get(number).units) {
						
						System.out.println("There are only : "+ books_list.get(number).units+ " units.");
						System.out.println("");
						
					}else {
						
						int numb = books_list.get(number).units - number3;
						books_list.get(number).setUnits(numb);
						books_list.get(number).setStock(true);
						books_list.get(number).setCompra(true);
						
						
						if(books_list.get(number).getUnits() == 0) {
							
							books_list.get(number).setStock(false);
							
							
						}

					}
		
				}
				else {
					System.out.println("\t the product isnt in the stock");

				}
					
			
				
				break;
				
			case 2:
				
		 		@SuppressWarnings("unused") Scanner respuesta2=new Scanner(System.in);
		 		@SuppressWarnings("unused") int respuesta3=0;
		 		Scanner price1=new Scanner(System.in);
	            double price = 0;
			    System.out.println("introduce the price");
				 price = price1.nextInt();
		 		
		 		while(respuesta!=3) {
				System.out.println();

			    System.out.println("choose the opcion:");
				System.out.println();

				System.out.println("euros in to dollars: select 1");
				System.out.println("dollars in to euros: select 2");
				System.out.println("to come back to menu: select 3");

				 respuesta = respuesta1.nextInt();
				 
				 switch(respuesta) {
				 
				 case 1:
					 double price2 = 0;
					 price2 = price * 1.15;
						System.out.println("---------------------------" );
						System.out.println(price + "€ son "+ price2 + "$" );
						System.out.println("---------------------------" );
						System.out.println();

					 break;
				 case 2:
					 double price3 = 0;
					 price3 =  price / 1.15;
					    System.out.println("---------------------------" );
						System.out.println(price + "$ son "+ price3 + "€" );
						System.out.println("---------------------------" );
						System.out.println();

					 break;
				 }
					
		 		}
				
				
			break;
			case 3:
				
				System.out.println("Products : ");
				
				System.out.println("-----------------------------------");
				
				//the program show all book that we have bought
				
		        for (int i = 0; i <= books_list.size()-1; i++) {
		        	
		        	if(books_list.get(i).getCompra()) {
		        	
		        	
		            System.out.println("Categorie book: " + books_list.get(i).categorie + "BOOK NAME: " + books_list.get(i).book_name + " WRITER: "+ books_list.get(i).writer + " " + "PRICE: " + books_list.get(i).price + " BOOK UNITS: " + books_list.get(i).units);
		            System.out.println("-----------------------------------");
		        	}
		        	
		        }

				break;
			case 4:
				
				break;
		
		}
			}
		}

		
	public static void survey(String[] args) {
			
			// we use a Singleton method
			
			sur a =sur.getconfigurador("", "", "");
			@SuppressWarnings("resource")
			Scanner respuesta2=new Scanner(System.in);
			int respuesta = 0;
			
			while(respuesta!=4) {
				System.out.println("");
				System.out.println("");

				System.out.println("--------------- welcome to de survey:-----------------------");
				System.out.println("");
				System.out.println("select a option number");
				System.out.println("");
				System.out.println("-1- i´m disappointed");
				System.out.println("-2- i think there are wrong thins");
				System.out.println("-3- i´m satisfied");
				System.out.println("-4- come back to the main menu");
				System.out.println("");
				System.out.println("-----------------------------------------------------------");


			    respuesta = respuesta2.nextInt();
		
			
			switch(respuesta) {
			case 1:
				System.out.println(a.getOne());
                
				break;
				
			case 2: 
				
				System.out.println(a.getFive());

				 break;
	
			case 3: 
				System.out.println(a.getTen());

				break;
			case 4:
				break;
			

			}
			
		}
		}
		
	public static void saldo(String[] args) {
			
			cuenta c = new cuenta (1020345, "Sergio", 1000);
			System.out.println("datos desde su ultimo ingreso:");
			System.out.println("");

			System.out.println("Costumer ID: " + cuenta.IDusuario);
			System.out.println("User name: " + cuenta.usuario);

			Icuenta cuentaProxy = new cuentaProxy(new CuentaBancoAImpl());
		
			c=cuentaProxy.depositarDinero(c,500);
			c=cuentaProxy.retirarDinero(c,20);
		

		}
		
		
		
	@SuppressWarnings("static-access")
	public static void main(String[] args) throws IOException {
		
		
		
		
		// all books that we have in the list
		
		books_list.add(new books("-Horror-", "las Almas", "Pepe Villuela", 20.00 , 6, true, false));
		books_list.add(new books("-Horror-", "el Bosque oscuro", "Andres de la Huerta", 19.99 , 12, true, false));
		books_list.add(new books("-Horror-", "las Calles", "Sergio Perez", 15.45 , 24, true, false));
		books_list.add(new books("-Horror-", "el Camino", "Ana Claus", 10.00 , 3, true, false));
		books_list.add(new books("-Horror-", "la Carretera", "Marian Dos", 30.50 , 60, true, false));
		
		
		books_list.add(new books("-thriller-", "las luces", "Mario Gaus", 26.00 , 9, true, false));
		books_list.add(new books("-thriller-", "el dia mas oscuro", "Macian Perez", 12.99 , 100, true, false));
		books_list.add(new books("-thriller-", "las niñas del patio", "Paco Sanz", 5.45 , 4, true, false));
		books_list.add(new books("-thriller-", "el señor de la puerta", "Roberto Alamo", 15.00 , 35, true, false));
		books_list.add(new books("-thriller-", "la señal", "Luis el Pillo", 35.50 , 0, true, false));
		
		
		books_list.add(new books("-comedi-", "la familia", "Perez Saul", 22.00 , 8, true, false));
		books_list.add(new books("-comedi-", "el partido", "Felix ", 19.99 , 12, true, false));
		books_list.add(new books("-comedi-", "Rey", "Pepita", 19.45 , 24, true, false));
		books_list.add(new books("-comedi-", "el sendero", "Marcos Sender", 11.00 , 25, true, false));
		books_list.add(new books("-comedi-", "la milla", "Pedro Alarcon", 30.50 , 8, true, false));
		
		
		books_list.add(new books("-action-", "el aniquilador", "Tomas Turbao", 20.10 ,48, true, false));
		books_list.add(new books("-action-", "oscuro", "Aranceli Diaz", 99.99 , 1, true, false));
		books_list.add(new books("-action-", "Calles vacias", "Sergio Perez", 25.45 , 4, true, false));
		books_list.add(new books("-action-", "el senador", "Martin Lutero", 15.00 , 9, true, false));
		books_list.add(new books("-action-", "la momia", "Velax Turbo", 40.50 , 20, true, false));
		
		
		System.out.println("\twelcome to the velax's store ");
		System.out.println("");

	//------------------------------------------------------------------------------------------------------------------------------------
	// we only have access if we have the true user name and the true password
		
		
		
		String na1 = "";
		String pass1 = "";
		
		try(FileReader reader =  new FileReader("config")) {
			
	        Properties properties = new Properties();
	        properties.load(reader);
	        
	       
	       
	       String username = properties.getProperty("user_name1");
	       String password = properties.getProperty("password1");
	   
	        
	        na1 = username;
	        pass1 = password;

	       }catch (Exception e) {
	       
	       e.printStackTrace();
	       
	       }
		
		@SuppressWarnings("resource")
		Scanner df1 = new Scanner(System.in);
		@SuppressWarnings({ "unused", "resource" })
		Scanner dt1 = new Scanner(System.in);
		String user1_ = "",password1_ = "";
		
		System.out.println("Introduce your user name :");
		user1_ = df1.nextLine();
		System.out.println("Introduce your password:");
		password1_ = df1.nextLine();
		

		if(user1_.equals(na1) && password1_.equals(pass1)) {
    
	//------------------------------------------------------------------------------------------------------------------------------------
	
			
			
			
	    	try {
			
				inter.translate();
				
				int idioma = 0;
				
				 String i = "";
			     String r = "";
				
				while(idioma != 4) {
				
				
				@SuppressWarnings("resource")
				Scanner idi = new Scanner(System.in);
				System.out.println("");
				System.out.println("");
				System.out.println("seleccione su idioma");

				System.out.println("-1- Español");
				System.out.println("-2- Francais");
				System.out.println("-3- English");
				System.out.println("-4- Aleman");
				
				idioma = idi.nextInt();
				
				if(idioma == 1) {
					
					i = "es";
					r = "ES";
				}
				if(idioma == 2) {
					
					i = "fr";
					r = "FR";
					
				}
				if(idioma == 3) {
					
					i = "in";
					r = "IN";
					
				}
                if(idioma == 4) {
					
					i = "al";
					r = "AL";
					
				}
          
				
				
				if(idioma !=1 && idioma != 2 && idioma !=3 && idioma !=4) {
					
					System.out.println("Invalid option.");
					break;
					
				}
				@SuppressWarnings("resource")
				Scanner res1=new Scanner(System.in);
				int res = 0;
				
				inter.setCountry(i);
				inter.setLanguage(r);
				

				inter.translate();
				System.out.println("");
				System.out.println("");
				System.out.println("\twelcome to the velax´s shop");
				System.out.println("");

				System.out.println("-1-" + inter.getSring1());
		        System.out.println("-2-" + inter.getSring2());
		        System.out.println("-3-" + inter.getSring3());
		        System.out.println("-4-" + inter.getSring4());	
		        System.out.println("-5-" + inter.getSring5());
		        System.out.println("-6-" + inter.getSring6());
				System.out.println("select one: ");
				

		        res = res1.nextInt();

                 menu j = new menu();
				
				switch(res) {
				case 1:
					
					j.sing_in();
					break;
					
				case 2: 
					
					 j.search();
					 break;
		
				case 3: 
					
					 j.buy_books();
					break;
				case 4:
					
					j.survey(args);
					
					break;
				case 5:
					
					j.saldo(args);
					
					break;
				case 6: 
					System.out.println("\tthanks come back soon");
					break;

				}
				
				}

				
				}	catch (Exception e)	{
					
		      System.out.println("\tTHIS OPERATION IS UNVIABLE");

			}
			
		} else {
			
			System.out.println("\t----------------------------");
			System.out.println("\t|   YOU DON´T HAVE ACESS   |");
			System.out.println("\t----------------------------");


		}
	
	}
		
	
	}
	
	

