package com.example.bestrepoever;

public class InvasiveCollabClassThatRuinsAllYourCode {


    int レカシブ(){
        int breaker = 1;
        for (int i = 1; i < 10000; i++) {
            breaker = breaker * i;
            for (int j = 1; j < 10000; j++) {
                breaker = breaker * j;
                for (int k = 0; k < breaker; k++) {
                    レカシブ();
                }
            }
        }
        return breaker;
    }
}
