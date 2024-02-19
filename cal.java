class cal
{
    public float add(int a, int b)
    {
        return a + b;
    }
    public float sub(int a, int b)
    {
        return a - b;
    }
    public float mul(int a, int b)
    {
        return a * b;
    }
    public float div(int a, int b)
    {
        return a / b;
    }
    public int square(int a)
    {
        return a*a;
    }
    public int cube(int a)
    {
        return a*a*a;
    }
    public static void main(String args[])
    {
        cal c = new cal();
        System.out.println("Addition of two numbers"+c.add(10,20));
        System.out.println("Difference of two numbers"+c.sub(10,20));
        System.out.println("Product of two numbers"+c.mul(10,20));
        System.out.println("Division of two numbers"+c.div(10,20));
        System.out.println("Area of the square = "+c.square(5));
        System.out.println("Area of the cube  = "+c.cube(3));
        

    }
}