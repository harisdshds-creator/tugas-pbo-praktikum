public class ManajerBank extends PegawaiBank {
    private boolean targetTercapai;

    public ManajerBank(String id, String nama, double gajiPokok, boolean targetTercapai) {
        super(id, nama, gajiPokok);
        this.targetTercapai = targetTercapai;
    }

    @Override
    public double hitungGaji() {
        if (targetTercapai) {
            return gajiPokok + (gajiPokok * 0.20); // Tunjangan 20% jika true
        } else {
            return gajiPokok;
        }
    }
}