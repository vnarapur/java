package corejava;


	import java.util.Scanner;

	public class Threestudents9th {

		public static void main(String[] args) {

			Scanner scan = new Scanner(System.in);
			for(int j=1; j<4; j++) {
			int Ttl = 0, Percentage;

			int marks1[] = new int[3];

			System.out.println("Enter "+j+"st Student marks in Three subjects : ");
			for (int i = 0; i < marks1.length; i++) {
				marks1[i] = scan.nextInt();
			}
			for (int i : marks1) {
				Ttl = Ttl + i;
			}

			Percentage = Ttl / 3;
			System.out.println(j+"st Student total Marks : " + Ttl);
			System.out.println(j+"st Avarge in all Subjects : " + Percentage);
			}
			scan.close();

		}

	}


