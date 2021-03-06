public class FindMaxNumbers {

	public static  <T extends  Comparable <T>> void maxFind(T[] element) {
		T max=element[0];

		for(T i:element) {
			if(i.compareTo(max)> 0) {
				max=i;
			}
		}
		System.out.println("this is a maximum number = "+" "+max+" ");		
	}

	public static<E>void printArr(E[] element) {	 
		for(E i : element ) {
			System.out.print(i+" ");
		}
		System.out.println();      
	}


	public static void main(String[] args) {
		System.out.println("given the number");
		Integer[] integerArray= {10,20,30,40,10};
		printArr(integerArray);
		maxFind(integerArray);

	}
}
