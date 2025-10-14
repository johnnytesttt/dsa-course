
/**
public class Collatz {
    public static int larger(int x, int y) {
        if (x > y) {
            return x;
        }
        return y;
    }

    public static void main(String[] args) {
        System.out.println(larger(5, -10)); // prints out 5 here!
    }
}
 */

public class Collatz {
    public static int collatzSequence(int n) {
        if (n == 1) { // meaning we end the sequence (just returns 1 in this case)
            return n;
        }
        else if (n % 2 == 0) {
            return n/2; // if the number is even, the number we return is that even number divided by 2 (e.g 4 = 4/2 = 2)
        }
        return 3*n+1; // if the number is odd, we return that number * 3 + 1 
    }

    public static void main(String[] args) {
        System.out.println(collatzSequence(5));
    }
}

