/**
 * This program displays a greeting for the reader.
 * @version 1.30 2014-02-27
 * @author Cay Horstmann
 */
public class Welcome
{
   public static void main(String[] args)
   {
      String greeting = "Welcome t o Core Java!"
      ;
      System.out.println(greeting);
      for (int i = 0; i < greeting.length(); i++)
         System.out.print("=");
      System.out.println();
      byte a=1;
      short b=2;
      int c=0xF;
      long d=021L;
      System.out.println(a);
      System.out.println(b);
      System.out.println(c);
      System.out.println(d);
   }
}
