package pair2;
public class Parent<T>
{
    public void sayHello(T value)
    {
        System.out.println("This is Parent Class, value is " + value);
    }
}
class Child extends Parent<String>
{
	@Override
    public void sayHello(String value)
    {
        System.out.println("This is Child class, value is " + value);
    }
}
