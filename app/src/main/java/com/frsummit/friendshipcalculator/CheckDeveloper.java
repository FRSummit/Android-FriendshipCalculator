package com.frsummit.friendshipcalculator;

public class CheckDeveloper {

    public boolean checkDeveloperAndHisWife(String name_1, String name_2) {
        name_1 = name_1.toUpperCase();
        name_2 = name_2.toUpperCase();

//        String parts_1[] = name_1.split(" ");
//        String parts_2[] = name_2.split(" ");
//
//        int largestName = parts_1.length < parts_2.length ? parts_2.length : parts_1.length;
//
//        for(int i=0; i<largestName; i++) {
//            if(parts_1[i] == "FAYAZUR" && parts_2[0] == "HAFSINA") return false;
//            else if(parts_1[i] == "RAHMAN" && parts_2[0] == "") return false;
//            else if(parts_1[i] == "SUMMIT" && parts_2[0] == "") return false;
//            else if(parts_1[i] == "HAFSINA" && parts_2[0] == "") return false;
//            else if(parts_1[i] == "SHEHERIN" && parts_2[0] == "") return false;
//            else if(parts_1[i] == "RIMI" && parts_2[0] == "") return false;
//        }

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
