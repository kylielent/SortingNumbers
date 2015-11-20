public class Arrays {
	public static void main(String[] args) {
		System.out.println("Hello Kylie,this is a sorting algorithm using arrays.");
		
		// call the sorting algorithm
		SortAlgorithm();
		}
	public static void SortAlgorithm() {

		// generate a set of random numbers for sorting
		int mylistsize = 6;
		int[] numberArray = new int[mylistsize];
		numberArray = buildRandomArray(mylistsize);
		System.out.print("The random array is: ( ");
		for (int i = 0; i < mylistsize; i++ ){
			System.out.print(numberArray[i] + " ");
		}
		System.out.println(").");
		
		
		// sort the array of numbers
		numberArray = sortOurArray(numberArray, mylistsize);
		System.out.print("The sorted array is: ( ");
		for (int i = 0; i < mylistsize; i++ ){
			System.out.print(numberArray[i] + " ");
		}
		System.out.println(").");
		
	}
	public static int[] buildRandomArray(int mylistsize) {
		int[] numberArray = new int[mylistsize];
		// populate the array
		numberArray = populateRandomArray(numberArray, mylistsize);
		
		// Test the array to see if there are duplicates.
		
		return numberArray;
	}
	public static int[] populateRandomArray(int[] numberArray, int mylistsize) {
		
		int randomRange = mylistsize * 1000;
		for (int i = 0; i < mylistsize; i++ ){
			numberArray[i] = (int)(Math.random()*randomRange);
		}
		return numberArray;
	}
	
	public static int[] sortOurArray(int[] numberArray, int mylistsize) {
		
		int holder_1;
		int holder_2;
		for (int passCounter = 1; passCounter <= mylistsize; passCounter++ ){
			
			for (int i = 0; i < mylistsize-1; i++ ){
				
				holder_1 = numberArray[i];
				holder_2 = numberArray[i+1];
				
				if(holder_2 < holder_1){
					numberArray[i] = holder_2;
					numberArray[i+1] = holder_1;
					/* Remove our printing block
					System.out.print("We had a switch, the new array is: /n( ");
					
					for(int j = 0; j < listSize; j++){
						
						if (j == i){
							System.out.print(" " + numberArray[j] + " ");
						}else if (j == (i+1)){
							System.out.print(" " + numberArray[j] + " ");
						}else{
							System.out.print(numberArray[j] + "  ");
						}
					}
					System.out.println(")");
					*/
				}
				
			}
		}
		return numberArray;
	}
}


