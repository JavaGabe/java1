package booleans;

public class Booleans {

   
    public static void main(String[] args) {
        int x,y,z;
        boolean a,b,c,d,e,f;
        x=3;
        y=4;
        a= x==y;
        b= x!=y;
        c= x>y;
        d= x<y;
        e= x>=y;
        f= x<=y;
        System.out.println(x + " is equal to " + y + ": " + a);
        System.out.println(x + " is not equal to " + y + ": " + b);
        System.out.println(x + " is greater than " + y + ": " + c);
        System.out.println(x + " is less than " + y + ": " + d);
        System.out.println(x + " is greater than or equal to " + y + ": " + e);
        System.out.println(x + " is less than or equal to " + y + ": " + f);
    
        z=4;
        a= x==z;
        //== means equal to
        b= x!=z;
        //!= means not equal to
        c= x>z;
        //> means greater than
        d= x<z;
        //< means less than
        e= x>=z;
        //>= means greater than or equal to
        f= x<=z;
        //<= means less than or equal to
        System.out.println(x + " is equal to " + z + ": " + a);
        System.out.println(x + " is not equal to " + z + ": " + b);
        System.out.println(x + " is greater than " + z + ": " + c);
        System.out.println(x + " is less than " + z + ": " + d);
        System.out.println(x + " is greater than or equal to " + z + ": " + e);
        System.out.println(x + " is less than or equal to " + z + ": " + f);
        String s1 = "Good morning.";
        String s2 = "Hi there!";
        String s3 = "Howdy, partner!";
        boolean a1 = s1.equals(s2);
        int g = s1.compareTo(s2);
        int h = s2.compareTo(s3);
        System.out.println(a1);
        System.out.println(g);
        System.out.println(h);
        boolean b1 = true;
        boolean b2 = false;
        System.out.println("True and false: "+(b1 && b2));
        System.out.println("Not true and false: "+(!b1 && b2));
        System.out.println("True and not false: "+(b1 && !b2));
        System.out.println("True or false: "+(b1||b2));
        System.out.println("Not true or not false: "+(!b1||!b2));
        
    }
    
}