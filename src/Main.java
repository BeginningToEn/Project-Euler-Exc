/**
 * Created by EG OLIVER RC on 10/2/2017.
 */
public class Main {
    public static void main(String[] args) {
        int i = euler2();
        System.out.println(i);
    }

    public static int euler1() {
        int sum = 0;
        for ( int i = 1; i < 1000; i++) {
            if ( i % 3 == 0 || i % 5 ==0 ) {
                sum += i;
            }
        }
        return sum;
    }

    public static int euler2() {
        int sum = 0;

        int f_n_2 = 0;
        int f_n_1 = 1;
        int f_n = 1;

        while ( f_n < 4000000 ) {

            if ( f_n % 2 == 0 ) { sum += f_n; }

            f_n_2 = f_n_1;
            f_n_1 = f_n;
            f_n = f_n_1 + f_n_2;
        }

        return sum;
    }

    
}
