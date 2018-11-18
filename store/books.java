package store;

public class books {

  
	 String categorie = " ";
     String book_name = " ";
     String writer = " ";
     double price;
     int units;
      boolean stock;
      boolean compra;

	public books(String _categorie, String _book_name, String _writer, double _price, int _units, boolean stock, boolean compra) {
		categorie = _categorie;
		book_name = _book_name;
		writer = _writer;
		price = _price;
		units = _units;
		this.stock = stock;
		this.compra = compra;
	}
	 public boolean getStock() {
			return stock;
		}

		public void setStock(boolean stock) {
			this.stock = stock;
		}

		public boolean getCompra() {
			return compra;
		}

		public void setCompra(boolean compra) {
			this.compra = compra;
		}
    public String getCategorie() {
			return categorie;
		}
	public void setCategorie(String categorie) {
			this.categorie = categorie;
		}
	 public int getUnits() {
		return units;
	}
	public void setUnits(int units) {
		this.units = units;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
