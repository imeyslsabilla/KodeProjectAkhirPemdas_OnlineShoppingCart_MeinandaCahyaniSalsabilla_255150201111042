import java.time.LocalDate;
import java.util.ArrayList;
public class Order {
    ArrayList<OrderItem> daftarCheckout = new ArrayList<>();
    public int totalBayar = 0;
    int idOrder = 0;

    public void checkoutBarang(String kode, ListBarang barang, int jumlah){
        for(Barang item : barang.listBarang){
            if(item.getIdBarang().startsWith(kode)){
                daftarCheckout.add(new OrderItem(item, jumlah));
            }
        }
    }

    public void isiCheckout(){
        idOrder++;
        System.out.println("\n=======================================================");
        System.out.println("                     STRUK CHECKOUT                    ");
        System.out.println("                    Id Order  :  00" + idOrder          );
        System.out.println("                    User : " + Login.userLogin);
        System.out.println("                       " + LocalDate.now() + "               ");
        System.out.println("=======================================================");
        System.out.printf("%-10s %-25s %-10s %-10s\n", "KODE", "JENIS", "HARGA", "BANYAK");
        System.out.println("-------------------------------------------------------");
        for(OrderItem checkout : daftarCheckout){
            checkout.showBarang();
        }
        System.out.println("=======================================================");
    }

    public int totalHarga(){
        int total = 0;
        for(OrderItem checkout : daftarCheckout){
            total += checkout.getItem().getHargaBarang()*checkout.getJumlah();
        }
        this.totalBayar = total;
        return totalBayar;
    }
}
