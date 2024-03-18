import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class App {
    static ArrayList<Produk> dataproduk = new ArrayList<>();
    static InputStreamReader isr = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(isr);
    public static void main(String[] args) throws Exception {


        System.out.println("========================");
        System.out.println("TEMPO TUNES MUSIC STORE");
        System.out.println("========================");

        while (true) {
            System.out.println("");
            System.out.println("Main Menu");
            System.out.println("1. Add Product");
            System.out.println("2. Display Product");
            System.out.println("3. Update Product");
            System.out.println("4. Delete Product");
            System.out.println("0. Exit Program");
            System.out.print("Menu : ");
            String menu = br.readLine();


            if (menu.equals("1")) {
                System.out.println("");
                System.out.print("Insert ID :");
                int id_produk = Integer.parseInt(br.readLine());
                System.out.print("Insert Name :");
                String nama_produk = br.readLine();
                System.out.print("Insert Type :");
                String jenis_produk = br.readLine();
                System.out.print("Insert Price :");
                String harga_produk = br.readLine();
                System.out.print("Insert Stock :");
                int stok_produk = Integer.parseInt(br.readLine());

                Produk probaru = new Produk(id_produk, stok_produk, nama_produk, jenis_produk, harga_produk);
                dataproduk.add(probaru);

                System.out.println("Product Added");
                
            }

            else if (menu.equals("2")) {
                display();
               
            }

            else if (menu.equals("3")) {
               display();
               System.out.print("Enter ID of product you want to change :");
               int chng = Integer.parseInt(br.readLine());
               for(Produk pro : dataproduk){
                if (pro.getId_produk() == chng) {
                    System.out.println("Product Change");
                    System.out.println("============");
                    System.out.print("Enter new Name : ");
                    pro.setNama_produk(br.readLine());
                    System.out.print("Enter new Type : ");
                    pro.setJenis_produk(br.readLine());
                    System.out.print("Enter new Price : ");
                    pro.setHarga_produk(br.readLine());
                    System.out.print("Enter new Stock : ");
                    pro.setStok_produk(Integer.parseInt(br.readLine()));
                    System.out.println("==================");
                    System.out.println("  Product Changed ");
                    System.out.println("==================");
                }
               }
            }

                   

            else if (menu.equals("4")) {
                display();
                delete();
                
        }

        else if (menu.equals("0")) {
            System.out.println("Exit Program");
            break;
        }

        else {
            System.out.println("Input Invalid");
        }
    }
    
}

    public static void display() throws IOException{
        if (dataproduk.size() < 1) {
            System.out.println("Data Empty");
        } else{
            System.out.println("Product List");
            System.out.println("============");
            for (int i = 0; i < dataproduk.size(); i++) {
                System.out.println("Product No - "+(i+1));
                System.out.println("ID Product : "+ dataproduk.get(i).getId_produk());
                System.out.println("Name : "+ dataproduk.get(i).getNama_produk());
                System.out.println("Type : "+dataproduk.get(i).getJenis_produk());
                System.out.println("Price : Rp"+dataproduk.get(i).getHarga_produk());
                System.out.println("Stock : "+dataproduk.get(i).getStok_produk());
                
            }
        }
    }

    public static void delete() throws IOException{
        System.out.print("Enter ID Product you wish to delete :");
        int hapuspro = Integer.parseInt(br.readLine());
        for (int i = 0; i < dataproduk.size(); i++) {
            if (hapuspro == dataproduk.get(i).getId_produk()) {
                dataproduk.remove(i);
                System.out.println("==============");
                System.out.println("Product Deleted");
                System.out.println("==============");
            }
            else{
                System.out.println("==============");
                System.out.println("Product Didn't Exist");
                System.out.println("==============");
            }
        }
    }

}