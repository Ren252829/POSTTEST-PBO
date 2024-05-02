// interface search untuk mencari data
public interface Search {

    //dua method dalam interfaces
    void SearchAlbum(String albumName);

    void SearchInstrument(String instrumentName);

    //implementasi keyword static
    static void Searching(){
        System.out.println("Search Menu");
    }
    
}