package praktikum.pbo;
import java.util.Scanner;
public class ListBuku {

    PropertiBuku[] buku = new PropertiBuku[100];

    public void berdasarkanKategori(int pilihanKategori) {
        switch (pilihanKategori) {
            case 1:
                System.out.println("\n=======================");
                System.out.println("Kategori : Teknologi\n");
                buku[0].cetakPropertiBuku();
                buku[0].cekJumlahKataSinopsis();
                buku[1].cetakPropertiBuku();
                buku[1].cekJumlahKataSinopsis();
                break;
            case 2:
                System.out.println("\n=======================");
                System.out.println("Kategori : Filsafat\n");
                buku[2].cetakPropertiBuku();
                buku[2].cekJumlahKataSinopsis();
                buku[3].cetakPropertiBuku();
                buku[3].cekJumlahKataSinopsis();
                break;
            case 3:
                System.out.println("\n=======================");
                System.out.println("Kategori : Sejarah\n");
                buku[4].cetakPropertiBuku();
                buku[4].cekJumlahKataSinopsis();
                buku[5].cetakPropertiBuku();
                buku[5].cekJumlahKataSinopsis();
                break;
            case 4:
                System.out.println("\n=======================");
                System.out.println("Kategori : Agama\n");
                buku[6].cetakPropertiBuku();
                buku[6].cekJumlahKataSinopsis();
                buku[7].cetakPropertiBuku();
                buku[7].cekJumlahKataSinopsis();
                break;
            case 5:
                System.out.println("\n=======================");
                System.out.println("Kategori : Psikologi\n");
                buku[8].cetakPropertiBuku();
                buku[8].cekJumlahKataSinopsis();
                buku[9].cetakPropertiBuku();
                buku[9].cekJumlahKataSinopsis();
                break;
            case 6:
                System.out.println("\n=======================");
                System.out.println("Kategori : Politik\n");
                buku[10].cetakPropertiBuku();
                buku[10].cekJumlahKataSinopsis();
                buku[11].cetakPropertiBuku();
                buku[11].cekJumlahKataSinopsis();
                break;
            case 7:
                System.out.println("\n=======================");
                System.out.println("Kategori : Fiksi\n");
                buku[12].cetakPropertiBuku();
                buku[12].cekJumlahKataSinopsis();
                buku[13].cetakPropertiBuku();
                buku[13].cekJumlahKataSinopsis();
                break;
            default:
                System.out.println("Kategori yang anda masukkan tidak tersedia");
                break;
        }
    }

    public void inputCekTingkatKesamaan() {
        Scanner input = new Scanner(System.in);

        System.out.println("Cari berdasarkan id buku");
        System.out.println("Bandingkan buku pertama dan buku kedua");

        System.out.println("ID buku pertama : ");
        int idBukuA = input.nextInt();
        input.nextLine();
        System.out.println("ID buku kedua : ");
        int idBukuB = input.nextInt();
        input.nextLine();

        System.out.println("Tingkat kesamaan : " + cekTingkatKesamaan(idBukuA, idBukuB));
    }

    public double cekTingkatKesamaan(int idBukuA, int idBukuB) {
        double poin = 0;
        if (buku[idBukuA].getNamaBuku().equals(buku[idBukuB].getNamaBuku() )) {
            poin += 1;
        }

        if (buku[idBukuA].getPenulis1().equals(buku[idBukuB].getPenulis1() )) {
            poin += 1;
        }

        if (buku[idBukuA].getPenulis2().equals(buku[idBukuB].getPenulis2() )) {
            poin += 1;
        }

        if (buku[idBukuA].getTahun() == (buku[idBukuB].getTahun())) {
            poin += 1;
        }

        if (buku[idBukuA].getSinopsis().equals((buku[idBukuB].getSinopsis()))) {
            poin += 1;
        }

        return poin / 5 * 100;
    }

    public void cariBukuTertentu() {
        Scanner input = new Scanner(System.in);

        System.out.println("Cari berdasarkan id buku");
        int bukuA = input.nextInt();
        input.nextLine();
        buku[bukuA].cetakPropertiBuku();
    }

    public void inputHitungRoyalti() {
        Scanner input = new Scanner(System.in);

        System.out.println("\nHitung royalti buku");
        System.out.println("Pilih buku (berdasarkan id)");
        
        int id = input.nextInt();
        input.nextLine();
        buku[id].cetakPropertiBuku();

        System.out.println("1. Berdasarkan penjualan bulan ini\n2. Berdasarkan persentase");
        int pilihan = input.nextInt();
        input.nextLine();

        switch (pilihan) {
            case 1:
                System.out.print("Masukkan harga buku : ");

                buku[id].hitungRoyalti(input.nextInt());
                buku[id].cetakBiayaRoyalti();
                break;
            case 2:
                System.out.print("Masukkan harga buku :");
                int harga = input.nextInt();
                System.out.print("Masukkan persen :");
                double persen = input.nextDouble();
                buku[id].hitungRoyalti(harga, persen);
                buku[id].cetakBiayaRoyalti();
                break;
            default:
                System.out.println("Pilihan tidak tersedia");
                break;
        }
    }

    public PropertiBuku[] getDataBuku() {
        return buku;
    }

    public void setInstanceSemuaBuku() {
        buku[0] = new PropertiBuku(0, "The Innovator's Dilemma", "Clayton M. Christensen", "-", 1997, "");
        buku[0].setSinopsis("Sinopsis buku berbicara mengenai bagaimana perusahaan-perusahaan yang berhasil di pasar dapat terbangun di atas teknologi yang tidak dapat menjamin keberlanjutan mereka.");
        buku[1] = new PropertiBuku(1, "Memahami e-learning: Konsep, Teknologi, dan Arah Perkembangan", "Muhammad Rusli", "Dadang Hermawan", 2006, "");
        buku[1].setSinopsis("Sinopsis buku berbicara mengenai konsep, teknologi, dan arah perkembangan e-learning, serta menjelaskan bagaimana teknologi ini membantu masyarakat dalam berkomunikasi dan mendapatkan informasi.");

        buku[2] = new PropertiBuku(2, "Filsafat Dunia Sophie", "Jostein Gaarder", "-", 1991, "");
        buku[2].setSinopsis("Sinopsis buku berbicara mengenai sebuah novel yang mempunyai ketebalan halaman sebanyak 800 lembar, yang dapat menjadi pengantar bagi para sarjana muda yang sedang menimba ilmu dalam jurusan filsafat.");
        buku[3] = new PropertiBuku(3, "Filsafat Umum", "Muzairi, M. Ag", "-", 2015, "");
        buku[3].setSinopsis("Sinopsis buku berbicara mengenai sejarah singkat kelahiran filsafat, yang diterangkan melalui beberapa pemikiran para tokoh yang diharapkan para mahasiswa dapat membandingkan.");

        buku[4] = new PropertiBuku(4, "Sejarah Lengkap Indonesia", "Adi Sudirman", "-", 2014, "");
        buku[4].setSinopsis("Sinopsis buku berbicara mengenai sejarah Indonesia sejak era prasejarah, era prakolanial, era kolonial, era kemerdekaan awal, era orde baru, hingga era reformasi.");
        buku[5] = new PropertiBuku(5, "Bangkitnya Nasionalisme Indonesia", "Akira Nagazumi", "-", 2004, "");
        buku[5].setSinopsis("Sinopsis buku berbicara mengenai sejarah nasionalisme Indonesia dan bagaimana ia berpengaruh pada perkembangan sejarah negara ini.");

        buku[6] = new PropertiBuku(6, "Sejarah Islam: Sejarah, Agama, dan Politik", "Tamara Sonn", "-", 2015, "");
        buku[6].setSinopsis("Sinopsis buku berbicara mengenai sejarah Islam, perkembangan historisnya, dan pergulatan masyarakat Muslim kontemporer.");
        buku[7] = new PropertiBuku(7, "Islam: History, Religion, and Politics", "Brian Catlos", "-", 2009, "");
        buku[7].setSinopsis("Sinopsis buku berbicara mengenai sejarah agama Islam, perkembangan historisnya, dan pergulatan masyarakat Muslim kontemporer.");

        buku[8] = new PropertiBuku(8, "Psychology: A Brief Introduction", "James W. Kalat", "-", 2012, "");
        buku[8].setSinopsis("Sinopsis buku berbicara mengenai pendahuluan tentang psikologi, yang menjelaskan tentang pendekatan psikologi, teori-teori psikologi, dan konsep-konsep utama dalam psikologi.");
        buku[9] = new PropertiBuku(9, "The Psychology of Human Behavior", "Paul Bloom", "-", 2018, "");
        buku[9].setSinopsis("Sinopsis buku berbicara mengenai perilaku manusia, yang menjelaskan tentang perilaku yang dapat dikategorikan sebagai kesadaran, perilaku yang dapat dikategorikan sebagai perilaku, dan perilaku yang dapat dikategorikan sebagai perilaku.");

        buku[10] = new PropertiBuku(10, "Manipulating the Masses: A Handbook on Propaganda for the 21st Century", "William S. Lin", "-", 2008, "");
        buku[10].setSinopsis("Sinopsis buku berbicara mengenai bagaimana propaganda dapat digunakan untuk memanipulasi massa dan mengubah pandangan masyarakat.");
        buku[11] = new PropertiBuku(11, "The Origins of Political Order: From Prehuman Times to the French Revolution", "Francis Fukuyama", "-", 2011, "");
        buku[11].setSinopsis("Sinopsis buku berbicara mengenai sejarah politik, yang menjelaskan tentang perkembangan politik dari zaman prasejarah hingga era revolusi.");

        buku[12] = new PropertiBuku(12, "Hujan", "Tere Liye", "-", 2018, "");
        buku[12].setSinopsis("Hujan Tere Liye adalah novel yang menceritakan tentang Esok dan Lail, dua karakter utama yang berdua tinggal di pengungsian setelah bencana gunung meletus dan gempa bumi.");
        buku[13] = new PropertiBuku(13, "Laskar Pelangi", "Andrea Hirata", "-", 2005, "");
        buku[13].setSinopsis("Laskar Pelangi adalah novel yang menceritakan tentang kehidupan 10 anak hebat yang memiliki semangat juang untuk tetap bersekolah di kampung Gantung, Kepulauan Bangka Belitung.");
    }
}
