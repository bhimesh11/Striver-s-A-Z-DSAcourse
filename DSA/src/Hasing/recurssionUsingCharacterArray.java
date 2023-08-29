package Hasing;

import java.util.Scanner;

public class recurssionUsingCharacterArray {

    public static void main(String[] args) {

        String s = "abcdabehf";
        char[] sa = s.toCharArray();

        int[] hash = new int[256];
        for (int i = 0; i < s.length(); i++)
        {
            hash[sa[i]]++;

        }
        int q;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of words");
        q= sc.nextInt();

        while(q!=0)
        {
            String w;
            char c = 0;
            Scanner sc2 = new Scanner(System.in);
            System.out.println("Enter the words");
            w= sc2.next();
            if(w.length()>=0)
            {
                 c = w.charAt(0);
            }
            System.out.println(hash[c]);
            q--;

        }


    }
}
