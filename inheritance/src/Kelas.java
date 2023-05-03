public class Kelas {
    private String nama;
    private int no_unik;

    //Conctructor / method class itu sendiri
    public Kelas(String nama, int no_unik) {
        this.nama = nama;
        this.no_unik = no_unik;
    }

    //Encapsulate dengan method setter getternya
    //Setter untuk mensetting / mengedit dari nilai atribut dari luar
    //Getter untuk mengembalikan / passing nilai dari atribut
    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setNounik(int no_unik) {
        this.no_unik = no_unik;
    }

    public int getNounik() {
        return no_unik;
    }


}
