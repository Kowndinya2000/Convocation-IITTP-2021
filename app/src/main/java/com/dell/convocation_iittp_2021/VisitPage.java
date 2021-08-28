package com.dell.convocation_iittp_2021;

public class VisitPage {
    static boolean[] isHome;
    VisitPage() {
        isHome = new boolean[14];
        for (int i = 0; i <14 ; i++) {
            isHome[i] = false;
        }
    }
    public static String setHomeVisit() {
        int count = 0;
        for (int i = 0; i <14 ; i++) {
            if(isHome[i]){
                count += 1;
            }
        }
        return String.valueOf(count);
    }

}
