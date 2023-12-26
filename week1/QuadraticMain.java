import java.util.Scanner;

class Quadratic{
	int a, b, c;
	double r1, r2, d;
	void getd(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter coeffs a, b, c: ");
		a = sc.nextInt(); b = sc.nextInt(); c = sc.nextInt();
		
	}

	void compute(){
		while(a == 0){
			System.out.println("Invalid coeff, enter new one: ");
			Scanner sc = new Scanner(System.in);
			a = sc.nextInt();
			
		}
		d = b*b - 4*a*c;
		if (d == 0){
			r1 = -b/(2*a);
			System.out.println("Roots are real and equal");
			System.out.println("r1 = r2 = " + r1);
		}
		else if (d > 0){
			r1 = (-b + Math.sqrt(d))/(2*a);
			r2 = (-b - Math.sqrt(d))/(2*a);
			System.out.println("Roots are real and distinct");
			System.out.println("r1 = " + r1 + "; " + "r2 = " + r2);
		}
		else if (d < 0){
			r1 = -b/(2*a);
			r2 = Math.sqrt(-d)/(2*a);
			System.out.println("Roots are imaginary");
			System.out.println("r1 = " + r1 + " + i" + r2 + "r2 = " + r1 + " - i" + r2);
		}

	}

}

class QuadraticMain{
	public static void main(String args[]){
		Quadratic q = new Quadratic();
		q.getd();
		q.compute();
	}
}