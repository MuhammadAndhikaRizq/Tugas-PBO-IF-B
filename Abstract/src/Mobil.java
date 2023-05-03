public class Mobil extends Klakson {

    public Mobil(String jenis)
    {
        super(jenis);
    }


    public void bunyi(){
        System.out.println(getJenis() + " " + "bersuara" + " " + "tintinttitntitin");
    }
}
