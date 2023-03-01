//Multilevel Inheritance
import java.util.*;
interface A
{
  void Area();
  void Perimeter();
}
class circle implements A
{
	
  public void Area()
  { Scanner s=new Scanner(System.in);
	 System.out.println("Enter Radius for Area:");
	 int r=s.nextInt();
	
	double Area=3.141*r*r;
	 System.out.println("Area of circle :"+ Area); 
  }
  public void Perimeter()
  {  Scanner s=new Scanner(System.in);
	 System.out.println("Enter Radius for Perimeter :");
	 int r=s.nextInt();
	 double p=2*3.141*r;
	 System.out.println("Perimeter of circle :"+ p);
    
  }
}
class Rectangle implements A
{  	 
  
  public void Area()
  {
	  Scanner s=new Scanner(System.in);
  System.out.println("Enter Rectangle length for Area:");
  int l=s.nextInt();
  System.out.println("Enter Rectangle width for Area:");
  int w=s.nextInt();
   double Area=l*w;
	System.out.println("Area of Rectangle: "+Area);
  }
  public void Perimeter()
  {
	  Scanner s=new Scanner(System.in);
  System.out.println("Enter Rectangle length for Perimeter:");
  int l=s.nextInt();
  System.out.println("Enter Rectangle width for Perimeter:");
  int w=s.nextInt();
	  double Perimeter=2*(l+w);
	  System.out.println("Perimeter of Rectangle: "+Perimeter);
  }
}
class  Square implements A
{
 
  public void Area()
  {
	  
     Scanner s=new Scanner(System.in);
     System.out.println("Enter Square side for Area:");
      int a=s.nextInt();
	  double Area=a*a;
	  System.out.print("Area of Square: "+Area); 
    
  }
   public void Perimeter()
  {
	  
     Scanner s=new Scanner(System.in);
     System.out.println("Enter Square side for Perimeter:");
     int a=s.nextInt();
    double Perimeter=4*a;
    System.out.print("Perimeter of Square: "+Perimeter); 

	
  }
}
class geometric 
{
 public static void main( String[] args)
 { 
	circle c=new circle();
	c.Area();
	c.Perimeter();
	Rectangle r=new Rectangle();
	r.Area();
	r.Perimeter();
	Square s=new Square();
	s.Area();
	s.Perimeter();
	
  
 }
}
