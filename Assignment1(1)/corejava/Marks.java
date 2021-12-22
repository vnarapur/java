package corejava;


	import java.util.Scanner;

	public class Marks {

		public static void main(String[] args) {

			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the 3 subject marks : ");
			int Sub1=scan.nextInt();
			int Sub2=scan.nextInt();
			int Sub3=scan.nextInt();
			if(Sub1>60&&Sub2>60&&Sub3>60)
				System.out.println("Pass");
			else if(Sub1>60&&Sub2>60||Sub1>60&&Sub3>60||Sub2>60&&Sub3>60)
				System.out.println("Promoted");
			else
				System.out.println("Fail");
			scan.close();
		}

	}




