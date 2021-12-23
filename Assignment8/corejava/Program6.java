package corejava;

	import java.util.ArrayList;
	import java.util.Arrays;

  public class Program6
	{
	public static void main(String[] args) 
			throws CloneNotSupportedException
	{
	ArrayList<String> alphabets =
	new ArrayList<>(Arrays.asList("vijji", "vijaya", "srinu"));



	System.out.println(alphabets);



	alphabets.replaceAll( e -> e.toUpperCase() );



	System.out.println(alphabets);
	}

}

