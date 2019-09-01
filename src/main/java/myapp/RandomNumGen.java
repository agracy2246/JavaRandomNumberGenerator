package myapp;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class RandomNumGen {
    private Queue<Integer> numQ;
    private Random rand;

    public RandomNumGen(){
        numQ = new LinkedList<>();
        rand = new Random();
    }

    public int getNumber(){
        int num = getRandomNum();

        while(!numQ.contains(num)){
            num = getRandomNum();
            if(numQ.size() >= 749){
                numQ.poll();
            }
            numQ.add(num);
        }
        return num;
    }


    // set to private later
    private int getRandomNum(){
        return (int)(Math.random() * 1000000 + 1);
    }
}
