package linkedList;

import java.util.*;

/**
 * This program demonstrates operations on linked lists.
 * @version 1.12 2018-04-10
 * @author Cay Horstmann
 */
public class LinkedListTest
{
   public static void main(String[] args)
   {
      var a = new LinkedList<String>();
      a.add("Amy");
      a.add("Carl");
      a.add("Erica");

      var b = new LinkedList<String>();
      b.add("Bob");
      b.add("Doug");
      b.add("Frances");
      b.add("Gloria");

      // merge the words from b into a

      ListIterator<String> aIter = a.listIterator();
      Iterator<String> bIter = b.iterator();

      while (bIter.hasNext())
      {
         if (aIter.hasNext()) aIter.next();
         aIter.add(bIter.next());
      }

      System.out.println(a);

      // remove every second word from b

      bIter = b.iterator();
      while (bIter.hasNext())
      {
         bIter.next(); // skip one element
         if (bIter.hasNext())
         {
            bIter.next(); // skip next element
            bIter.remove(); // remove that element
         }
      }

      System.out.println(b);

      // bulk operation: remove all words in b from a

      a.removeAll(b);

      System.out.println(a);

      a.addAll(b);

      System.out.println(a);

      System.out.println(a.containsAll(b));

      a.forEach(System.out::println);

      System.out.println("=====================================");
      
      aIter=a.listIterator();//重新获取迭代器，等于重置迭代器

      System.out.println(aIter.next());
      System.out.println(aIter.next());
      System.out.println(aIter.previous());
      System.out.println("=======================================");
      a.forEach(System.out::print);
      System.out.println();
      aIter.remove();
      aIter.forEachRemaining(System.out::println);
      System.out.println("=======================================");
      aIter.forEachRemaining(System.out::println);
      a.forEach(System.out::print);
      System.out.println(aIter.hasNext());
      aIter=a.listIterator();
      System.out.println(aIter.hasNext());
      System.out.println(aIter.nextIndex());
      System.out.println(aIter.nextIndex());
      System.out.println(aIter.previousIndex());
      System.out.println(aIter.next());
      System.out.println(aIter.nextIndex());
      System.out.println(aIter.previousIndex());
      System.out.println(a);
      aIter=a.listIterator(2);
      System.out.println(aIter.next());
      System.out.println(aIter.nextIndex());
      System.out.println(a.indexOf("Bob"));
      a.set(4,"Boob");
      System.out.println(a);
      aIter=a.listIterator();
      // aIter.next();
      aIter.add("add");
      aIter.add("add2");
      aIter.add("add3");
      System.out.println(a);
      System.out.println(aIter.nextIndex());
      System.out.println(aIter.next());
      aIter.set("dasd");
      System.out.println(a);

      List<String> list=new LinkedList<>();
      list.add("add1");
      list.add("add2");
      list.add("add3");
      System.out.println(list);
      List<String> list2=new ArrayList<>(list);
      System.out.println(list2);
   }
}
