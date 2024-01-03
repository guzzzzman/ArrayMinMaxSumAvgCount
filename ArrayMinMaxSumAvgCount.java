// Jose Guzman
// November 19, 2023
// File name: ArrayMinMaxSumAvgCount.java
// To Compile in terminal type: javac ArrayMinMaxSumAvgCount.java
// To Run in terminal type: ArrayMinMaxSumAvgCount 

public class ArrayMinMaxSumAvgCount {
    public static void main(String[] args) {
        int sum = 0, count = 0, smallest = 0, largest = 0;
        int c[] = {4, 2, 2, 2, 1, 5, 7};

        for (int i = 0; i < c.length; i++) {
            // make smallest and largest equal to the first element:
            if (i == 0) {
                smallest = c[0];
                largest = c[0]; // do the same for largest
            } else {
                // if any element is SMALLER than smallest...
                if (c[i] < smallest)
                    smallest = c[i]; // ... this is the new smallest

                // if any element is LARGER than largest...
                if (c[i] > largest)
                    largest = c[i]; // ... this is the new largest
            }

            // to calculate sum:
            sum += c[i]; // ...add every element of the array to sum

            // count how many elements are equal to 2
            if (c[i] == 2)
                count++;
        } // end of for loop

        System.out.println("Sum = " + sum + " Average = " + (double) sum / c.length);
        System.out.println("There are: " + c.length + " numbers in the array");
        System.out.println("Smallest = " + smallest);
        System.out.println("Largest = " + largest);
        System.out.println("There are " + count + " elements equal to 2");
    }
}

/*
There are: 7 numbers in the array
Smallest = 1
Largest = 7
There are 3 elements equal to 2
/*