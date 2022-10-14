import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



/*

get unique number from array. 
e.g. list = {1,5,1,6,7,2,2,3,4,9}
output is = [5, 6, 7, 3, 4, 9]

*/
public class unique {
	
	@SuppressWarnings("resource")
	public static void main(String[]args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Number of elements: ");
		int len = sc.nextInt();
		
		List<Integer> list = new ArrayList<Integer>();
		
		for(int x=0; x<len; x++) {
			System.out.print("insert number: ");
			list.add(sc.nextInt());
		}
		
		
		for(int i=0; i<len; i++) {
			int count = 0;
			
			for(int j=0; j<i; j++) {
				if(list.get(j) == list.get(i)) {
					count++;
				}
			}
			
			for(int j=i+1; j<len; j++) {
				if(list.get(j) == list.get(i)) {
					count++;
				}
			}
			
			if(count==0) {
				System.out.print(list.get(i));
			}
			
			
		}
		
	}

}
