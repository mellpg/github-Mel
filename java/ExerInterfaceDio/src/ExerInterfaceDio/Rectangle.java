package ExerInterfaceDio;

public record Rectangle(double height, double base) implements GeometricArea {

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return height * base;
	}
	
	

}
