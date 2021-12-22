package corejava;


	import java.util.Scanner;

	public class Compound {
		public static void main(String[] args) {

			String UserId = "Chandu", Pwd = "Chandu";
			Scanner scan = new Scanner(System.in);

			for (int i = 0; i < 3; i++) {

				System.out.println("Plase Enter valid UserId : ");
				String Login = scan.next();
				String pass = scan.next();
				if (UserId.equals(Login) && Pwd.equals(pass))
					System.out.println("Welcom " + UserId);
				else {
					System.out.println("Invalid Cridentials");
				}

			}
			System.out.println("Contact Admin");
			scan.close();

		}
	}


