package praktikum.pbo;
import java.util.Scanner;

public class MainPerpus {
    static int pilihan = 0;
    static Scanner input = new Scanner(System.in);
    static ListBuku listBuku = new ListBuku();
    static BacaFile bacaFile = new BacaFile();

    public static int mainMenu() {
        System.out.println("Selamat datang di perpustakaan");
        System.out.println("Kami memiliki 7 kategori buku: ");
        System.out.println("1. Teknologi\n2. Filsafat\n3. Sejarah\n4. Agama\n5. Psikologi\n6. Politik\n7. Fiksi\n0. Keluar");
        System.out.print("Pilih kategori yang diinginkan : ");
        int pilihanMenu = input.nextInt();
        input.nextLine();
        return pilihanMenu;
    }

    public static void pilihanMenu() {
        System.out.println("Nama : Kamilia Luthfitah");
        System.out.println("NIM : 235150601111026");
        System.out.println("Kelas : PTI - C \n\n");
        System.out.println("Pilihan perpustakaan :");
        System.out.println("1. Tampilkan kategori buku\n2. Cek tingkat kesamaan\n3. Copy (cari) buku tertentu\n4. Input data buku baru (berdasarkan .txt)\n5. Simpan file (.txt)\n6. Hitung royalti buku (berdasaran ID)\n7. Keluar");
        System.out.print("Pilih Option: ");
        pilihan = input.nextInt();
        input.nextLine();
        switch (pilihan) {
            case 1:
                listBuku.berdasarkanKategori(mainMenu());
                break;
            case 2:
                listBuku.inputCekTingkatKesamaan();
                break;
            case 3:
                listBuku.cariBukuTertentu();
                break;
            case 4:
                bacaFile.bacaFile(listBuku, "DataBuku.txt");
                bacaFile.printAllBooks(listBuku);
                break;
            case 5:
                bacaFile.simpanFile(listBuku, "Perpus.txt");
                break;
            case 6:
                listBuku.inputHitungRoyalti();
                break;
            case 7:
                System.exit(0);
                break;
            default:
                System.out.println("Pilihan tidak tersedia");
        }
    }

    public static void main(String[] args) {
        listBuku.setInstanceSemuaBuku();
        pilihanMenu();
        pilihan = 0;
        listBuku.berdasarkanKategori(pilihan);

        pilihanMenu();
        pilihan = 0;
        listBuku.berdasarkanKategori(pilihan);
    }
}
