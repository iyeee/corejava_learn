import java.text.NumberFormat;
import java.time.*;
import java.util.Objects;

/**
 * This program tests the Employee class.
 * @version 1.13 2018-04-10
 * @author Cay Horstmann
 */
public class EmployeeTest
{
   public static void main(String[] args)
   {
      // fill the staff array with three Employee objects
      Employee[] staff = new Employee[3];

      staff[0] = new Employee("Carl Cracker", 75000, 1987, 12, 15);
      staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
      staff[2] = new Employee("Tony Tester", 40000, 1990, 3, 15);

      var staff1=new Employee("da", 12, 1998, 05, 24);
      System.out.println(staff1.toString());
      NumberFormat

      // raise everyone's salary by 5%
      for (Employee e : staff)
         e.raiseSalary(5);

      // print out information about all Employee objects
      for (Employee e : staff)
         System.out.println("name=" + e.getName() + ",salary=" + e.getSalary() + ",hireDay=" 
            + e.getHireDay());
   }
}

class Employee
{
   private String name;
   private double salary;
   private LocalDate hireDay;
   private static final String a="ads";

   public Employee(String n, double s, int year, int month, int day)
   {
      // name = n;
      name=Objects.requireNonNullElse(n,"unknown");
      Objects.requireNonNull(n,"can't null");
      salary = s;
      hireDay = LocalDate.of(year, month, day);
   }

   public String getName()
   {
      name+=a;
      return name;
   }

   public double getSalary()
   {
      return salary;
   }

   public LocalDate getHireDay()
   {
      return hireDay;
   }

   public void raiseSalary(double byPercent)
   {
      double raise = salary * byPercent / 100;
      salary += raise;
   }

   public String toString(){
      return getName()+getSalary()+getHireDay();
   }
}
