package store;

import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;


public class menu {
	
	static int number3 = 0;
	static List<books> books_list = new ArrayList<books>();
	static List<costumer> costumer_list = new ArrayList<costumer>();

	
	
	public static void sing_in () {
		
		@SuppressWarnings("resource")
		Scanner respuesta1=new Scanner(System.in);
		int respuesta = 0;
		while (respuesta!=4) {
			System.out.println("\tselect de option");
			System.out.println(" -1- administrator");
			System.out.println(" -2- user");
			System.out.println(" -3- new user");
			System.out.println(" -4- come back to the main menu");

			respuesta = respuesta1.nextInt();
			
			switch (respuesta) {
			
			case 1: 
				
	//-----------------------------------------------------------------------------		
				
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
				Scanner dt = new Scanner(System.in);
				String user_ = "",password_ = "";
				
				System.out.println("Introduce user name :");
				user_ = df.nextLine();
				System.out.println("Introduce password:");
				password_ = df.nextLine();
				
				
	
				
	//----------------------------------------------------------------------------------			
				
				if(user_.equals(na) && password_.equals(pass)) {

				Scanner respuesta5=new Scanner(System.in);
				int respuesta4 = 0;
				
				while (respuesta4!=2) {
					System.out.println("\tselect de option");
					System.out.println(" -1- show all costumers");
					System.out.println(" -2- come back");
					respuesta4 = respuesta5.nextInt();
				
				
			switch(respuesta4)	{
			case 1:
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
					
					System.out.println("Sorry you dont have acces");
					break;
				}
				break;
             	
				
			case 2:
				Scanner scn1 = new Scanner(System.in);
				String name1=" ";
				System.out.println("introduce you user name");
				name1=scn1.nextLine();
				String password1=" ";
				System.out.println("introduce your password");
				password1=scn1.nextLine();
				
			
				break;
				
			case 3: 
				
				
				
                Scanner scn=new Scanner(System.in);
				String name = " ";
				System.out.println("introduce you name");
				name=scn.nextLine();

				String user_name = " ";
				System.out.println("introduce you user name");
				user_name=scn.nextLine();

				String password =" ";
				System.out.println("introduce your password");
				password=scn.nextLine();

				String email=" ";
				System.out.println("introduce your email");
				email=scn.nextLine();
				
				costumer_list.add(new costumer(name, user_name, email));
				
				
				
				break;
				
				
				
			case 4:
				
				
				break;

			
			
				
			}
			
			
			}
		
	}
	
	public static void search() {
		
	
	
	

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
			
		case 1:
			
				String cat = "-Horror-";
			
			for(int i = 0;i<books_list.size();i++) {
			
			if(cat.equals(books_list.get(i).categorie)) {
				
				int t = i+1;
				System.out.println("---------------------");
				System.out.println("Book Number : "+ t);
				System.out.println("Book name : "+books_list.get(i).book_name);
				System.out.print("Writer : "+ books_list.get(i).writer);
				System.out.print("Price : "+ books_list.get(i).price);
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
				System.out.print("Writer : "+ books_list.get(i).writer);
				System.out.print("Price : "+ books_list.get(i).price);
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
				System.out.print("Writer : "+ books_list.get(i).writer);
				System.out.print("Price : "+ books_list.get(i).price);
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
				System.out.print("Writer : "+ books_list.get(i).writer);
				System.out.print("Price : "+ books_list.get(i).price);
				System.out.print(" Units : "+ books_list.get(i).units);
				System.out.println("");		
			}	
			}
			break;
			
		case 5:
			
			 System.out.println(" ");
			System.out.println("-----------------------------------");
	        for (int i = 0; i <= books_list.size()-1; i++) {
	            System.out.println("Categorie book: " + books_list.get(i).categorie + "BOOK NAME: " + books_list.get(i).book_name + " WRITER: "+ books_list.get(i).writer + " " + "PRICE: " + books_list.get(i).price + " BOOK UNITS: " + books_list.get(i).units);
	            
	        }
	        System.out.println("-----------------------------------");
			break;
					
		case 6:
			break;
			
			}
			
		}
	}
	
		public static void buy_books() {
			
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
				
				Scanner number1= new Scanner(System.in);
				int number = 0;
				System.out.println("introduce the number of the book");
				number = number1.nextInt();
				
				if (books_list.get(number).stock) {
					
					Scanner number2=new Scanner(System.in);
					
					System.out.println("how many books do you want?");
					number3=number2.nextInt();
					
					if(number3 > books_list.get(number).units) {
						
						System.out.println("There are only : "+ books_list.get(number).units+ " units.");
						
						
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
				
		 		Scanner respuesta2=new Scanner(System.in);
		 		int respuesta3=0;
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
		        for (int i = 0; i <= books_list.size()-1; i++) {
		        	
		        	if(books_list.get(i).getCompra()) {
		        	
		        	System.out.println("Units : " + books_list.get(i).getUnits());
		            System.out.println("Categorie book: " + books_list.get(i).categorie + "BOOK NAME: " + books_list.get(i).book_name + " WRITER: "+ books_list.get(i).writer + " " + "PRICE: " + books_list.get(i).price + " BOOK UNITS: " + books_list.get(i).units);
		            System.out.println("-----------------------------------");
		        	}
		        }
		        System.out.println("-----------------------------------");
				
				
				
				
				
				break;
			case 4:
				break;
		
		}
			}
		}

	@SuppressWarnings("static-access")
	public static void main(String[] args) throws IOException {
		
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
		
		books_list.add(new books("-action-", "las Almas", "Tomas Turbao", 20.10 ,48, true, false));
		books_list.add(new books("-action-", "el Bosque oscuro", "Aranceli Diaz", 99.99 , 1, true, false));
		books_list.add(new books("-action-", "las Calles", "Sergio Perez", 25.45 , 4, true, false));
		books_list.add(new books("-action-", "el Camino", "Martin Lutero", 15.00 , 9, true, false));
		books_list.add(new books("-action-", "la Carretera", "Velax Turbo", 40.50 , 20, true, false));
		
		
			Scanner respuesta1=new Scanner(System.in);
			int respuesta = 0;
			
			try {
			while(respuesta!=4) {
			System.out.println("\twelcome to velaxs shop select one option");
			
					System.out.println(" -1- sing in");
					System.out.println(" -2- search a book");
					System.out.println(" -3- buy books"); 
					System.out.println(" -4- sing out");
					
					System.out.println("select a option number");
					respuesta = respuesta1.nextInt();
					
					menu j = new menu();
					
					switch(respuesta) {
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
						System.out.println("\tthanks come back soon");
						break;

					}
					
			}
			
			}	catch (Exception e)	{
				System.out.println("\tTHIS OPERATION IS UNVIABLE");

			}
		}
	
		
		
	}
	
	

	
  

