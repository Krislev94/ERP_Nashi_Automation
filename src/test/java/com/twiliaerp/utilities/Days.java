package com.twiliaerp.utilities;

public enum Days {
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(0);

    int index;
    Days(int i){
        index = i;
    }

    public int getIndex(){
        return index;
    }



}
