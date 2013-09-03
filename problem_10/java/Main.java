import java.util.ArrayList;
import java.util.List;

class Main{

    public static void main(String[] args){

        if(args.length < 1)
            System.exit(0);

        int max = Integer.parseInt(args[0]);
        long sum = 2;

        for(int i = 3; i < max; i++)
            if(isPrime(i))
                sum += i;

        System.out.println("Sum: " + sum);

    }

    public static boolean isPrime(int n){

        //check if n is a multiple of 2
        if (n % 2 == 0)
            return false;

        //if not, then just check the odds
        for(int i = 3; i * i <= n; i += 2)
            if(n % i == 0)
                return false;

        return true;
    }

    private static boolean isPrime(int num, List<Integer> primes){
        
        if(num % 2 == 0)
            return false;
        else if(num % 3 == 0)
            return false;
        else if(num % 5 == 0)
            return false;
        else if(num % 7 == 0)
            return false;
        else if(num % 11 == 0)
            return false;

        for(int prime : primes)
            if(num % prime == 0)
                return false;

        primes.add(num);
        return true;
    }

}
