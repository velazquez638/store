package store;

public class sur {

	private String one;
	private String five;
	private String ten;
	private static sur configurador;
	
	 
	 public static sur getconfigurador(String one,String five,String ten) {
	 
	 if (configurador==null) {
	 
	 configurador=new sur(one,five,ten);
	 }
	 return configurador;
	 }
	 
	 private sur(String one,String five, String ten){
	 
	 this.one=one;
	 this.five=five;
	 this.ten=ten;
	 
	 }
	
	public String getOne() {
		System.out.println("if you have any problem you can call to thise number: 683927390");
		return one;
	}

	public void setOne(String one) {
		this.one = one;
	}


	public String getFive() {
		System.out.println("sorry about that we will try to improve");

		return five;
	}

	public void setFive(String five) {
		this.five = five;
	}

	public String getTen() {
		System.out.println("thanks for you opinion come back soon");

		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}




	

}
