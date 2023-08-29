package sortings;

public class selectionSort {
    public static void main(String[] args) {

        int[] arr = {13, 46, 24, 52, 20, 9};
        int size = arr.length;
        System.out.println("Hi");

        for(int i = 0; i<= size-2;i++)
        {
            int mini = i;

            for(int j = i ; j<= size-1;j++)
            {
                if(arr[j]<arr[mini])
                {
                    mini = j; // j =5 ;mini = 5;
                }
            }
            int temp = arr[mini];  // arr[5] =9
            arr[mini]= arr[i]; //arr[i] = 0  13 into mini
            arr[i] = temp; //placing 9 here
        }
        for(int i =0 ;i<size;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}

// time complexity O(n*2)
