public class FindMaxNumber3 {

	public static  <T extends  Comparable <T>> void maxFind(T[] element) {
		T max=element[0];

		for(T i:element) {
			if(i.compareTo(max)> 0) {
				max=i;
			}
		}
		System.out.println("Maximum Number: "+ max);		
	}

	public static<E>void printArr(E[] element) {	 
		for(E i : element ) {
			System.out.print(i+" ");
		}
		System.out.println();      
	}


	public static void main(String[] args) {
		System.out.println("array of int number");
		Integer[] integerArray= {10,20,30,40,10};
		
		Double[] doubleArr= {100.0,200.0,300.0,400.0};

		printArr(integerArray);
		maxFind(integerArray);
		System.out.println("array of double number");
		printArr(doubleArr);
		maxFind(doubleArr);


	}
}
