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

        if (lamaPinjam > 10) {
            System.out.println("Informasi: Buku harus segera dikembalikan!");
        }
    }

    void create() {
        System.out.println("SELEcT * FROM ANGGOTA");
    }

    void delete(int noAnggota) {
        System.out.println("DELETE FROM ANGGOTA WHERE noAnggota =" + noAnggota);
    }
}
