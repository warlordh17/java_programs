public class Percentage
{
 public static void main(String[] gud)
 {
  System.out.println("JVM invoking main");
  arrayOfPercentage();
   System.out.println("JVM exit main");

 }
public static void arrayOfPercentage()
{
  System.out.println("JVM invoking arrayOfPercentage");
  float sslc=73.5f;
  float puc=77.5f;
  float be=70.75f;
  
  float[] percentage={sslc,puc,be};
  int sizeOfArray=percentage.length;
   System.out.println("totall element "+sizeOfArray);
 
 	float elementAtIndex0=percentage[0];
	 System.out.println("elent at inde o "+elementAtIndex0);
 float elementAtIndex1=percentage[1];
	 System.out.println("elent at inde o "+elementAtIndex1);
float elementAtIndex2=percentage[2];
	 System.out.println("elent at inde o "+elementAtIndex2);	 
}
}