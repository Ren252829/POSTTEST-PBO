public class Album extends Produk {
    private String artist_name, realese_date,Genre;
    
    public Album(int id_produk, int stok_produk, String nama_produk, String jenis_produk, String harga_produk,
     String artist_name, String realese_date, String Genre) {
        super(id_produk, stok_produk, nama_produk, jenis_produk, harga_produk);
        
        this.artist_name = artist_name;
        this.realese_date = realese_date;
        this.Genre = Genre;
    }

    public String getArtist_name() {
        return artist_name;
    }

    public void setArtist_name(String artist_name) {
        this.artist_name = artist_name;
    }

    public String getRealese_date() {
        return realese_date;
    }

    public void setRealese_date(String realese_date) {
        this.realese_date = realese_date;
    }

    public String getGenre() {
        return Genre;
    }

    public void setGenre(String genre) {
        Genre = genre;
    }

    

    
}
