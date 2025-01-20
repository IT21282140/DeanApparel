package apparels.Modal;

public class Cart extends Product {
	private int rate;
	private double quality;
	
	public Cart() {
		super();
		
	}
	
	public Cart(int rate, double quality) {
		super();
		this.rate = rate;
		this.quality = quality;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	public double getQuality() {
		return quality;
	}

	public void setQuality(double quality) {
		this.quality = quality;
	}
	
	
}
