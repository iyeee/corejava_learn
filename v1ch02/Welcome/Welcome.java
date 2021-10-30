import static java.lang.Math.*;

import java.io.Console;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.Date;
import java.util.Scanner;
/**
 * This program displays a greeting for the reader.
 * @version 1.30 2014-02-27
 * @author Cay Horstmann
 */
public class Welcome
{
   public static strictfp void main(String\u005B] args) throws IOException
   {
      String greeting = "Welcome t o Core Java!"
      ;
      System.out.println(greeting);
      for (int i = 0; i < greeting.length(); i++)
         System.out.print("=");
      System.out.println();
      byte a=-120;
      short b=0B010101;
      int c=0xF;
      long d=100_001L;
      System.out.println(a);
      System.out.println(b);
      System.out.println(c);
      System.out.println(d);
      System.out.println(Byte.toUnsignedInt(a));
      System.out.println(0.0/0);
      System.out.println(2e100);
      System.out.println(0x2p-3);
      System.out.println(Double.POSITIVE_INFINITY);
      System.out.println(Double.NEGATIVE_INFINITY);
      System.out.println(Double.isNaN(0.0/0));
      System.out.println("2\u2122");
      System.out.println(Math.pow(2, 16));
      if(true){
         System.out.println(1==1.0);
      }
      Character.isJavaIdentifierStart('\u03C0');
      System.out.println('\u03C0');
      int i,j;
      i=2;
      j=4;
      System.out.println(i+j);
      var k=2;
      System.out.println(k);
      // System.out.println(Constants.CONSTAN1);
      System.out.println(Size.SMALL==Size.MEDIUM);
      System.out.println(123/43.0);
      System.out.println(Math.floorMod(-1, 12));
      System.out.println(-1%12);
      System.out.println(Math.PI);
      System.out.println(PI);
      System.out.println(StrictMath.pow(2, 11));
      System.out.println(Math.multiplyExact(100000000, 3));
      System.out.println(1000000000*3);
      int n=123456789;
      float f=n;
      System.out.println(f);
      System.out.println((int)9.98);
      System.out.println((int)Math.round(9.98));
      System.out.println((byte)257);
      double x=3.5;
      int x1=0;
      x1+=3.5;
      System.out.println(x1);
      a=1;
      b=2;
      c=a<b?a:b;
      System.out.println(c);
      int fourthBitFromRight=(0b1110111&0b1000)/0b1000;
      System.out.println(fourthBitFromRight);
      int fourthBitFromRight1=((0b1010111&(1<<3))>>3);
      System.out.println(fourthBitFromRight1);
      System.out.println(1<<35);
      System.out.println("ab".repeat(10));
      System.out.println(String.join("/", "1","1","a","c"));
      System.out.println("a".equals("c"));
      System.out.println("b".equals("b"));
      System.out.println("c".compareTo("c")==0);
      System.out.println("".equals(""));
      System.out.println("".length()==0);
      System.out.println("      ".isBlank());
      System.out.println("abc".startsWith("ab"));
      System.out.println("ababab".indexOf("ab"));
      System.out.println("ababab".lastIndexOf("ab"));
      System.out.println("  AB  ".trim()+"1");
      System.out.println("  ab ".strip()+"1");
      System.out.println("dasd".replace("d", "cc"));

      StringBuilder sBuilder=new StringBuilder("das");
      System.out.println(sBuilder.append("2").append("3").insert(0, "a").deleteCharAt(1));

      Scanner scanner=new Scanner(System.in);
      // System.out.println(scanner.nextLine());


      Console console=System.console();
      // String usString=console.readLine("username:");
      // char[] passwd=console.readPassword("password:");
      // System.out.println(usString+passwd.toString());
      Double xx=10000.0/3.0;
      System.out.println(xx);
      System.out.printf("%8.2f\n",xx);
      
      System.out.printf("%,.2f\n",xx);
      System.out.printf("%.3e\n",xx);
      System.out.printf("%,d\n",10000);
      System.out.printf("%o\n",1000);
      System.out.printf("%x\n",1000);
      System.out.printf("%h\n",1000);
      System.out.printf("%h\n",1000);

      String string=String.format("qq%.2f", xx);
      System.out.println(string);
      new Date();

      System.out.println(System.getProperty("user.dir"));

      Scanner in=new Scanner(Path.of("test.txt"),StandardCharsets.UTF_8);
      System.out.println(in.nextLine());

      PrintWriter printWriter=new PrintWriter("test.txt",StandardCharsets.UTF_8);
      printWriter.write("cccccccccc");

      printWriter.close();

     
      System.out.println(System.getProperty("java.class.path"));


      


      scanner.close();
   }
}

enum Size{
   SMALL,
   MEDIUM
}