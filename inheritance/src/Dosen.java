public class Dosen extends Kelas {
    private String mataKuliah;

    //Conctructor class turunan dari parrentnya, keyword super
    public Dosen(String nama, int no_unik, String mataKuliah) {
        super(nama, no_unik);
        this.mataKuliah = mataKuliah;
    }

    //Setter Getter
    public void setMataKuliah(String mataKuliah) {
        this.mataKuliah = mataKuliah;
    }

    public String getMataKuliah() {
        return mataKuliah;
    }

    //Method internal
    public void mengajar() {
        System.out.println(getNama() + " mengajar mata kuliah " + mataKuliah);
    }
}


