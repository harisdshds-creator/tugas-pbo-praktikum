import java.util.ArrayList;

public class MainBank {
    public static void main(String[] args) {
        // Menggunakan polimorfisme dengan ArrayList bertipe PegawaiBank
        ArrayList<PegawaiBank> daftarPegawai = new ArrayList<>();

        // Menambahkan objek-objek subclass ke dalam list
        daftarPegawai.add(new Teller("TL01", "Budi Santoso", 4000000, 150));
        daftarPegawai.add(new CustomerService("CS01", "Siti Aminah", 4500000, 5));
        daftarPegawai.add(new ManajerBank("MJ01", "Andi Wijaya", 10000000, true));
        daftarPegawai.add(new Teller("TL02", "Rina Rose", 4000000, 80));
        daftarPegawai.add(new CustomerService("CS02", "Joko Anwar", 4500000, 4));

        System.out.println("========================================");
        System.out.println("      LAPORAN GAJI PEGAWAI BANK         ");
        System.out.println("========================================\n");

        double totalPengeluaranBank = 0;
        int countTeller = 0;
        int countCS = 0;
        int countManajer = 0;

        // Perulangan untuk mencetak laporan dan menghitung total pengeluaran
        for (PegawaiBank p : daftarPegawai) {
            p.cetakLaporan(); // VMI (Virtual Method Invocation)
            totalPengeluaranBank += p.hitungGaji();

            // Menggunakan operator instanceof untuk menghitung jumlah masing-masing jabatan
            if (p instanceof Teller) {
                countTeller++;
            } else if (p instanceof CustomerService) {
                countCS++;
            } else if (p instanceof ManajerBank) {
                countManajer++;
            }
        }

        // Menampilkan ringkasan bank
        System.out.println("\n========================================");
        System.out.println("             RINGKASAN BANK             ");
        System.out.println("========================================");
        System.out.println("Jumlah Teller           : " + countTeller + " orang");
        System.out.println("Jumlah Customer Service : " + countCS + " orang");
        System.out.println("Jumlah Manajer          : " + countManajer + " orang");
        System.out.println("Total Pengeluaran Gaji  : Rp " + totalPengeluaranBank);
        System.out.println("========================================");
    }
}