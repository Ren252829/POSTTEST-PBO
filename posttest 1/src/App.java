import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Produk> dataproduk = new ArrayList<>();

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

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
                System.out.print("Insert Prize :");
                String harga_produk = br.readLine();
                System.out.print("Insert Stock :");
                int stok_produk = Integer.parseInt(br.readLine());

                Produk probaru = new Produk(id_produk, stok_produk, nama_produk, jenis_produk, harga_produk);
                dataproduk.add(probaru);

                System.out.println("Product Added");
                
            }

            else if (menu.equals("2")) {
                System.out.println("");
                for (int i = 0; i < dataproduk.size(); i++) {
                    System.out.println("Product " + i);
                    dataproduk.get(i).display();
                }
            }

            else if (menu.equals("3")) {
                System.out.println("");
                for (int i = 0; i < dataproduk.size(); i++) {
                    System.out.println("Product " + i);
                    dataproduk.get(i).display();
                }
                System.out.print("Update Which Product : ");
                int update = Integer.parseInt(br.readLine());

                if (update <= dataproduk.size()) {
                    System.out.println("Update Product Details");
                    System.out.println("======================");
                    System.out.println("1. Update ID");
                    System.out.println("2. Update Name");
                    System.out.println("3. Update Type");
                    System.out.println("4. Update Prize");
                    System.out.println("5. Update Stock");
                    System.out.println("6. Update All");
                    System.out.println("0. Main Menu");
                    System.out.print("Update Which data :");
                    String updatemenu = br.readLine();

                    if (updatemenu.equals("1")) {
                        System.out.print("insert new ID :");
                        dataproduk.get(update).id_produk = Integer.parseInt(br.readLine());
                        System.out.println("Product Updated");
                    }

                    else if (updatemenu.equals("2")) {
                        System.out.print("insert new Name :");
                        dataproduk.get(update).nama_produk = br.readLine();
                        System.out.println("Product Updated");
                    }

                    else if (updatemenu.equals("3")) {
                        System.out.print("insert new Type :");
                        dataproduk.get(update).jenis_produk = br.readLine();
                        System.out.println("Product Updated");
                    }

                    else if (updatemenu.equals("4")) {
                        System.out.print("insert new Prize : Rp");
                        dataproduk.get(update).harga_produk = br.readLine();
                        System.out.println("Product Updated");
                    }

                    else if (updatemenu.equals("5")) {
                        System.out.print("insert new Stock :");
                        dataproduk.get(update).stok_produk = Integer.parseInt(br.readLine());
                        System.out.println("Product Updated");
                    }

                    else if (updatemenu.equals("6")) {
                        System.out.println("");
                        System.out.print("Insert ID :");
                        dataproduk.get(update).id_produk = Integer.parseInt(br.readLine());
                        System.out.print("Insert Name :");
                        dataproduk.get(update).nama_produk = br.readLine();
                        System.out.print("Insert Type :");
                        dataproduk.get(update).jenis_produk = br.readLine();
                        System.out.print("Insert Prize :");
                        dataproduk.get(update).harga_produk = br.readLine();
                        System.out.print("Insert Stock :");
                        dataproduk.get(update).stok_produk = Integer.parseInt(br.readLine());

                        System.out.println("Product Updated");
                    }

                    else if (updatemenu.equals("0")) {
                        break;
                    }

                    else{
                        System.out.println("Invalid");
                    }
                    
                }
                else{
                    System.out.println("Data does not exist");
                }
            }

            else if (menu.equals("4")) {
                System.out.println("");
                for (int i = 0; i < dataproduk.size(); i++) {
                    System.out.println("Product " + i);
                    dataproduk.get(i).display();
                }
                System.out.print("Insert ID :");
                int delID = Integer.parseInt(br.readLine());
                for (int i = 0; i < dataproduk.size(); i++) {
                    if (delID == dataproduk.get(i).id_produk) {
                        dataproduk.remove(i);
                        System.out.println("Product Deleted");
                    }
                    
                }
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

}