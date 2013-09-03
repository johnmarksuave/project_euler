import java.util.*;

public class Main{

    public static void main(String[] args){
        
        long startChain = 2;
        long endChain = 1000000;

        long maxChainLength = 0;
        long maxChainVal = 0;
        
        while(startChain < endChain){

            long chainLength = getChainLength(startChain, 0);
            
            if(chainLength > maxChainLength){
                maxChainLength = chainLength;
                maxChainVal = startChain;
            }

            startChain++;
        }

        System.out.println("Chain start value: " + maxChainVal);
        System.out.println("Chain length: " + maxChainLength);

    }

    public static long getChainLength(long chainVal, long chainLen){

        if(chainVal == 1)
            return chainLen;

        if(chainVal % 2 == 0)
            return getChainLength(chainVal / 2, chainLen + 1);
        else
            return getChainLength((chainVal * 3) + 1, chainLen + 1);
    }

}
