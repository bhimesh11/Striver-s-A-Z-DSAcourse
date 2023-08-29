package Hasing;

import java.util.Scanner;

public class hashing {

    public static void main(String[] args) {
        int n =5;
        int[] arr = {1,3,2,1,3};


         int[] hash = new int[13];
          for(int i =0;i<n;i++)
          {
              hash[arr[i]] += 1;
              System.out.println(hash[arr[i]]);
              System.out.println(hash[i]);
          }

          int q;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter total numbers");
        q = sc.nextInt();

        while(q!=0)
        {
            int number;
            Scanner scan = new Scanner(System.in);
            System.out.println("enter the number");
            number = scan.nextInt();

            System.out.println(hash[number]);
            q--;

        }
    }
}
