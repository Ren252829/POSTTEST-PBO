import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class App {
    static InputStreamReader isr = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(isr);
    static ArrayList<Produk> dataproduk = new ArrayList<>();
    static ArrayList<Instrument> inst = new ArrayList<>();
    static ArrayList<Album> alb = new ArrayList<>();

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
                System.out.println("Adding Product");
                System.out.println("1. Add Album");
                System.out.println("2. Add Instrument");
                System.out.print("input :");
                String pilih = br.readLine();
                if ("1".equals(pilih)) {
                    System.out.println("Adding New Album");
                    System.out.print("ID  :");
                    int id_produk = Integer.parseInt(br.readLine());
                    System.out.print("Name  :");
                    String nama_produk = br.readLine();
                    System.out.print("Type  :");
                    String jenis_produk = br.readLine();
                    System.out.print("Artist  :");
                    String artist_name = br.readLine();
                    System.out.print("Genre  :");
                    String Genre = br.readLine();
                    System.out.print("Released  :");
                    String realese_date = br.readLine();
                    System.out.print("Price  :");
                    String harga_produk = br.readLine();
                    System.out.print("Stock  :");
                    int stok_produk = Integer.parseInt(br.readLine());
                    Album alb_data = new Album(id_produk, stok_produk, nama_produk, jenis_produk, harga_produk,
                            artist_name, realese_date, Genre);
                    alb.add(alb_data);
                    System.out.println("Product Added");

                } else if ("2".equals(pilih)) {
                    System.out.println("Adding New Instrument");
                    System.out.print("ID  :");
                    int id_produk = Integer.parseInt(br.readLine());
                    System.out.print("Name  :");
                    String nama_produk = br.readLine();
                    System.out.print("Type  :");
                    String jenis_produk = br.readLine();
                    System.out.print("Instrument Type  :");
                    String instype = br.readLine();
                    System.out.print("Manufactured by  :");
                    String manufaktur = br.readLine();
                    System.out.print("Price  :");
                    String harga_produk = br.readLine();
                    System.out.print("Stock  :");
                    int stok_produk = Integer.parseInt(br.readLine());
                    Instrument inst_data = new Instrument(id_produk, stok_produk, nama_produk, jenis_produk,
                            harga_produk, instype, manufaktur);
                    inst.add(inst_data);
                    System.out.println("Product Added");
                }

                else {
                    System.out.println("Invalid");
                }

            }

            else if (menu.equals("2")) {
                display();

            }

            else if (menu.equals("3")) {
                display();
                System.out.print("""
                        Edit Pruduct
                        1. Edit Album
                        2. Edit Instrument
                        """);
                System.out.print("menu  :");
                String pilih = br.readLine();
                if ("1".equals(pilih)) {
                    System.out.print("Enter ID of product you want to change :");
                    int chng = Integer.parseInt(br.readLine());
                    for (Album albu : alb) {
                        if (albu.getId_produk() == chng) {
                            System.out.println("============");
                            System.out.println("Product Change");
                            System.out.println("============");
                            System.out.print("Enter new Name : ");
                            albu.setNama_produk(br.readLine());
                            System.out.print("Enter new Type : ");
                            albu.setJenis_produk(br.readLine());
                            System.out.print("Enter new Artist : ");
                            albu.setArtist_name(br.readLine());
                            System.out.print("Enter new Genre : ");
                            albu.setGenre(br.readLine());
                            System.out.print("Enter new Realese Date : ");
                            albu.setRealese_date(br.readLine());
                            System.out.print("Enter new Price : ");
                            albu.setHarga_produk(br.readLine());
                            System.out.print("Enter new Stock : ");
                            albu.setStok_produk(Integer.parseInt(br.readLine()));
                            System.out.println("==================");
                            System.out.println("  Product Changed ");
                            System.out.println("==================");
                        }
                    }

                } else if ("2".equals(pilih)) {
                    System.out.print("Enter ID of product you want to change :");
                    int chng = Integer.parseInt(br.readLine());
                    for (Instrument instru : inst) {
                        if (instru.getId_produk() == chng) {
                            System.out.println("============");
                            System.out.println("Product Change");
                            System.out.println("============");
                            System.out.print("Enter new Name : ");
                            instru.setNama_produk(br.readLine());
                            System.out.print("Enter new Type : ");
                            instru.setJenis_produk(br.readLine());
                            System.out.print("Enter new Instrument Type : ");
                            instru.setInstype(br.readLine());
                            System.out.print("Enter new Manufacturer : ");
                            instru.setManufaktur(br.readLine());
                            System.out.print("Enter new Price : ");
                            instru.setHarga_produk(br.readLine());
                            System.out.print("Enter new Stock : ");
                            instru.setStok_produk(Integer.parseInt(br.readLine()));
                            System.out.println("==================");
                            System.out.println("  Product Changed ");
                            System.out.println("==================");
                        }
                    }
                }

            } else if (menu.equals("4")) {
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



    public static void display() throws IOException {
        System.out.println("""
                Lihat data
                1. Album
                2. Instrument
                3. Overall Album Stock
                4. Overall Instrument Stock
                """);
        System.out.print("Menu :");
        String pilih = br.readLine();
        if ("1".equals(pilih)) {
            if (alb.size() < 1) {
                System.out.println("Data Empty");
            } else {
               int pos = 1;
               for (int i  = 0; i <alb.size();i++){
                System.out.println("Product -" + pos++);
                alb.get(i).displayData();
               }
            }

        } else if ("2".equals(pilih)) {
            if (inst.size() < 1) {
                System.out.println("Data Empty");
            } else {
                int pos = 1;
               for (int i  = 0; i <inst.size();i++){
                System.out.println("Product -" + pos++);
                inst.get(i).displayData();
               }
            }
        } else if ("3".equals(pilih)) {
            System.out.println("total stok :" + getTotalStok(alb));
        }else if ("4".equals(pilih)) {
            System.out.println("total stok :" + getTotalStok());
        }
    }

    public static void delete() throws IOException {
        System.out.println("""
                Lihat data
                1. Album
                2. Instrument
                """);
        System.out.print("Menu :");
        String pilih = br.readLine();
        if ("1".equals(pilih)) {
            System.out.print("Enter ID Product you wish to delete :");
            int delalbum = Integer.parseInt(br.readLine());
            for (int i = 0; i < alb.size(); i++) {
                if (delalbum == alb.get(i).getId_produk()) {
                    alb.remove(i);
                    System.out.println("==============");
                    System.out.println("Product Deleted");
                    System.out.println("==============");
                } else {
                    System.out.println("==============");
                    System.out.println("Product Didn't Exist");
                    System.out.println("==============");
                }
            }
        } else if ("2".equals(pilih)) {
            System.out.print("Enter ID Product you wish to delete :");
            int delinst = Integer.parseInt(br.readLine());
            for (int i = 0; i < inst.size(); i++) {
                if (delinst == inst.get(i).getId_produk()) {
                    inst.remove(i);
                    System.out.println("==============");
                    System.out.println("Product Deleted");
                    System.out.println("==============");
                } else {
                    System.out.println("==============");
                    System.out.println("Product Didn't Exist");
                    System.out.println("==============");
                }
            }
        } else {
            System.out.println("Invalid");
        }

    }

    //Fungsi Overloading total stok album
    public static int getTotalStok(ArrayList<Album> alb) {
        int total = 0;
        for (Album a : alb) {
            total += a.stok_produk;
        }

        return total;
    }
    //Fungsi Overloading total stok instrument
    public static int getTotalStok() {
        int total = 0;
        for (Instrument b : inst) {
            total += b.stok_produk;
        }

        return total;
    }

    
}