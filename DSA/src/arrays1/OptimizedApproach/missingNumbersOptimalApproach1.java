package arrays1.OptimizedApproach;

import java.util.Arrays;

public class missingNumbersOptimalApproach1
{
    public static void main(String[] args) {

        int[] arr = {1,2,4,5,6};
        int size = arr.length;

        int summation = (size * (size+1))/2;
        int sum = 0 ;
        for(int i=0;i<size;i++)
        {
            sum = sum + arr[i];
        }
        int finalResult = sum-summation;
        System.out.println(finalResult);
        int InsertIndex = Arrays.binarySearch(arr,finalResult);
        System.out.println(InsertIndex);
        if(InsertIndex<0)

        {
            InsertIndex = -(InsertIndex);
        }
        System.out.println(InsertIndex);

        int[] newArray = new int[size +1];
        System.out.println(newArray.length);
//
////        System.arraycopy(arr , 0 , newArray,0,InsertIndex);
////        newArray[InsertIndex] = finalResult;
////        System.arraycopy(arr , InsertIndex, newArray,InsertIndex+1,size-InsertIndex);
//        for(int i = 1 ;i<newArray.length;i++)
//        {
//            int flag =0;
//            for(int j =0 ;j<newArray.length-1;j++)
//            {
//                if(arr[j]!=i)
//                {
//                    newArray[i] = finalResult;
//                }
//                else {
//                    newArray[i] = arr[i];
//                }
//            }
//        }
//        for(int i = 0 ;i<newArray.length;i++)
//        {
//            System.out.print(newArray[i] + " ") ;
//        }
    }


}
