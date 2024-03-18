package praktikum.pbo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BacaFile {

    public void simpanFile(ListBuku dataBuku, String fileName) {
        dataBuku.setInstanceSemuaBuku();
        PropertiBuku[] buku = dataBuku.getDataBuku();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (int i = 0; i < buku.length; i++) {
                writer.write("ID buku : " + buku[i].getIdBuku());
                writer.write("Nama Buku: " + buku[i].getNamaBuku());
                writer.newLine();
                writer.write("Penulis 1: " + buku[i].getPenulis1());
                writer.newLine();
                writer.write("Penulis 2: " + buku[i].getPenulis2());
                writer.newLine();
                writer.write("Tahun: " + buku[i].getTahun());
                writer.newLine();
                writer.write("Sinopsis: " + buku[i].getSinopsis());
                writer.newLine();
                writer.newLine();
            }

            System.out.println("Perpustakaan diupdate ke file  :" + fileName);
        } catch (IOException e) {
          e.printStackTrace();
        }
    }

    public void bacaFile(ListBuku dataBuku, String fileName) {
        PropertiBuku[] buku = dataBuku.getDataBuku();
        // Array ini tdk update dengan yang di ListBuku(berbeda inisiasi / alamat di memory
        // hanya mengcopy dan menambahkan data baru
        int index = 14;

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(";");
                // format : nama; penulis1; penulis2; tahun; sinopsis;
                int id = index;
                String namaBuku = parts[0].trim();
                String penulis1 = parts[1].trim();
                String penulis2 = parts[2].trim();
                int tahun = Integer.parseInt(parts[3].trim());
                String sinopsis = parts[4].trim();

                buku[id] = new PropertiBuku(id, namaBuku, penulis1, penulis2, tahun, sinopsis);
                index++;
            }
            
            System.out.println("Perpustakaan diupdate dengan file : " + fileName);
            System.out.println("Total buku dimasukkan: " + (index - 13));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void printAllBooks(ListBuku dataBuku) {
        PropertiBuku[] buku = dataBuku.getDataBuku();

        for (int i = 0; i < buku.length; i++) {
            System.out.println("ID buku: " + buku[i].getIdBuku());
            System.out.println("Nama Buku: " + buku[i].getNamaBuku());
            System.out.println("Penulis 1: " + buku[i].getPenulis1());
            System.out.println("Penulis 2: " + buku[i].getPenulis2());
            System.out.println("Tahun: " + buku[i].getTahun());
            System.out.println("Sinopsis: " + buku[i].getSinopsis());
            System.out.println();
        }
    }
}
