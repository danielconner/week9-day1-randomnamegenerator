package models;

import java.util.ArrayList;
import java.util.Collections;

public class Name {

    public static String oneName(){
        ArrayList<String>names = new ArrayList<String>();
        names.add("Danny");
        names.add("Ed");
        names.add("Jim");
        names.add("Jean");
        names.add("Chris");
        names.add("Victor");
        names.add("Christie");
        names.add("Emma");
        names.add("Steven");
        Collections.shuffle(names);
        return names.get(0);
    }

    public static String twoNames(){
        ArrayList<String>names = new ArrayList<String>();
        names.add("Danny");
        names.add("Ed");
        names.add("Jim");
        names.add("Jean");
        names.add("Chris");
        names.add("Victor");
        names.add("Christie");
        names.add("Emma");
        names.add("Steven");
        Collections.shuffle(names);
        String result = names.get(0) +" & "  + names.get(1);
        return result;
    }

    public static String threeNames(){
        ArrayList<String>names = new ArrayList<String>();
        names.add("Danny");
        names.add("Ed");
        names.add("Jim");
        names.add("Jean");
        names.add("Chris");
        names.add("Victor");
        names.add("Christie");
        names.add("Emma");
        names.add("Steven");
        Collections.shuffle(names);
        String result = names.get(0) +" & "  + names.get(1)+ " & " + names.get(2);
        return result;
    }


}
