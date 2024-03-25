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
                """);
        System.out.print("Menu :");
        String pilih = br.readLine();
        if ("1".equals(pilih)) {
            if (alb.size() < 1) {
                System.out.println("Data Empty");
            } else {
                System.out.println("Product List");
                System.out.println("============");
                for (int i = 0; i < alb.size(); i++) {
                    System.out.println("Product No - " + (i + 1));
                    System.out.println("ID Product : " + alb.get(i).getId_produk());
                    System.out.println("Name : " + alb.get(i).getNama_produk());
                    System.out.println("Artist : " + alb.get(i).getArtist_name());
                    System.out.println("Genre : " + alb.get(i).getGenre());
                    System.out.println("Realese Date : " + alb.get(i).getRealese_date());
                    System.out.println("Type : " + alb.get(i).getJenis_produk());
                    System.out.println("Price : Rp" + alb.get(i).getHarga_produk());
                    System.out.println("Stock : " + alb.get(i).getStok_produk());

                }
            }

        } else if ("2".equals(pilih)) {
            if (inst.size() < 1) {
                System.out.println("Data Empty");
            } else {
                System.out.println("Product List");
                System.out.println("============");
                for (int i = 0; i < inst.size(); i++) {
                    System.out.println("Product No - " + (i + 1));
                    System.out.println("ID Product : " + inst.get(i).getId_produk());
                    System.out.println("Name : " + inst.get(i).getNama_produk());
                    System.out.println("Type : " + inst.get(i).getJenis_produk());
                    System.out.println("Instrument Type : " + inst.get(i).getInstype());
                    System.out.println("Manufacture : " + inst.get(i).getManufaktur());
                    System.out.println("Price : Rp" + inst.get(i).getHarga_produk());
                    System.out.println("Stock : " + inst.get(i).getStok_produk());

                }
            }
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
}