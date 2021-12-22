package corejava;

	/*abstract class cannot be instantiated*/
	/*abstract class cannot be final*/
	public abstract class Program4 {

	    abstract void run();
	}

	class Cheetah extends Program4 {

	    @Override
	    void run() {
	        System.out.println(" Cheetah is running ");
	    }
	}

	/*the class is declared as abstract without abstract method*/
	 abstract class Lion extends Program4 {

	}
	class Horse extends Program4 {

	    @Override
	    void run() {
	        System.out.println(" Horse is running ");
	    }
	}


	class Main4{

	    public static void main(String[] args) {

	    Program4 cheetah = new Cheetah();
	    cheetah.run();
	        /*overriding animal class method*/
	    Program4 horse = new Horse();
	    horse.run();
	    }

	    }

