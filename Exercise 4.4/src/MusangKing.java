
public class MusangKing extends Durian {

	private String colour; 
	private String shape;
	
	public MusangKing(String name, String b, double w, double p, String c, String s) {
		super(name, b, w, p);
		this.colour = c;
		this.shape = s; 
	}
	public String getColour() {
		return this.colour;
	}
	public String getShape() {
		return this.shape;
	}
	
	public String toString() {
		return ("Price : RM" + calPrice() + "\n"
				+ "The Benefits: " + getBenefits() + "\n"
				+ "Weight : " + getWeight() + "\n"
				+ "Colour: " + getColour() + "\n"
				+ "The shape of " + getName() + " is " + getShape());
	}
}
