public class Barang {
    private String idBarang;
    private String namaBarang;
    private int hargaBarang;
    Barang(String id, String nama, int harga){
        this.idBarang = id;
        this.namaBarang = nama;
        this.hargaBarang = harga;
    }

    public String getIdBarang(){
        return idBarang;
    }
    public String getNamaBarang(){
        return namaBarang;
    }
    public int getHargaBarang(){
        return hargaBarang;
    }

    public void tampilkanBarang(){
        System.out.printf("%-10s %-25s Rp%-10d\n", idBarang, namaBarang, hargaBarang);
    }

    // public void showBarang(){
    //     System.out.printf("%-10s %-25s Rp%-10d %-10d\n", idBarang, namaBarang, hargaBarang, jumlahBarang);
    // }
}