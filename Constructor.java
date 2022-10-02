class Mahasiswa {

    String nama;
    String kelas;
    String nim;
    String prodi;

    // Constructor Code

    Mahasiswa (String Inputnama, String Inputkelas, String Inputnim, String Inputprodi) {

        nama = Inputnama;
        kelas = Inputkelas;
        nim = Inputnim;
        prodi = Inputprodi;

        System.out.println(nama);
        System.out.println(kelas);
        System.out.println(nim);
        System.out.println(prodi);

    }
    
   // Constructor END

    // Constructor Code END

}

public class Constructor {

    public static void main (String[] args ) {

        Mahasiswa datamahasiswa = new Mahasiswa("Nizar Fadilah", "Information D", "2211003322", "Information");
    }


}
