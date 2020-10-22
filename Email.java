public class Email
{
 public static void main(String[] email)
 {
   arrayOfEmail();
 
 }
public static void arrayOfEmail()
{
 System.out.println("invoking main arrayOfEmail");
 
 String xworkzEmail="sayam.xworkz@gmail.com";
 String pri_email="sayamh17@gmail.com";
 String workMail="csumona54@gmail.com";
 String dangerMail="dd@gmail.com";
 
 String[] emails={xworkzEmail,pri_email,workMail,dangerMail};
 int sizeOfArray=emails.length;
 System.out.println("Total elments "+sizeOfArray);
 
 String elementAtIndex1=emails[1]; 
  System.out.println(" element A t Index 1 "+elementAtIndex1);
 
}
}