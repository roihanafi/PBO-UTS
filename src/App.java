public class App {
    public static void main(String[] args) throws Exception {
        Tendik t1 = new Tendik("0001", "Fajar Nugros", "Umbulharjo, Banguntapan", "11 Oktober 2002", "Laki-Laki", 2018);
        t1.setJamLembur(20);
        System.out.println("Contoh Tendik");
        t1.cetak();

        Dosen d1 = new Dosen("0002", "Anang Sutrisno", "Sentolo, Kulonprogo", "23 April 2002", "Laki-laki", 2015,
                "Informatika", "2100018165");
        d1.setSksLebih(6);
        System.out.println("Contoh Dosen");
        d1.cetak();
    }
}
