public class loops {

    public static int addOdds(int n){
        int total=0;

        for (int i=1; i<=n; i+=2) {
            total += i;
        }
        return total;
    }

    public static int howManyYears(double startpop, double endpop){
        double rate=1.13;
        int i=0;

        while (startpop<=endpop){
            startpop*=rate;
            i++;

        }

        return i;
    }

    /* public static int sumDigits(int number){
        int i=1;
        int total=0;

        while(number!=0){
            int a=number%10;
            number-=a;
            a/=i;
            total+=a;
            i*=10;


        }

        return total;
    } */
    public static int sumDigits(int number) {
        int i = 0;
        int total = 0;
        int tempnumber=number;

        while (tempnumber != 0) {
            tempnumber /= 10;
            i++;
        }

        for (; i>=0; i--){
            tempnumber=number;
            int l=(tempnumber%=Math.pow(10,i));
            total+=(l/Math.pow(10,i-1));
        }
        return total;
    }

    public static void sillyNumbers(){
        int j=0;
        for (int h=0; h<10; h++, j++)
            for (int i=0; i<3; i++)
            {
                System.out.print(j);
            }


        }

    public static void sillyNumbers2(){
        int j=9;
        for (int h=0; h<10; h++, j--)
            for (int i=j; i>0; i--)
            {
                System.out.print(j);
            }


    }

        public static void main(String [] args){
        System.out.println(addOdds(10));
        System.out.println(addOdds(100));
        System.out.println(addOdds(1));
        System.out.println(addOdds(0));
        System.out.println();
        System.out.println(howManyYears(111.2, 120));
        System.out.println(howManyYears(111.2, 150));
        System.out.println();
        System.out.println(sumDigits(11111));
        System.out.println(sumDigits(11));
        System.out.println(sumDigits(1234567));
        System.out.println();
        sillyNumbers();
        System.out.println();
        sillyNumbers2();











    }
}
