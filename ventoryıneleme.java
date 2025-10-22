import java.util.Vector;
public class ventoryıneleme {

	public static void main(String[] args) {
		Vector<Integer> numbers = new Vector<>();
		
		for(int i= 1; i<= 5; i++) {
			numbers.add(i*10);
		}
		
		System.out.print("Numbers: ");
		for(int num : numbers) {
			System.out.print(num + " ");
		}
		System.out.println();
		
		System.out.print("Numbers using for loop: ");
		for(int i = 0; i< numbers.size(); i++) {
			System.out.print(numbers.get(i) + " ");
		}
		
	}

}

