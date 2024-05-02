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

        // Adding albums to the alb ArrayList
        alb.add(new Album(1, 10, "21", "Album", " IDR 14,991.00", "Adele", "2011", "Soul/Pop"));
        alb.add(new Album(2, 10, "New Blue Sun", "Album", "IDR 199,999.00", "André 3000", "2023", "Experimental/Pop"));
        alb.add(new Album(3, 10, "Good Living Is Coming for You", "Album", "IDR 16,999.00", "Sweeping Promises", "2023", "Indie Rock"));
        alb.add(new Album(4, 10, "This Stupid World", "Album", "IDR 21,999.00", "Yo La Tengo", "2023", "Indie Rock"));
        alb.add(new Album(5, 10, "Oh Me Oh My", "Album", "IDR 24,999.00", "Lonnie Holley", "2023", "Experimental/Soul"));
        alb.add(new Album(6, 10, "Changing Channels", "Album", "IDR 26,999.00", "Pangaea", "2023", "Electronic/Techno"));
        alb.add(new Album(7, 10, "Own Battle", "Album", "IDR 5,999.00", "Pete Johns", "2020", "Pop/Rock"));
        alb.add(new Album(8, 10, "Roxanne", "Album", "IDR 6,999.00", "Arizona Zervas", "2020", "Hip-Hop/Rap"));
        alb.add(new Album(9, 10, "How to Make It in the New Music Business", "Album", "IDR 7,999.00", "Ari Herstand", "2020", "Pop/Rock"));
        alb.add(new Album(10, 10, "Zappa Plays Zappa", "Album", "IDR 14,999.00", "Dweezil Zappa", "2020", "Rock"));

        // Adding instruments to the inst ArrayList
        inst.add(new Instrument(1, 10, "Fender Stratocaster", "Instrument", "25,000,000.00", "Electric Guitar", "Fender"));
        inst.add(new Instrument(2, 10, "Yamaha F310", "Instrument", "3,500,000.00", "Acoustic Guitar", "Yamaha"));
        inst.add(new Instrument(3, 10, "Roland TD-17", "Instrument", "35,000,000.00", "Electronic Drum Kit", "Roland"));
        inst.add(new Instrument(4, 10, "Shure SM58", "Instrument", "1,500,000.00", "Microphone", "Shure"));
        inst.add(new Instrument(5, 10, "Korg Minilogue", "Instrument", "12,000,000.00", "Synthesizer", "Korg"));
        inst.add(new Instrument(6, 10, "Taylor GS Mini", "Instrument", "8,000,000.00", "Acoustic Guitar", "Taylor"));
        inst.add(new Instrument(7, 10, "Pearl Reference Pure", "Instrument", "20,000,000.00", "Drum Set", "Pearl"));
        inst.add(new Instrument(8, 10, "Sennheiser HD 280 Pro", "Instrument", "2,000,000.00", "Headphones", "Sennheiser"));
        inst.add(new Instrument(9, 10, "Akai MPC X", "Instrument", "18,000,000.00", "Music Production Controller", "Akai"));
        inst.add(new Instrument(10, 10, "Yamaha CVP-709", "Instrument", "30,000,000.00", "Digital Piano", "Yamaha"));


        Trademark();

        try {
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
                    String jenis_produk = "Album";
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
                    String jenis_produk = "Instrument";
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
                            System.out.println(" Edit Product ");
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
                            System.out.println(" Edit Product ");
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
    } catch (IOException e) {
        System.out.println("Error reading input: " + e.getMessage());
    }
    }



    public static void display() throws IOException {
        System.out.println("""
                Lihat data
                1. Album
                2. Instrument
                3. Overall Album Stock
                4. Overall Instrument Stock
                5. Search Album
                6. Search Instrument
                """);
        System.out.print("Menu :");
        String pilih = br.readLine();
        if ("1".equals(pilih)) {
            if (alb.size() < 1) {
                System.out.println("Data Empty");
            } else {
               int pos = 1;
               for (int i  = 0; i <alb.size();i++){
                System.out.println("Product - " + pos++);
                alb.get(i).displayData();
               }
            }

        } else if ("2".equals(pilih)) {
            if (inst.size() < 1) {
                System.out.println("Data Empty");
            } else {
                int pos = 1;
               for (int i  = 0; i <inst.size();i++){
                System.out.println("Product - " + pos++);
                inst.get(i).displayData();
               }
            }
        } else if ("3".equals(pilih)) {
            System.out.println("total stok :" + getTotalStok(alb));
        }else if ("4".equals(pilih)) {
            System.out.println("total stok :" + getTotalStok());
        }else if ("5".equals(pilih)){
            Search.Searching();
            System.out.print("Enter the name of the album you want to search: ");
            String albumName = br.readLine();
            for (Album album : alb) {
                album.SearchAlbum(albumName);
             }
        }else if ("6".equals(pilih)){
            Search.Searching();
            System.out.print("Enter the name of the instrument you want to search: ");
            String instrumentName = br.readLine();
            for (Instrument instrument : inst) {
                instrument.SearchInstrument(instrumentName);
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

     // implementasi final pada method
     public static final void Trademark(){
        System.out.println("========================");
        System.out.println("TEMPO TUNES MUSIC STORE");
        System.out.println("========================");
    }

    
}