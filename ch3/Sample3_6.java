public class Sample3_6
{
    public static void main(String[] args)
    {
        Car3_6 car1;
        car1 = new Car3_6();
        
        car1.setNum(1234);
        car1.setGas(20.5);
    }
}

// Car類別
class Car3_6
{
    int num;
    double gas;
    
    void setNum(int n)
    {
        num = n;
        System.out.println("將車號設為" + num);
    }
    
    void setGas(double g)
    {
        gas = g;
        System.out.println("將汽油量設為" + gas);
    }
}