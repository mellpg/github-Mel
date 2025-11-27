package ExerInterfaceDio;

public record Square(double side) implements GeometricArea {

	@Override
	public double getArea() {
		
		return side * side;
	}
	
	

}
