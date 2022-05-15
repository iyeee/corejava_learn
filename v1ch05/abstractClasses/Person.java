package abstractClasses;

public abstract class Person
{
   public abstract String getDescription();
   private String name;
    String id;
   

   public Person(String name)
   {
      this.name = name;
   }

   public String getName()
   {
      return name;
   }
}
