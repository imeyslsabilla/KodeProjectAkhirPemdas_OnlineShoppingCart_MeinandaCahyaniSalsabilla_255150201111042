import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Login checkingLogin = new Login();
        do { 
            System.out.println("=================================");
            System.out.print("Enter Username : ");
            String nama = in.nextLine();
            System.out.print("Enter Password : ");
            String sandi = in.nextLine();
            System.out.println("=================================");

            if(checkingLogin.cekLogin(nama, sandi)){
                System.out.println("LOGIN BERHASIL !!!\n");
                break;
            }else{
                System.out.println("LOGIN GAGAL !!!\n");
            }
        } while (true);
        
        ListBarang barang = new ListBarang();
        Keranjang cart = new Keranjang();
        Order checkout = new Order();
        int pilihan, pilClothes, pilCekKer, pilCek, pilKer;
        do { 
            System.out.println("\n=================================");
            System.out.println("       FAZHION ONLINE SHOP       ");
            System.out.println("=================================");
            System.out.println("1. Clothes");
            System.out.println("2. Accessories");
            System.out.println("3. Make Up");
            System.out.println("4. Footwear");
            System.out.println("5. Checkout/Keranjang");
            System.out.println("6. Keluar");
            System.out.println("==================================");
            System.out.print("Masukkan Pilihan Anda : ");
            pilihan = in.nextInt();

            if(pilihan==1){
                System.out.println("\n=================================");
                System.out.println("            CLOTHES              ");
                System.out.println("=================================");
                System.out.println("1. Atasan");
                System.out.println("2. Bawahan");
                System.out.println("=================================");
                System.out.print("Masukkan Pilihan Anda : ");
                pilClothes = in.nextInt();
                if(pilClothes==1){
                    System.out.println("\n=================================");
                    System.out.println("             ATASAN              ");
                    System.out.println("=================================");

                    System.out.println("   \n-------------- KAOS --------------");
                    System.out.printf("%-10s %-25s %-10s\n", "KODE", "JENIS", "HARGA");
                    barang.tampilkanBarangbyKode1("CA", "Kaos");

                    System.out.println("\n    ------------ KEMEJA --------------");
                    System.out.printf("%-10s %-25s %-10s\n", "KODE", "JENIS", "HARGA");
                    barang.tampilkanBarangbyKode1("CA", "Kemeja");

                    System.out.println("\n    ------------ BLOUSE --------------");
                    System.out.printf("%-10s %-25s %-10s\n", "KODE", "JENIS", "HARGA");
                    barang.tampilkanBarangbyKode2("CA3");

                    System.out.println("\n    ------------ CARDIGAN --------------");
                    System.out.printf("%-10s %-25s %-10s\n", "KODE", "JENIS", "HARGA");
                    barang.tampilkanBarangbyKode2("CA4");

                    System.out.println("\n    ------------ HOODIE --------------");
                    System.out.printf("%-10s %-25s %-10s\n", "KODE", "JENIS", "HARGA");
                    barang.tampilkanBarangbyKode1("CA", "Hoodie");
                }else if(pilClothes==2){
                    System.out.println("\n=================================");
                    System.out.println("             BAWAHAN             ");
                    System.out.println("=================================");

                    System.out.println("\n    ------ CELANA PANJANG BAHAN ------");
                    System.out.printf("%-10s %-25s %-10s\n", "KODE", "JENIS", "HARGA");
                    barang.tampilkanBarangbyKode2("CB11");

                    System.out.println("\n    ------ CELANA PANJANG JEANS ------");
                    System.out.printf("%-10s %-25s %-10s\n", "KODE", "JENIS", "HARGA");
                    barang.tampilkanBarangbyKode2("CB12");

                    System.out.println("\n    --------- CELANA PENDEK ----------");
                    System.out.printf("%-10s %-25s %-10s\n", "KODE", "JENIS", "HARGA");
                    barang.tampilkanBarangbyKode1("CB2", "Celpen");

                    System.out.println("\n    -------------- ROK ----------------");
                    System.out.printf("%-10s %-25s %-10s\n", "KODE", "JENIS", "HARGA");
                    barang.tampilkanBarangbyKode1("CB3", "Rok");
                }
            }else if(pilihan==2){
                System.out.println("\n==================================");
                System.out.println("            ACCESSORIES           ");
                System.out.println("==================================");

                System.out.println("\n    ------------ KALUNG --------------");
                System.out.printf("%-10s %-25s %-10s\n", "KODE", "JENIS", "HARGA");
                barang.tampilkanBarangbyKode1("AK1", "Kalung");

                System.out.println("\n    ------------ ANTING --------------");
                System.out.printf("%-10s %-25s %-10s\n", "KODE", "JENIS", "HARGA");
                barang.tampilkanBarangbyKode1("AA2", "Anting");

                System.out.println("\n    ------------ GELANG --------------");
                System.out.printf("%-10s %-25s %-10s\n", "KODE", "JENIS", "HARGA");
                barang.tampilkanBarangbyKode2("AG3");

                System.out.println("\n    ------------ CINCIN --------------");
                System.out.printf("%-10s %-25s %-10s\n", "KODE", "JENIS", "HARGA");
                barang.tampilkanBarangbyKode1("AC4", "Cincin");
            }else if(pilihan==3){
                System.out.println("\n==================================");
                System.out.println("              MAKE UP             ");
                System.out.println("==================================");

                System.out.println("\n    ----------- FOUNDATION -----------");
                System.out.printf("%-10s %-25s %-10s\n", "KODE", "JENIS", "HARGA");
                barang.tampilkanBarangbyKode2("MF1");

                System.out.println("\n    ------------ BEDAK --------------");
                System.out.printf("%-10s %-25s %-10s\n", "KODE", "JENIS", "HARGA");
                barang.tampilkanBarangbyKode2("MB2");

                System.out.println("\n    ------------ LIPSTIK ------------");
                System.out.printf("%-10s %-25s %-10s\n", "KODE", "JENIS", "HARGA");
                barang.tampilkanBarangbyKode2("ML3");

                System.out.println("\n    ----------- BLUSH ON ------------");
                System.out.printf("%-10s %-25s %-10s\n", "KODE", "JENIS", "HARGA");
                barang.tampilkanBarangbyKode2("MB4");

                System.out.println("\n    ---------- EYE SHADOW -----------");
                System.out.printf("%-10s %-25s %-10s\n", "KODE", "JENIS", "HARGA");
                barang.tampilkanBarangbyKode2("ME5");
            }else if(pilihan==4){
                System.out.println("\n==================================");
                System.out.println("             FOOTWEAR             ");
                System.out.println("==================================");

                System.out.println("\n    ------------ SANDAL --------------");
                System.out.printf("%-10s %-25s %-10s\n", "KODE", "JENIS", "HARGA");
                barang.tampilkanBarangbyKode1("FS1", "Sandal");

                System.out.println("\n    ------------ SEPATU --------------");
                System.out.printf("%-10s %-25s %-10s\n", "KODE", "JENIS", "HARGA");
                barang.tampilkanBarangbyKode2("FS2");
            }else if(pilihan==5){
                System.out.println("\n==================================");
                System.out.println("       CHECKOUT/KERANJANG         ");
                System.out.println("==================================");
                System.out.println("1. Checkout Barang");
                System.out.println("2. Keranjang Barang");
                System.out.println("==================================");
                System.out.print("Masukkan Pilihan Anda : ");
                pilCekKer = in.nextInt();

                if(pilCekKer==1){
                    do { 
                        System.out.println("\n==================================");
                        System.out.println("             CHECKOUT             ");
                        System.out.println("==================================");
                        System.out.println("1. Checkout Langsung");
                        System.out.println("2. Checkout Keranjang");
                        System.out.println("3. Keluar");
                        System.out.println("==================================");
                        System.out.print("Masukkan Pilihan Anda : ");
                        pilCek = in.nextInt();
                        in.nextLine();

                        if(pilCek==1){
                            String alamat;
                            do { 
                                System.out.println("\n==================================");
                                System.out.println("             CHECKOUT             ");
                                System.out.println("==================================");
                                System.out.print("Masukkan Kode Barang : ");
                                String kode = in.nextLine();
                                System.out.print("Masukkan Jumlah Barang : ");
                                int jumlah = in.nextInt();
                                in.nextLine();
                                System.out.print("Masukkan Alamat : ");
                                alamat = in.nextLine();
                                System.out.println("==================================");
                                checkout.checkoutBarang(kode, barang, jumlah);
                                System.out.print("Checkout Barang (Y/N) ? : ");
                                String konfirmasi = in.nextLine();
                                if(konfirmasi.equals("Y")){
                                    break;
                                }else{
                                    System.out.print("");
                                }
                            } while (true);
                            System.out.println("\n==================================");
                            System.out.println("Total Bayar : Rp" + checkout.totalHarga());
                            System.out.print("Masukkan Uang Anda : Rp");
                            int uang = in.nextInt();
                            in.nextLine();
                            System.out.println("==================================");

                            if(uang<checkout.totalHarga()){
                                System.out.println("Uang tidak cukup !!!");
                                checkout.totalBayar = 0;
                                checkout.daftarCheckout.clear();
                            }else{
                                checkout.isiCheckout();
                                System.out.println("Total Bayar : Rp" + checkout.totalHarga());
                                System.out.println("Jumlah Uang : Rp" + uang);
                                System.out.println("Kembalian   : Rp" + (uang - checkout.totalHarga()));
                                System.out.println("=======================================================");
                                System.out.println("Alamat : " + alamat);
                                System.out.println("=======================================================");
                                checkout.totalBayar = 0;
                                checkout.daftarCheckout.clear();
                                break;
                            }
                        }else if(pilCek==2){
                            String alamat;
                            System.out.println("\n==================================");
                            System.out.println("             CHECKOUT             ");
                            System.out.println("==================================");
                            cart.isiKeranjang();
                            if(cart.keranjangBarang.isEmpty()){
                                System.out.println("\n            Keranjang Anda Kosong               ");
                                break;
                            }else{
                                System.out.println("\n==================================");
                                System.out.println("             CHECKOUT             ");
                                System.out.println("==================================");
                                cart.isiKeranjang();
                                do { 
                                    System.out.println("\n==================================");
                                    System.out.println("             CHECKOUT             ");
                                    System.out.println("==================================");
                                    System.out.print("Masukkan Ulang Kode Barang : ");
                                    String kode = in.nextLine();
                                    System.out.print("Masukkan Jumlah Barang : ");
                                    int jumlah = in.nextInt();
                                    in.nextLine();
                                    System.out.print("Masukkan Alamat : ");
                                    alamat = in.nextLine();
                                    System.out.println("==================================");
                                    checkout.checkoutBarang(kode, barang, jumlah);
                                    System.out.print("Checkout Barang (Y/N) ? : ");
                                    String konfirmasi = in.nextLine();
                                    if(konfirmasi.equals("Y")){
                                        break;
                                    }else{
                                        System.out.print("");
                                    }
                                } while (true);
                                System.out.println("\n==================================");
                                System.out.println("Total Bayar : Rp" + checkout.totalHarga());
                                System.out.print("Masukkan Uang Anda : Rp");
                                int uang = in.nextInt();
                                in.nextLine();
                                System.out.println("==================================");

                                if(uang<checkout.totalHarga()){
                                    System.out.println("Uang tidak cukup !!!");
                                    checkout.totalBayar = 0;
                                    checkout.daftarCheckout.clear();
                                }else{
                                    checkout.isiCheckout();
                                    System.out.println("Total Bayar : Rp" + checkout.totalHarga());
                                    System.out.println("Jumlah Uang : Rp" + uang);
                                    System.out.println("Kembalian   : Rp" + (uang - checkout.totalHarga()));
                                    System.out.println("=======================================================");
                                    System.out.println("Alamat : " + alamat);
                                    System.out.println("=======================================================");
                                    checkout.totalBayar = 0;
                                    checkout.daftarCheckout.clear();
                                    break;
                                }
                            }
                        }else{
                            System.out.print("");
                            break;
                        }
                    } while (true);
                }else if(pilCekKer==2){
                    do { 
                        System.out.println("\n==================================");
                        System.out.println("            KERANJANG             ");
                        System.out.println("==================================");
                        System.out.println("1. Tambahkan Item");
                        System.out.println("2. Tampilkan Isi Keranjang");
                        System.out.println("3. Keluar");
                        System.out.println("==================================");
                        System.out.print("Masukkan Pilihan Anda : ");
                        pilKer = in.nextInt();
                        in.nextLine();

                        if(pilKer==1){
                            do { 
                                System.out.println("\n==================================");
                                System.out.println("            KERANJANG             ");
                                System.out.println("==================================");
                                System.out.print("Masukkan Kode Barang : ");
                                String code = in.nextLine();
                                cart.tambahKeranjang(code, barang);
                                System.out.print("Tambahkan Item (Y/N) ? : ");
                                String confirm = in.nextLine();
                                if(confirm.equals("N")){
                                    break;
                                }else{
                                    System.out.print("");
                                }
                            } while (true);
                        }else if(pilKer==2){
                            System.out.println("\n==================================");
                            System.out.println("            KERANJANG             ");
                            System.out.println("==================================");
                            cart.isiKeranjang();
                        }else{
                            System.out.print("");
                            break;
                        }
                    } while (true);
                }
            }
        } while (pilihan!=6);

        System.out.println("\n=== TERIMA KASIH TELAH BERBELANJA ===\n");
    }
}
