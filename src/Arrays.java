		public class Arrays {
		public static void main(String[] args) {
		System.out.println("Hello Kylie, this is a sorting algorithm using arrays.");
		
		// call the sorting algorithm
		SortAlgorithm();
		}
		
		public static void SortAlgorithm() {

		// generate a set of random numbers for sorting
		int mylistsize = 6;
		int[] ArrayNumber = new int[mylistsize];
		ArrayNumber = buildRandomArray(mylistsize);
		System.out.print("The random array is: ( ");
		for (int i = 0; i < mylistsize; i++ ){
			System.out.print(ArrayNumber[i] + " ");
		}
		System.out.println(").");
		
		
		// sort the array of numbers
		ArrayNumber = sortOurArray(ArrayNumber, mylistsize);
		System.out.print("The sorted array is: ( ");
		for (int i = 0; i < mylistsize; i++ ){
			System.out.print(ArrayNumber[i] + " ");
		}
		
		System.out.println(").");
		
		}
		
		public static int[] buildRandomArray(int mylistsize) {
		int[] ArrayNumber = new int[mylistsize];
		// populate the array
		ArrayNumber = populateRandomArray(ArrayNumber, mylistsize);
		
		// Test the array to see if there are duplicates.
		
		return ArrayNumber;
		}
		
		public static int[] populateRandomArray(int[] ArrayNumber, int mylistsize) {
		
		int randomRange = mylistsize * 1000;
		for (int i = 0; i < mylistsize; i++ ){
			ArrayNumber[i] = (int)(Math.random()*randomRange);
		}
		
		return ArrayNumber;
		
		}
	
		public static int[] sortOurArray(int[] ArrayNumber, int mylistsize) {
		
		int Number1;
		int Number2;
		for (int passCounter = 1; passCounter <= mylistsize; passCounter++ ){
			
			for (int i = 0; i < mylistsize-1; i++ ){
				
				Number1 = ArrayNumber[i];
				Number2 = ArrayNumber[i+1];
				
				if(Number2 < Number1){
					ArrayNumber[i] = Number2;
					ArrayNumber[i+1] = Number1;
				}
				}
				}
				return ArrayNumber;
				}
				}


