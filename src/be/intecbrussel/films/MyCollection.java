package be.intecbrussel.films;

public class MyCollection {
    public static void main(String[] args) {
        DVDCollection films = new DVDCollection();

        films.addDVD("Johnny English", 2003, 10.2);
        films.addDVD("Mr. Bean's Holiday", 2007, 8.9);
        films.addDVD("The Lion King", 1994, 20.8);

        System.out.println(films);

        DVD hugeGrant = new DVD("Four Weddings and a Funeral", 1994, 12.33);

        films.addDVD(hugeGrant);

        System.out.println(films);

        films.toonDVD();

        System.out.println("hello from the other side");

    }


}
