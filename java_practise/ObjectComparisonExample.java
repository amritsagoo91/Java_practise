public class ObjectComparisonExample
{
public static void main(String[] args)
{


Double x = new Double(123.45667);
Long y = new Long(9887544);

System.out.println("objects are not equal, it return" +x.equals(y));
System.out.println("Object are equal, hence it returns: "+x.equals(123.45667));

} 


}