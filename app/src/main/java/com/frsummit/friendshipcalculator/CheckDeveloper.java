package com.frsummit.friendshipcalculator;

public class CheckDeveloper {

    public boolean checkDeveloperAndHisWife(String name_1, String name_2) {
        name_1 = name_1.toUpperCase();
        name_2 = name_2.toUpperCase();

        if(name_1.equals("FRS") && name_2.equals("HSR)")) {
            return false;
        } else if(name_1.equals("S") && name_2.equals("H")) {
            return false;
        } else if(name_1.equals("S") && name_2.equals("S")) {
            return false;
        } else if(name_1.equals("S") && name_2.equals("R")) {
            return false;
        } else if(name_1.equals("HSR") && name_2.equals("FRS")) {
            return false;
        } else if(name_1.equals("H") && name_2.equals("S")) {
            return false;
        } else if(name_1.equals("S") && name_2.equals("S")) {
            return false;
        } else if(name_1.equals("R") && name_2.equals("S")) {
            return false;
        }
        else return true;
    }
}
