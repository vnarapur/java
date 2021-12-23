package corejava;
	
	import static java.lang.annotation.ElementType.METHOD;
	import static java.lang.annotation.RetentionPolicy.RUNTIME;
	import java.lang.annotation.Retention;
	import java.lang.annotation.Target;@Retention(RUNTIME)
	@Target(METHOD)
	@interface Execute{
	int sequence();
	}
	class MyClass{
	@Execute(sequence=3)
	public void method1(String name)
	{
	System.out.println("name"+name);
	} @Execute(sequence=1)
	public void method2(String department)
	{
	System.out.println("department"+department);
	} @Execute(sequence=2)
	public void method3(int id)
	{
	System.out.println("id "+id);
	} } public class Program3{
	public static void main(String[] args) {
	MyClass c = new MyClass();
	c.method2(" HR");
	c.method3(319);
	c.method1(" vijaya");
	}
	}






