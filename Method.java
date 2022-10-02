class Mobil {

    int hargamobil = 1000;
    String CekHarga () {
        return ("Harga mobil ini adalah :" + hargamobil);
    }
}

public class Method {

    public static void main (String[] args ) {

        Mobil mobilnizar = new Mobil();
        String mobilpunyanizar = mobilnizar.CekHarga();

        System.out.println(mobilpunyanizar);

    }
}