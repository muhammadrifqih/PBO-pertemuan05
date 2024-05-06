public class Aksi {
    public static void main(String[] args) {
        Perpus rifqi = new Perpus();
        Perpus hidayat = new Perpus();
        rifqi.noAnggota = 12345;
        rifqi.nama = "Rifqi";
        rifqi.namaBuku = "Java Programming";
        rifqi.lamaPinjam = 14;

        rifqi.tampilkanData();
        hidayat.tampilkanData();
    }
}
