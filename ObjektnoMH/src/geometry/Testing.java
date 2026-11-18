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
//		System.out.println(p2.getX());
		p2.setY(100);
//		(200,100)
//		System.out.println(p2.getY());
		
//		p2 = p1;
		
//		VEZBA 3
		
		Line l1 = new Line();
		l1.setStartPoint(p1);
		l1.setEndPoint(p2);
//		System.out.println(l1.getStartPoint());
//		System.out.println(l1.getEndPoint());
//		System.out.println(l1.isSelected());
//		System.out.println(l1.getStartPoint().getX());
		
//		VEZBA 4
//		public Rectangle(Point upperLeft, int width, int height){...}
		Rectangle r1 = new Rectangle(new Point(20,20), 50, 50);
		
//		toString je zaduzena za tekstualnu reprezentaciju
//		System.out.println(r1.toString());
//		System.out.println(r1);
		
//		equals je zaduzena za poredjenje referenci
		Rectangle r2 = r1;
		Rectangle r3 = new Rectangle(new Point(20,20),50,50);
//		System.out.println(r1.equals(r2));
//		System.out.println(r1.equals(r3));
		
//		System.out.println("Da li su pravougaonici instance klase Object?");
//		instanceof je operator koji proverava da li je objekat instanca neke klase
//		System.out.println(r1 instanceof Object);
//		r1 je Rectangle, ali objekat na koji pokazuje je vise stvari istovremeno
		Object ob = new Object();
//		System.out.println("Objekti klase Object nisu instance bilo koje druge klase");
//		System.out.println(ob instanceof Rectangle);
		
//		System.out.println("Testiranje toString metode:");
//		System.out.println(p1);
		p2 = new Point(200,100);
		
//		System.out.println("Testiranje equals metode:");
//		System.out.println(p1.equals(r1));
//		System.out.println(p1.equals(p2));
//		System.out.println(p1.equals(ob));
		
		
//		VEZBE 5
//		upperLeft X = 20, upperLeft Y = 20, width i height = 50
		Point click = new Point(20,50);
//		System.out.println(r1.contains(click));
		Circle c1 = new Circle(new Point(30,30), 30);
//		System.out.println(c1.contains(click));
		
		Donut d1 = new Donut(new Point(50,50), 100, 30);
		System.out.println("Centar kruga je: " + d1.getCenter());
		System.out.println("Poluprecnik velikog kruga je: " + d1.getRadius());
		System.out.println("Povrsina donuta je: " + d1.area());
		System.out.println(d1);
		
		System.out.println(d1 instanceof Donut);
		System.out.println(d1 instanceof Circle);
		System.out.println(d1 instanceof Object);
		
		System.out.println(c1 instanceof Donut);
		
		
		
		
	}

}
