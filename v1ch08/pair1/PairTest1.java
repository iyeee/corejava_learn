package pair1;

/**
 * @version 1.01 2012-01-26
 * @author Cay Horstmann
 */
public class PairTest1
{
   public static void main(String[] args)
   {
      String[] words = { "a", "b", "c", "d", "e" };
      Pair<String> mm = ArrayAlg.minmax(words);
      System.out.println("min = " + mm.getFirst());
      System.out.println("max = " + mm.getSecond());
      System.out.println(ArrayAlg.<String>getMiddle(words));
      System.out.println(ArrayAlg.getMiddle(words));
      System.out.println(ArrayAlg.getMiddle(3.14,1729,0));
      System.out.println(ArrayAlg.getMiddle("hello",0,null));
   }
}
// @SuppressWarnings("unchecked")
class ArrayAlg
{
   /**
    * Gets the minimum and maximum of an array of strings.
    * @param a an array of strings
    * @return a pair with the min and max values, or null if a is null or empty
    */
   public static Pair<String> minmax(String[] a)
   {
      if (a == null || a.length == 0) return null;
      String min = a[0];
      String max = a[0];
      for (int i = 1; i < a.length; i++)
      {
         if (min.compareTo(a[i]) > 0) min = a[i];
         if (max.compareTo(a[i]) < 0) max = a[i];
      }
      return new Pair<>(min, max);
   }
   public static <T> T getMiddle(T... a){
      return a[a.length/2];
   }
}
