package Hasing;

import java.util.Scanner;

public class hashingPractise2
{
    public static void main(String[] args) {

        int n = 5;
        int [] arr = {1,3,4,3,4};
        int [] hash = new int[1000000];
        for(int i = 0;i<n;i++)
        {
            hash[arr[i]] = hash[arr[i]]+1;
        }
        int q;
        Scanner sc = new Scanner(System.in);
        q=sc.nextInt();

        while(q!=0)
        {
            int w ;
            Scanner sc2 = new Scanner(System.in);
            w = sc2.nextInt();
            System.out.println(hash[w]);
            q--;
        }
    }
}
