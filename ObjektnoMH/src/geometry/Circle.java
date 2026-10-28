package geometry;

public class Circle {

	private Point center;
	private int radius;
	private boolean selected;
	
	public double circumference() {
		return 2*radius*Math.PI;
	}
	
	public double area() {
		return Math.PI * radius * radius;
	}
	
	public Point getCenter() {
		return center;
	}
	public void setCenter(Point center) {
		this.center = center;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public boolean isSelected() {
		return selected;
	}
	public void setSelected(boolean selected) {
		this.selected = selected;
	}
	
	
}
