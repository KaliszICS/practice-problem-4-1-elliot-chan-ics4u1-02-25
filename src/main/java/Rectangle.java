public class Rectangle {
    
	private double length;
	private double width;
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
    }
	public double getLength() {
		return length;
	}
	public double getWidth() {
		return width;
	}
	public double area() {
		return getLength() * getWidth();
	}
	public double perimeter() {
        if(getLength() != 0 && getWidth() != 0)
		return (getLength() + getWidth()) * 2;
        else
        return 0;

	}
	
}