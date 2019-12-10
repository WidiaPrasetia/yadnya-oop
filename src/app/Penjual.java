package app;

public class Penjual extends User{
    int noPenjual;
    int rekeningToko;
    int telponToko;
    String namaToko;
    String produk;
    String emailToko;

    String uploadBarang() {
        return "melakukan upload barang";
    }

    String menjualBarang() {
        return " menjual barang";
    }

    String menambahBarang() {
        return " menambah barang";
    }

    String updateStockBarang() {
        return " melakukan update stock barang";
    }

    String menerimaPembayaran() {
        return " menerima pembayaran barang";
    }

    String mengirimBarang() {
        return " melakukan pengiriman barang";
    }

    String menerimaOrder() {
        return " menrima order barang / produk";
    }

}