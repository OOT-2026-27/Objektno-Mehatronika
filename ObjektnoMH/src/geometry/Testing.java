package geometry;

public class Testing {

	public static void main(String[] args) {
		
		Point p1 = new Point();
		
		p1.setX(50);
		p1.setY(20);
//		(50,20)
		
		Point p2 = new Point();
		p2.setX(40);
		p2.setY(30);
//		(40,30)
//		10*10 + 10*10 = 200
//		System.out.println(p1.distance(p2));
		
		
//		p1 = (50,20), p2 = (40,30)
		p1 = p2;
		p1.setX(200);
//		(200,30)
		System.out.println(p2.getX());
		p2.setY(100);
//		(200,100)
		System.out.println(p2.getY());
		
//		p2 = p1;
		
//		VEZBA 3
		
		Line l1 = new Line();
		l1.setStartPoint(p1);
		l1.setEndPoint(p2);
		System.out.println(l1.getStartPoint());
		System.out.println(l1.getEndPoint());
		System.out.println(l1.isSelected());
		System.out.println(l1.getStartPoint().getX());
		
		
	}

}
