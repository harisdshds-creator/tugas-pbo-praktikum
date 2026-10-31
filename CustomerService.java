public class CustomerService extends PegawaiBank {
    private int ratingKepuasan; // skala 1-5

    public CustomerService(String id, String nama, double gajiPokok, int ratingKepuasan) {
        super(id, nama, gajiPokok);
        this.ratingKepuasan = ratingKepuasan;
    }

    @Override
    public double hitungGaji() {
        return gajiPokok + (ratingKepuasan * 500000);
    }
}