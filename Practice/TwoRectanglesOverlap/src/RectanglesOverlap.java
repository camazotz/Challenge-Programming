
public class RectanglesOverlap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point l1 = new Point(), l2 = new Point(), m1 = new Point(), m2 = new Point();
		
		l1.x = 0;
		l1.y = 10;
		l2.x = 10;
		l2.y = 0;
	    m1.x = 5;
	    m1.y = 5;
	    m2.x = 15;
	    m2.y = 0;
	    if (isOverlap(l1, l2, m1, m2))
	        System.out.println("Rectangles Overlap");
	    else
	        System.out.println("Rectangles Don't Overlap");
	    
		//isOverlap(l1, l2, m1, m2);
	}
	
	public static boolean isOverlap(Point l1, Point l2, Point r1, Point r2)
	{
		if (l1.x > r2.x || l2.x > r1.x)
		{
			return false;
		}
		
		if (l1.y < r2.x || l2.y < r1.y)
		{
			return false;
		}
		
		return true;
	}

}
