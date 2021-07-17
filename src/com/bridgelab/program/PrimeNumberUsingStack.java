package com.bridgelab.program;

import Implementations.StackImplementUsingLinkList;

public class PrimeNumberUsingStack {
    public static void main(String[] args) {
        int start = 0;
        int end = 1000;
        PrimeNumber2DArray p = new PrimeNumber2DArray();
        PrimeAnagramRange2DArray pa = new PrimeAnagramRange2DArray();
        StackImplementUsingLinkList<Integer> stack = new StackImplementUsingLinkList<Integer>();

        // putting values in array
        for (int i = start; i <= end; i++) {
            if (p.isPrime(i)) {
                for (int j = i + 1; j < end; j++){
                    if(p.isPrime(j)){
                        if(pa.isAnagram(String.valueOf(i),String.valueOf(j))){
                            stack.push(i);
                            stack.push(j);
                        }
                    }
                }
            }
        }

        int stackSize = stack.size();

        // printing values
        for(int i = 0; i < stackSize; i++){
            System.out.print(stack.peek() + " ");
            if(!stack.isEmpty())
                stack.pop();
            System.out.println();
        }
    }
}