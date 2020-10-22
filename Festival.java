public class Festival
{
public static void main(String[] potylics)
{
	System.out.println("jvm invkes main");
String[] ministerArray={"bsy","abc","def","ghi","kjl"};
chiefminister(ministerArray);
chiefminister(null);
System.out.println("jvm exit main");
}
public static void chiefminister(String[] naam)
{
	System.out.println("chiefminister "+naam);
	int size=naam.length;
	System.out.println("enghth of array "+ size);
	
	
	
	
}
}