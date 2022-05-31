package streams;

import java.io.*;
import java.nio.file.*;
import java.util.*;

/**
 * @version 1.02 2019-08-28
 * @author Cay Horstmann
 */
public class CountLongWords
{
   public static void main(String[] args) throws IOException
   {
      var contents = Files.readString(
         Paths.get("gutenberg/alice30.txt"));
      List<String> words = List.of(contents.split("\\PL+"));

      long l1=System.currentTimeMillis();
      long count = 0;
      for (String w : words)
      {
         if (w.length() > 12) count++;
      }
      System.out.println(count);
      long l2=System.currentTimeMillis();
      System.out.println("t1:"+(l2-l1));

      long l3=System.currentTimeMillis();
      count = words.stream().filter(w -> w.length() > 12).count();
      System.out.println(count);
      long l4=System.currentTimeMillis();
      System.out.println("t2:"+(l4-l3));

      long l5=System.currentTimeMillis();
      count = words.parallelStream().filter(w -> w.length() > 12).count();
      System.out.println(count);
      long l6=System.currentTimeMillis();
      System.out.println("t3"+(l6-l5));
   }
}
