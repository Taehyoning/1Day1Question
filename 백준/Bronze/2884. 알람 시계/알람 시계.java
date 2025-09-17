import java.util.Scanner;

public class Main {

	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int M = sc.nextInt();
		
		if(H >= 0 && H <= 23 && M >= 0 && M <=59 ) {
		}else {
			System.out.println("잘못 입력했슴");	
		}
		
		if(M - 45 < 0 ) {
			H -= 1;
			if(H < 0) {
				H = 23;
			}
			M -= 45;
			M += 60;
		
		}else {
			M -= 45;
		}
		System.out.println( H + " " + M );
		
		

	}

}