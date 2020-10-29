abstract class Shape
{
  abstract int numberOfSides();
}
class Rectangle extends Shape
{
  int numberOfSides()
  {
    return(4);
  }
}
class Triangle extends Shape
{
  int numberOfSides()
  {
    return (3);
  }
}
class Hexagon extends Shape
{
  int numberOfSides()
  {
    return(6);
  }
}
class Abstractshape
{
  public static void main(String[] args)
  {
    Shape s;
    s=new Triangle();
    System.out.println("NUMBER OF SIDES OF TRIANGLE : "+s.numberOfSides());
    s=new Rectangle();
    System.out.println("NUMBER OF SIDES OF RECTANGLE : "+s.numberOfSides());
    s=new Hexagon();
    System.out.println("NUMBER OF SIDES OF HEXAGON : "+s.numberOfSides());
  }
}
