package praktikum.pbo;

public class PropertiBuku {

    private String namaBuku;
    private int tahun;
    private String penulis1;
    private String penulis2;
    private String sinopsis;
    private int id;
    private double hargaRoyalti;
    private int harga;

    //cetak melalui konstuctor
    public PropertiBuku(int id, String namaBuku, String penulis1, String penulis2, int tahun, String sinopsis) {
        this.id = id;
        this.namaBuku = namaBuku;
        this.penulis1 = penulis1;
        this.penulis2 = penulis2;
        this.tahun = tahun;
        this.sinopsis = sinopsis;
    }

    public PropertiBuku(String namaBuku, String penulis1, String penulis2, int tahun, String sinopsis) {
        this.namaBuku = namaBuku;
        this.penulis1 = penulis1;
        this.penulis2 = penulis2;
        this.tahun = tahun;
        this.sinopsis = sinopsis;
    }

    public void cetakPropertiBuku() {
        System.out.println("ID\t  : " + id);
        System.out.println("Judul\t  : " + namaBuku);
        System.out.println("Penulis 1 : " + penulis1);
        System.out.println("Penulis 2 : " + penulis2);
        System.out.println("Tahun\t  : " + tahun);
        System.out.println("Sinopsis  : " + sinopsis);
    }

    //khusus sinopsis, agar kode lebih mudah dibaca
    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public void cekJumlahKataSinopsis() {
        String[] kataPisah = sinopsis.split(" ");
        System.out.println("Jumlah kata sinopsis : " + kataPisah.length);
        System.out.println("");
    }

    public void hitungRoyalti(int harga, double persen) {
        this.harga = harga;
        hargaRoyalti = harga * (persen / 100);
    }

    public void hitungRoyalti(int harga) {
        this.harga = harga;
        hargaRoyalti = harga * 0.1;
    }

    public void cetakBiayaRoyalti() {
        System.out.println("Harga royalti : " + (int) hargaRoyalti + "\nTotal : " + ((int) hargaRoyalti + harga));
    }

    //metode getter
    public int getIdBuku() {
        return id;
    }

    //metode getter
    public String getNamaBuku() {
        return namaBuku;
    }

    public String getPenulis1() {
        return penulis1;
    }

    public String getPenulis2() {
        return penulis2;
    }

    public int getTahun() {
        return tahun;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public int getHarga() {
        return harga;
    }
}
