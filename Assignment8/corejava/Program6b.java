package corejava;
	import java.util.ArrayList;
	import java.util.Arrays;
	import java.util.function.UnaryOperator;

  public class Program6b{
	
	public static void main(String[] args) throws CloneNotSupportedException
	{
	ArrayList<String> alphabets =
	new ArrayList<>(Arrays.asList("vijji", "vijaya", "srinu", "sreenu"));
	System.out.println(alphabets);
	alphabets.replaceAll( new MyOperator() );
	System.out.println(alphabets);
	}
	}

	class MyOperator implements UnaryOperator<String>
	{
	@Override
	public String apply(String t) {
	return t.toUpperCase();
	}

	}



