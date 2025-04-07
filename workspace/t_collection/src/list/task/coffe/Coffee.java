package list.task.coffe;

import java.util.Objects;

public class Coffee {
	private String name;
	private int price;
	private int stock;
	private String kind;
	
	public Coffee () {;}

	public Coffee(String bean, int price, int stock, String kind) {
		super();
		this.name = bean;
		this.price = price;
		this.stock = stock;
		this.kind = kind;
	}

	@Override
	public String toString() {
		return "Coffee [bean=" + name + ", price=" + price + ", stock=" + stock + ", kind=" + kind + "]";
	}

	public String getBean() {
		return name;
	}

	public void setBean(String bean) {
		this.name = bean;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coffee other = (Coffee) obj;
		return Objects.equals(name, other.name);
	}

	

	

}
