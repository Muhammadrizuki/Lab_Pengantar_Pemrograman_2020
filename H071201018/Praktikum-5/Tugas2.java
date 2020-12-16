import java.util.Scanner;
import java.util.Random;

class Tugas2{
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		String serialNumber = generateSerial(n, m);
		System.out.println(serialNumber);
	}
	public static String generateSerial (int n, int m) {
		//lengkapi
		String str = new String();
		Random rand = new Random();
		for(int i=1;i<=n;i++){
			for(int j=1;j<=m;j++){
				int upperbound = 9;
		    	int ehehe = rand.nextInt(upperbound);
		    	System.out.print(ehehe);
		    }
		    if(i<n){
		    	System.out.print("-");
		    }
		}
		return str;
	}
}