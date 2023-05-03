abstract class Klakson {
    private String jenis;

    public Klakson(String jenis)
    {
        this.jenis = jenis;
    }

    public void setJenis(String jenis)
    {
        this.jenis = jenis;
    }

    public String getJenis()
    {
        return jenis;
    }

    //Method abstract
    public abstract void bunyi(); 
}
