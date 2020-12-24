import java.util.Scanner;

class TP503{
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		String uyeye = myDay(a);
		System.out.println(uyeye);
	}
	public static String myDay(int a){
		String str = new String();
		int tahun =0, bulan=0, hari=0;
		while(a!=0){
			if(a>=365){
				tahun++;
				a=a-365;
			} else if(a>=30){
				bulan++;
				a=a-30;
			} else{
				hari = a;
				a= a-a;
			}
		}
		System.out.println(tahun+" Tahun");
		System.out.println(bulan+" Bulan");
		System.out.println(hari+" Hari");
		return str;
	}
}