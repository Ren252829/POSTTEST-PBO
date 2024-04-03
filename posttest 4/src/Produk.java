public class Produk {
    private int id_produk;
    public int stok_produk;
    public String nama_produk;
    private String jenis_produk,harga_produk;

    public Produk(int id_produk, int stok_produk, String nama_produk, String jenis_produk, String harga_produk) {
        this.id_produk = id_produk;
        this.stok_produk = stok_produk;
        this.nama_produk = nama_produk;
        this.jenis_produk = jenis_produk;
        this.harga_produk = harga_produk;
    }

    public int getId_produk() {
        return id_produk;
    }

    public void setId_produk(int id_produk) {
        this.id_produk = id_produk;
    }

    public int getStok_produk() {
        return stok_produk;
    }

    public void setStok_produk(int stok_produk) {
        this.stok_produk = stok_produk;
    }

    public String getNama_produk() {
        return nama_produk;
    }

    public void setNama_produk(String nama_produk) {
        this.nama_produk = nama_produk;
    }

    public String getJenis_produk() {
        return jenis_produk;
    }

    public void setJenis_produk(String jenis_produk) {
        this.jenis_produk = jenis_produk;
    }

    public String getHarga_produk() {
        return harga_produk;
    }

    public void setHarga_produk(String harga_produk) {
        this.harga_produk = harga_produk;
    }

    public void displayData(){
        //membuat fungsi overriding
    }


}
