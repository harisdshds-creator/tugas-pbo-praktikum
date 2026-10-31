public class PegawaiBank {
    protected String id;
    protected String nama;
    protected double gajiPokok;

    public PegawaiBank(String id, String nama, double gajiPokok) {
        this.id = id;
        this.nama = nama;
        this.gajiPokok = gajiPokok;
    }

    public double hitungGaji() {
        return gajiPokok;
    }

    public void cetakLaporan() {
        System.out.println("ID         : " + id);
        System.out.println("Nama       : " + nama);
        System.out.println("Total Gaji : Rp " + hitungGaji());
        System.out.println("----------------------------------------");
    }
}