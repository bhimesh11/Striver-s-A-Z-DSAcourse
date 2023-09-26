package arrays1.BetterApproach;

public class missingNumbersUsingHashing {

    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5,6,8,9};
        int size = arr.length;
        int[] hash = new int[size+1];

        System.out.println(findMissingNumberinArray(arr, size));

    }

    private static int findMissingNumberinArray(int[] arr, int size) {


        int[] hash = new int[size+1];
        //int flag = 0;
for(int i =0;i<size-1;i++) {
    hash[arr[i]] =  1;
}

for(int i =1;i<=hash.length;i++)
{
if(hash[i] == 0)
{
    return i;
}
}
return -01;
    }
}
