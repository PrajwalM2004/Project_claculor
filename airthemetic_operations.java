package Project_claculor;
class airth_oper
{
    public int square(int a)
    {
        return a*a;
    }
    public int cube(int a)
    {
        return a * a* a;
    }
    public int mod(int a,int b)
    {
        return a % b;
    }
    public double power(float a,float b)
    {
        return Math.pow(a,b);
    }
}
class airthemetic_operations
{
    public static void main(String[]args)
    {
        airth_oper ar = new airth_oper();
        System.out.println("Square of a number = "+ar.square(5));
        System.out.println("Cube of a number = "+ar.cube(5));
        System.out.println("Modulus of two numbers = "+ar.mod(10,5));
        System.out.println("Power of a number = "+ar.power(5,5));
    }
}