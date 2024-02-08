//Program to claculate area of square and triangle
import java.util.Scanner;
class area_tri
{
    public void triangle()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Base of the triangle");
        int base = sc.nextInt();
        System.out.println("Enter the Height of the Triangle");
        int height = sc.nextInt();
        double  area=0.5*base*height;
        System.out.println("The Area of The Triangle is "+area);
    }
}
class area_square extends area_tri
{
    public void  square()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of the square");
        float  side = sc.nextFloat();
        double area = side * side;
        System.out.println("The Area of The Square is " + area);
    }
}
class Geo_area extends area_square
{
    public  static void main (String[] args)
    {
        area_square as = new  area_square();
        as.triangle();
        System.out.println();
        as.square();
    }
}