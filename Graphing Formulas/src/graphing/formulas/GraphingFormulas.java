package graphing.formulas;


public class GraphingFormulas {

    
    public static void main(String[] args) {
	
		//this part will test the functions
		System.out.println(" (0,-3) to (-1,-7) has slope " + slope(0,-3,-1,-7) );
                System.out.println(" (2,8) to (4,-4) has slope " + slope(2,8,4,-4) );
                
		System.out.println(" (0,-3) to (-1,-7) has distance " + distance(0,-3,-1,-7) );
                System.out.println(" (2,8) to (4,-4) has distance " + distance(2,8,4,-4) );
 
	}
 
    
        public static double slope( int x1, int y1, int x2, int y2 )
	{
           double sy = y2-y1;
           double sx = x2-x1;
           double m = sy/sx;
           return m;
	}
        
	public static double distance( int x1, int y1, int x2, int y2 )
	{
           double dx = x2-x1;
           double dy = y2-y1;
           double dx2 = Math.pow(dx,2);
           double dy2 = Math.pow(dy,2);
           double dxy = dx2 + dy2;
           double d = Math.sqrt(dxy);
           return d;
	}
        public static void formula( int x1, int y1, int x2, int y2)
        {    
           System.out.println("y = "+slope(m)+"x - 3");
        }        
    }
