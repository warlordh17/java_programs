public class Rage
{
public static String ageDefination(byte age)
{
 System.out.println("invoke ageDefination");
 
 
 
 if(age<4)
 {
	 System.out.println("age less than four/4");
	 return "child";
	 
 }
	else if(age<10)
 {
	 System.out.println("age less than 10");
	 return "kid";
	 
 } 
else if(age<19)
 {
	 System.out.println("age less than 19");
	 return "teen";
	 
 }
 else if(age<50)
 {
	 System.out.println("age less than 50");
	 return "adult";
	 
 }
 if(age>50)
 {
	 System.out.println("age greater than 50");
	 return "old";
	 
 }
 
}
}
  