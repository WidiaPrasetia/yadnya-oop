package app;

public class User {
    int noUser;
    int telpon;
    int tanggalLahir;
    String email;
    String nama;
    String alamat;

    String membukaAplikasi() {
        return "Membuka aplikasi";
    }

    String melihatNotifikasi() {
        return "Ada notifikasi";
    }

    String login() {
        return "melakukan login";
    }

    String logout() {
        return "melakukan logout";
    }

}

