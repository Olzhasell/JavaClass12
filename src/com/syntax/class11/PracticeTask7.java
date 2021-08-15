package com.syntax.class11;

public class PracticeTask7 {

	public static void main(String[] args) {
		// Maximum and minimum number in the array
		
		int numbers[] = new int[]{3,5,13,94,22,11,23};
        int smallest = numbers[0];
        int largest = numbers[0];
       
        for(int i=1; i< numbers.length; i++)
        {
                if(numbers[i] > largest)
                        largest = numbers[i];
                else if (numbers[i] < smallest)
                        smallest = numbers[i];
               
        }
       
        System.out.println(smallest);
        System.out.println(largest);
	}

}
