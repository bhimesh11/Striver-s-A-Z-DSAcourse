package arrays1.genral;

public class Denominations
{
    public static void main(String[] args) {

        int amounnt = 989;
        calculateDenominations(amounnt);
    }

    private static void calculateDenominations(int amounnt) {
        int[] denominations = {2000,1000,500,200,100,50,20,10,5,2,1};

        System.out.println("Denominations");
        for(int denom: denominations)
        {
            int count = amounnt/denom;
            System.out.println("count = "+count + "==>" + amounnt + "/" + denom);
            if(count>0)
                System.out.println(denom + "*" + count);
            amounnt = amounnt % denom;
            System.out.println("amounnt = " + amounnt + "%" + denom);



        }
    }
}
