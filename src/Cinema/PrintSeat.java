package Cinema;

public class PrintSeat {
	public static void main(String[] args) {
		int rows = 7;
		int seat = 8;
		
		System.out.println("Cinema:");
		System.out.print("  ");
		for (int z = 1; z <= seat; z++) {
			
			System.out.print(z+" ");
		}
		System.out.println();
		for (int i = 1; i <= rows; i++) {
			System.out.print(i+" ");
			for (int j = 1; j <= seat; j++) {
				System.out.print("S ");
			}
			System.out.println();
		}
		
	}
}
