public class Mahasiswa extends Kelas {
    private String jurusan;

    //Conctructor class turunan dari parrentnya, keyword super
    public Mahasiswa(String nama, int no_unik, String jurusan) {
        super(nama, no_unik);
        this.jurusan = jurusan;
    }


    //Setter Getter
    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public String getJurusan() {
        return jurusan;
    }

    //Method internal
    public void belajar() {
        System.out.println(getNama() + " sedang belajar di jurusan " + jurusan);
    }

}
