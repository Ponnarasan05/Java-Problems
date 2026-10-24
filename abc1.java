abstract class Hotel
{
    final int id;
    final String name;
    static int totalbooking;
    
    static final double tax;

    static 
    { 
        tax=12;
    }

    Hotel(int id,String name)
    {
        this.id=id;
        this.name=name;
        totalbooking++;
    }

    abstract double  calculatetotalbill();

     static void displaytotalbooks()
     {

        System.out.println("Totalbookings:"+totalbooking);
     }
     final void displaybookingdetails()
     {
        System.out.println("Id:"+ id);
        System.out.println("Name:"+name);

     }


}
class Standard extends Hotel
{
    Standard(int id,String name)
    {
        super(id,name);
    }
    double calculatetotalbill()
    {
        return (tax/100 * 2000)+2000;
    }

}
class Deluxe extends Hotel
{
    Deluxe(int id,String name)
    {
        super(id,name);
    }
    double calculatetotalbill()
    {
        return (tax/100 *5000)+5000;
    }
}
class Suite extends Hotel
{
    Suite(int id,String name)
    {
        super(id,name);
    }
    double calculatetotalbill()
    {
        return (tax/100*10000)+10000;
    }
}

public class abc1
{
    public static void main(String[] args) 
        {

            Standard s1=new Standard(3502,"Ponnarasan");
            Deluxe d1=new Deluxe(3504,"Gokul");
            Suite s2=new Suite(3506,"Santhosh");

            s1.displaybookingdetails();
            System.out.println("Totalbill:"+ s1.calculatetotalbill());
            System.out.println();

             d1.displaybookingdetails();
            System.out.println("Totalbill:"+ d1.calculatetotalbill());
            System.out.println();

             s2.displaybookingdetails();
            System.out.println("Totalbill:"+ s2.calculatetotalbill());
            System.out.println();

            Hotel.displaytotalbooks();
            System.out.println();



        }
    }
    


