class Box
{
  int height,width,depth;
  Box(int a,int b,int c)
  {
    height=a;
    width=b;
    depth=c;
  }
  Box()
  {
    height=10;
    width=10;
    depth=10;
  }

  int volume()
  {
    int volume;
    volume=height*width*depth;
    return volume;
  }
}
class Boxdemo
{
  public static void main(String args[])
  {
    Box b1=new Box(1,2,3);
    Box b2=new Box();
    System.out.println("VOLUME OF BOX 1 : "+(b1.volume()));
    System.out.println("VOLUME OF BOX 2 : "+(b2.volume()));
  }
}
