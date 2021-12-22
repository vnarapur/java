package corejava;

	public abstract class Program5 {

	    abstract void draw();
	}

	class Line extends Program5 {

	    private int x;
	    private int y;

	    public Line(int x, int y) {
	        this.x = x;
	        this.y = y;
	    }

	    @Override
	    void draw() {
	        System.out.println(" Drawing a line with coordinates "+x +" and " +y);
	    }
	}

	    class Circle extends Program5 {

	        private double r;

	        public Circle(double r) {
	            this.r = r;
	        }

	        @Override
	        void draw() {

	            System.out.println(" Drawing a circle with radius "+r);
	        }
	    }
	        class Rect extends Program5 {

	            private double l;
	            private double b;

	            public Rect(double l, double b) {
	                this.l = l;
	                this.b = b;
	            }

	            @Override
	            void draw() {

	                System.out.println(" Drawing a rectangle with length " +l +" and breadth " +b);
	            }
	        }


	class MainClass{

	    public static void main(String[] args) {

	        Program5 line = new Line(2,3);
	        line.draw();
	        Program5 circle = new Circle(4.5);
	        circle.draw();
	        Program5 rect = new Rect(5,8);
	        rect.draw();

	    }
	}

