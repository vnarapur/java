package corejava;

    import java.util.function.Consumer;
	import java.util.function.Function;
	import java.util.function.Predicate;
	import java.util.function.Supplier;
	public class Program3 {
	@SuppressWarnings("removal")
	public static void main(String[] args)
	{ Supplier<Integer> Supplier = () -> new Integer((int) (Math.random() * 1000D));//supplier API
	System.out.println("Supplier API"); 
	Consumer<Integer> Consumer = (value) -> System.out.println(value);//Consumer API
	System.out.println("Consumer API");
	Predicate Predicate = (value) -> value != null;//predicate API
	System.out.println("Predicate API"); 
	Function<Long, Long> adder = (value) -> value + 3;//Function API
	Long resultLambda = adder.apply((long) 8);
	System.out.println("resultLambda Function API = " + resultLambda); }}

	




