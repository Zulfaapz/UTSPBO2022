public class Main {
    public static void main(String[] args) throws Exception {
        Tendik karyawan1 = new Tendik(202,"Zulfaa Putri", "Banyumas","29-Maret-2003","Perempuan", 2015);
        karyawan1.display();
        karyawan1.waktuLembur(20);
        karyawan1.setUangLembur(0);
        karyawan1.displaygaji();
        System.out.println();
        System.out.println();

        Dosen dosen1 = new Dosen(303, "Az Zahra Putri", "Banyumas","20-Desember-2003" , "Laki-Laki", 2002);
        dosen1.setNomorIndukDosen(696969);
        dosen1.setJurusan("Teknik Kegempaan");
        dosen1.display();
        dosen1.displayDosen_Jurusan();
        dosen1.waktuLembur(6);
        dosen1.displaygaji();
    }
}
