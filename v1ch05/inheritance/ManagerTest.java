package inheritance;

/**
 * This program demonstrates inheritance.
 * @version 1.21 2004-02-21
 * @author Cay Horstmann
 */
public class ManagerTest
{
   private void test(long i){
      System.out.println(i);
   }
   public static void main(String[] args)
   {
      short i=1;
      new ManagerTest().test(i);
      Object b=new ManagerTest();
      b=(ManagerTest)b;
      System.out.println(b.toString());
      System.out.println(b instanceof ManagerTest);

      // construct a Manager object
      Manager boss = new Manager();
      boss.setBonus(5000);

      Employee[] staff = new Employee[1];

      // fill the staff array with Manager and Employee objects

      staff[0] = boss;
      // staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
      // staff[2] = new Employee("Tommy Tester", 40000, 1990, 3, 15);
      // print out information about all Employee objects
      for (Employee e : staff)
         System.out.println("name=" + e.getName() + ",salary=" + e.getSalary());
   }
}
