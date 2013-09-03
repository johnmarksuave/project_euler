public class Main{

    public static void main(String[] args){
        
        int numFactors = 0;
        int maxNumFactors = 0;
        long triangleIndex = 1L;
        long triangleNumber = 0;;
        
        while(maxNumFactors <= 501){
            triangleNumber = getTriangleNum(triangleIndex);
            numFactors = countFactors(triangleNumber);
            triangleIndex++;

            if(numFactors > maxNumFactors)
                maxNumFactors = numFactors;
        }

        System.out.println("Triangle index: " + triangleIndex);
        System.out.println("Triangle number: " + triangleNumber);
        System.out.println("Num factors: " + numFactors);

    }

    public static int countFactors(long number){

        int numFactors = 0;

        int incrementer = number % 2 == 0 ? 1 : 2; 

        for(int i = 1; i <= number; i += incrementer)
            if(number % i == 0)
                numFactors++;

        return numFactors;
    }

    public static long getTriangleNum(long triangleIndex){
        return triangleIndex == 1 ? 1 : triangleIndex + getTriangleNum(triangleIndex - 1);
    }

}
