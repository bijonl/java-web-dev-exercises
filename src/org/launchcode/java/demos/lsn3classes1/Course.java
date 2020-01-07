package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;

public class Course {
    private String name;
    private int classSize;
    private ArrayList<String> daysOffered = new ArrayList<String>();

    public String getName() {
        return name;
    };

    public void setName(String aName) {
        this.name = aName;
    }

    public int getClassSize() {
        return classSize;
    }

    public void setClassSize(int aClassSize) {
        this.classSize = aClassSize;
    }

    public ArrayList<String> getDaysOffered() {
        return daysOffered;
    }

    public void setDaysOffered(String dayOfWeek) {
        daysOffered.add(dayOfWeek);
    }
}
