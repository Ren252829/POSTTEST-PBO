public class Produk {
    int id_produk,stok_produk;
    String nama_produk,jenis_produk,harga_produk;

    public Produk(int id_produk, int stok_produk, String nama_produk, String jenis_produk, String harga_produk) {
        this.id_produk = id_produk;
        this.stok_produk = stok_produk;
        this.nama_produk = nama_produk;
        this.jenis_produk = jenis_produk;
        this.harga_produk = harga_produk;
    }

    void display(){
        System.out.println("ID : "+id_produk);
        System.out.println("Name : "+nama_produk);
        System.out.println("Type : "+jenis_produk);
        System.out.println("Price : Rp "+harga_produk);
        System.out.println("Stock : "+stok_produk);
    }
}
