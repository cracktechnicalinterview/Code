package DesignPattern;

class Train implements Cloneable{
	public String color;
	public String type;
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return (Train)super.clone();
	}
}

class GeneralTrain extends Train {
	
	public GeneralTrain(String color, String type) {
		super.color=color;
		super.type=type;
	}
	
	@Override
	protected Train clone() throws CloneNotSupportedException {
		return (GeneralTrain)super.clone();
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Color: "+this.color+" type: "+type;
	}
}

public class PrototypeMain {

	public static void main(String[] args) throws CloneNotSupportedException {
		GeneralTrain g1=new GeneralTrain("Red", "goods");
		System.out.println(g1.toString());
		
		GeneralTrain goodtrain1=(GeneralTrain) g1.clone();
		System.out.println(goodtrain1.toString());
		
		GeneralTrain goodtrain2=(GeneralTrain) g1.clone();
		System.out.println(goodtrain2.toString());
		
		GeneralTrain goodtrain3=(GeneralTrain) g1.clone();
		goodtrain3.setColor("Blue");
		goodtrain3.setType("Carriage");
		System.out.println(goodtrain3.toString());
	}

}
