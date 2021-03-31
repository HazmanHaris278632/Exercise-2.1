
public class Main {

	public static void main(String[] args) {
		Motorcycle Sportbike = new Motorcycle();
		Sportbike.brand = "Honda";
		Sportbike.colour = "Blue";
		Sportbike.type = "Sportbike";
		System.out.println("Motorcycle 1 : ");
		System.out.println("Brand : " + Sportbike.brand);
		System.out.println("Colour : " + Sportbike.colour);
		System.out.println("Type : " + Sportbike.type);
		Sportbike.canMove();
		
		System.out.println();
		
		Motorcycle Scooter = new Motorcycle();
		Scooter.brand = "BMW";
		Scooter.colour = "Red";
		Scooter.type = "Scooter";
		System.out.println("Motorcycle 2 : ");
		System.out.println("Brand : " + Scooter.brand);
		System.out.println("Colour : " + Scooter.colour);
		System.out.println("Type : " + Scooter.type);
		Scooter.canMove();
		
		System.out.println();
		
		Motorcycle Offroad = new Motorcycle();
		Offroad.brand = "KTM";
		Offroad.colour = "Yellow";
		Offroad.type = "Offroad";
		System.out.println("Motorcycle 3 : ");
		System.out.println("Brand : " + Offroad.brand);
		System.out.println("Colour : " + Offroad.colour);
		System.out.println("Type : " + Offroad.type);
		Offroad.canMove();
		

	}

}
