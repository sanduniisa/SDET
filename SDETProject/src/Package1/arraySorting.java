package Package1;

public class arraySorting {
	
	public static void main(String[] args) {
		
		int [] array=new int [] {5,8,2,6,1};
		int temp =0;
		
		for (int i = 0; i < array.length; i++) {
			for (int j = i+1; j < array.length; j++) {
				
				if (array[i]>array[j]) {
					
					temp = array[i];
					array[i] = array[j];
					array[j]= temp;
					
				}
				
			}
			
		}
		
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i] + " ");
			
		}
		
	}

}
