import java.util.ArrayList;
public class Keranjang {
    ArrayList<Barang> keranjangBarang = new ArrayList<>();

    public void tambahKeranjang(String kode, ListBarang barang){
        for(Barang item : barang.listBarang){
            if(item.getIdBarang().startsWith(kode)){
                keranjangBarang.add(item);
            }
        }
    }

    public void isiKeranjang(){
        System.out.println("-----------------------------------------------");
        System.out.println("               ISI KERANJANG                   ");
        System.out.println("-----------------------------------------------");
        System.out.printf("%-10s %-25s %-10s\n", "KODE", "JENIS", "HARGA");
        for(Barang isi : keranjangBarang){
            isi.tampilkanBarang();
        }
    }
}
