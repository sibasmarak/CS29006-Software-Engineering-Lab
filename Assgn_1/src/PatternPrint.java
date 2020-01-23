
public class PatternPrint {
	public static void main(String[] args) {
		int num_rows = 7, num = 1;
		for (int i = 0; i<num_rows; i += 1) {
			int loop = 0;
			while(loop < i) {
				System.out.print(num + "\t");
				loop += 1;
				num += 1;
			}
			System.out.println();
		}
	}
}
