public class Perpus {

    int noAnggota;
    String nama;
    String namaBuku;
    int lamaPinjam;

    void tampilkanData() {
        System.out.println("Nomor Anggota: " + noAnggota);
        System.out.println("Nama: " + nama);
        System.out.println("Nama Buku: " + namaBuku);
        System.out.println("Lama Pinjam: " + lamaPinjam + " hari");
    }

    void create() {
        System.out.println("SELEcT * FROM ANGGOTA");
    }

    void delete() {
        System.out.println("DELETE FROM ANGGOTA");
    }
}
