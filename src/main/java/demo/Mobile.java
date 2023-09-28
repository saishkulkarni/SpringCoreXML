package demo;

public class Mobile {
	String brand;
	int ram;
	double price;
	
	Sim sim;
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void setSim(Sim sim) {
		this.sim = sim;
	}
	@Override
	public String toString() {
		return "Mobile [brand=" + brand + ", ram=" + ram + ", price=" + price + ", sim=" + sim + "]";
	}
	
	
}
