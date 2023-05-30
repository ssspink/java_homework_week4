package methodoverriding24;

 class Bank
{
   public int getRateOfInterest(){return 0;}
}
class SBI extends Bank
{
    public int getRateOfInterest(){return 8;}
}
class ICICI extends Bank
{
    public int getRateOfInterest(){return 7;}
}

class Axis extends Bank
{
    public int getRateOfInterest(){return 9;}
}

class Test2
{
    public static void main(String[] args)
    {
        SBI s= new SBI();
        ICICI i= new ICICI();
        Axis a =new Axis();
        System.out.println("SBI Rate of Interest: "+s.getRateOfInterest());
        System.out.println("ICICI Rate of Interest: "+i.getRateOfInterest());
        System.out.println("AXIS Rate of Interest: "+a.getRateOfInterest());

    }
}