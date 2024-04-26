public class Instrument extends Produk {
    private String instype,manufaktur;

    public Instrument(int id_produk, int stok_produk, String nama_produk, String jenis_produk, String harga_produk, String instype,String manufaktur){
        super(id_produk,stok_produk,nama_produk,jenis_produk,harga_produk);
        this.instype = instype;
        this.manufaktur = manufaktur;
    }

    public String getInstype() {
        return instype;
    }

    public void setInstype(String instype) {
        this.instype = instype;
    }

    public String getManufaktur() {
        return manufaktur;
    }

    public void setManufaktur(String manufaktur) {
        this.manufaktur = manufaktur;
    }

    //fungsi override
    @Override
    public void displayData(){
        System.out.println("ID Product : " + getId_produk());
        System.out.println("Name : " + getNama_produk());
        System.out.println("Type : " + getJenis_produk());
        System.out.println("Instrument Type : " + getInstype());
        System.out.println("Manufacture : " + getManufaktur());
        System.out.println("Price : Rp" + getHarga_produk());
        System.out.println("Stock : " + getStok_produk());
    }

    
    
}
