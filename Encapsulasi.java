class Mahasiswi {

    private String nama;
    private String nim;
    private String umur;
    private double nilai;

    // Constructor

    public Mahasiswi (){
        this.nama = "Nizar Fadilah";
        this.nim = "2103010093";
        this.umur = "19";
        this.nilai = 9.9;

    }

    public String getnama(){
        return this.nama;

    }

}

public class Encapsulasi {
    public static void main(String[] args) {

        Mahasiswi object = new Mahasiswi();

        String namasiswi = object.getnama();
        
        System.out.println(namasiswi);

        
    }
}