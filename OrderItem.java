public class OrderItem {
    private Barang item;
    private int jumlah;

    OrderItem(Barang item, int jumlah){
        this.item = item;
        this.jumlah = jumlah;
    }

    public Barang getItem(){
        return item;
    }
    public void setJumlah(int jumlah){
        this.jumlah = jumlah;
    }
    public int getJumlah(){
        return jumlah;
    }

    public void showBarang(){
        System.out.printf("%-10s %-25s Rp%-10d %-10d\n", item.getIdBarang(), item.getNamaBarang(), item.getHargaBarang(), jumlah);
    }
}
