package geometry;

public class Circle {

	protected Point center;
	protected int radius;
	private boolean selected;
	
	public Circle() {
		
	}
	
	public Circle(Point center, int radius) {
		this.center = center;
		this.radius = radius;
	}
	
	public Circle(Point center, int radius, boolean selected) {
		this(center,radius);
		this.selected = selected;
	}
	
	public double circumference() {
		return 2*radius*Math.PI;
	}
	
	public double area() {
		return Math.PI * radius * radius;
	}
	
	public boolean contains(int x, int y) {
		return center.distance(new Point(x,y)) <= radius;
	}
	
	public boolean contains(Point click) {
		return contains(click.getX(), click.getY());
	}
	
	@Override
	public String toString() {
		return String.format("Center: (%s, %s), radius: %s", center.getX(), center.getY(), radius);
	}
	
	@Override
	public boolean equals(Object o) {
		if(o instanceof Circle) {
			Circle temp = (Circle)o;
			if(radius == temp.getRadius()) {
				return true;
			}
		}
		return false;
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
