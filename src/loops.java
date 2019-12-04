// brandon bouley !! :D
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

    public static void sillyNumbers() {

        for (int g = 0; g < 3; g++) {
            int j = 0;
            for (int h = 0; h < 10; h++, j++)
                for (int i = 0; i < 3; i++) {
                    System.out.print(j);
                }
            System.out.println();


        }
    }

    public static void sillyNumbers2() {

        for (int g = 0; g < 3; g++) {
            int j = 9;
            for (int h = 0; h < 10; h++, j--)
                for (int i = j; i > 0; i--) {
                    System.out.print(j);
                }
            System.out.println();


        }
    }

    public static void  dollarsAndStars(){
        int outStar=0;
        int dollar=7;
        int inStar=14;


        for (int a=0; a<7; a++){
            for (int b=0; b<outStar; b++){
                System.out.print("*");
            }


            for (int c=0; c<dollar; c++){
                System.out.print("$");

            }


            for (int d=0; d<inStar; d++){
                System.out.print("*");
            }
            inStar-=2;

            for (int c=0; c<dollar; c++){
                System.out.print("$");

            }
            dollar--;

            for (int b=0; b<outStar; b++){
                System.out.print("*");
            }
            outStar+=2;

            System.out.println();

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
        System.out.println();
        dollarsAndStars();












    }
}
/*
25
2500
1
0

1
3

5
2
28

000111222333444555666777888999
000111222333444555666777888999
000111222333444555666777888999

999999999888888887777777666666555554444333221
999999999888888887777777666666555554444333221
999999999888888887777777666666555554444333221

$$$$$$$**************$$$$$$$
**$$$$$$************$$$$$$**
****$$$$$**********$$$$$****
******$$$$********$$$$******
********$$$******$$$********
**********$$****$$**********
************$**$************
 */