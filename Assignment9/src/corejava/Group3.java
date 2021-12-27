package corejava;

	import java.util.Arrays;
	import java.util.Comparator;
	import java.util.List;
	import java.util.Optional;
	import java.util.stream.Collectors;

	public class Group3 {
		
		public static void main(String[] args) {
			List<Transaction> transaction =Arrays.asList(
			new Transaction("jute",2000,210),
			new Transaction("Iron",2019,201),
			new Transaction("Cotton",1990,202),
			new Transaction("Steel",2011,220),
			new Transaction("Copper",2011,203)
			);
			//highest transaction value

			Optional<Object> c =transaction.stream()
			.max(Comparator.comparing(Transaction::getValue))
			.map(p->p.value);
			System.out.println(c);



			//lowest transaction value
			Optional<Object> c1 =transaction.stream()
			.min(Comparator.comparing(Transaction::getValue))
			.map(p->p.value);
			System.out.println(c1);



			//all transactions
			List<String> c2 =transaction.stream()
			.map(p->p.toString())
			.collect(Collectors.toList());
			System.out.println(c2);
			//transactions in 2011
			List<String> c3 = transaction.stream()
			.filter(p->p.year == 2011)
			.sorted((o1,o2)->(o1.getValue()-o2.getValue()))
			.map(p->p.toString())
			.collect(Collectors.toList());
			System.out.println(c3);



			}



	}



