package corejava;

public class Program6th {
	
		public static void main(String[] args) {
			int P = 54321, T = 3, R = 2, N=4;
			float Si , Ci;
			Si = (P * T * R) / 100f;
			Ci = (float) (P* Math.pow(1+(R/N), N*T));
			System.out.println("Simple Interst amount is : " + Si);
			System.out.println("Compound Interst amount is : " + Ci);
		}
	}

