package be.intecbrussel.films;

import java.util.ArrayList;
import java.util.List;

public class DVDCollection {

    //ik heb commentaar!!!

    List<DVD> dvdcollection = new ArrayList<>();

    public void addDVD(DVD dvd){
        dvdcollection.add(dvd);
    }

    public void addDVD(String titel, int jaar, double duur){
        dvdcollection.add(new DVD(titel, jaar, duur));
    }

    public void toonDVD(){
        dvdcollection.stream().forEach(System.out::println);
    }

    public String toString(){

        StringBuilder builder = new StringBuilder();

        for (DVD dvd: dvdcollection) {
           builder.append(dvd).append("\n");
        }
        return builder.toString();
    }
}
