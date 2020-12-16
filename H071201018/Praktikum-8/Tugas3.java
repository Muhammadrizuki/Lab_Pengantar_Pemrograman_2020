import java.io.*;
import java.util.*;

class Tugas3{
	public static void main(String []args){
		Scanner obj = new Scanner(System.in);
		System.out.print("Nama file: ");
		String fileName = obj.next();
		System.out.print("Jumlah Kolom: ");
		int bt = obj.nextInt();

		try{
			BufferedWriter bw = new BufferedWriter(
				new FileWriter("D:\\File\\"+fileName+".txt"));
				bw.write("+-----------------------+---------------+---------------+\n");
				bw.write("| Nama\t\t\t| NIM\t\t| Angkatan\t|"+"\n");
				bw.write("+-----------------------+---------------+---------------+\n");
			for(int i = 0; i<bt;i++){
				System.out.print("Nama: ");
				String nama = obj.next();
				String namas = obj.next();
				String namase = obj.next();
				System.out.print("NIM: ");
				String nim = obj.next();
				System.out.print("Angkatan: ");
				int angkatan = obj.nextInt();
				bw.write("| " +nama+" "+namas+" "+namase+"\t| "+nim+"\t| "+angkatan+"\t|"+"\n");
			}
			bw.write("+-----------------------+---------------+---------------+\n");
			bw.close();
			System.out.print("Berhasil");
		}catch(Exception e){
			System.out.print("Gagal");
			return;
		}
	}
}