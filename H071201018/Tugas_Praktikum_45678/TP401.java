import java.util.Scanner;

class TP401{
	public static void main(String[] args){
		Scanner obj = new Scanner(System.in);

		int n = obj.nextInt();
		int[] a = new int[n];

		for (int i = 0; i < n; i++){
			a[i] = obj.nextInt();
		}

		for (int i = 0; i <= n-1; i++){
			for (int j = i+1; j <= n-1; j++){
				if (a[i] % a[j] != 0 && a[j] % a[i] != 0)
					System.out.println(a[i] + " " + a[j]);
			}
		}
	}
}