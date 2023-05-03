public class Main {
    public static void main(String[] args) {
      Dosen d = new Dosen("Pa Ichan", 11990011, "Pemrograman Berorientasi Objek");
      Mahasiswa m = new Mahasiswa("Andhika",  1217050087, "Teknik Informatika");

      d.mengajar();
      m.belajar();

   }
}
