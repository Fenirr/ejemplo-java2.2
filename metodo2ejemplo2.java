package metodo2;
import java.util.Scanner;
public class ejemplo2 {
	public static void main(String[]args){
	Scanner sc= new Scanner(System.in);
	double g;
	System.out.println("tecle el primer numero");
	g= sc.nextInt();
	double h;
	System.out.println("tecle el segundo numero");
	h= sc.nextInt();

		dividir(g, h);
	}
		public static void dividir(double g,double h){
			double dividir= (g / h);
			System.out.println("el resultado es :"+dividir);
		}
		
		
	}

