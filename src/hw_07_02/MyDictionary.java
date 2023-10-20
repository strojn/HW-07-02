package hw_07_02;

import java.util.ArrayList;

public class MyDictionary {
    private int totalNumber = 0;
    public int getTotalNumber() {
        return totalNumber;
    }
    public ArrayList<String> engList = new ArrayList<>();
    public ArrayList<String> ukrList = new ArrayList<>();
    public void add(String engString, String ukrString) {
        engList.add(engString);
        ukrList.add(ukrString);
        totalNumber++;
    }
    public String getUkr(String engString) {
        return ukrList.get( engList.indexOf(engString) );
    }
    public String getEng(String ukrString) {
        return engList.get( ukrList.indexOf(ukrString) );
    }
}
