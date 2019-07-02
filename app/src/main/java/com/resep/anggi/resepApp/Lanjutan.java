package com.resep.anggi.resepApp;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.resep.ilham.resepku.R;

public class Lanjutan extends AppCompatActivity {

    private TextView GetNama, GetBahan, GetCara;
    ImageView GetGambar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lanjutan);
        GetNama=findViewById(R.id.nama);
        GetBahan=findViewById(R.id.bahan);
        GetCara=findViewById(R.id.cara);
        GetGambar=findViewById(R.id.gambar);
        showData();
    }
    @SuppressLint("SetText")
    private void showData(){
        String menu= getIntent().getExtras().getString("Resep");
        switch (menu){
            case "Ayam Bakar":
                GetNama.setText("Ayam Bakar");
                GetGambar.setImageURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.drawable.ayambakar));
                GetBahan.setText("8 potong daging ayam\n" +
                        "1 buah jeruk nipis\n" +
                        "2 batang serai, memarkan\n" +
                        "8 lembar daun jeruk\n" +
                        "2 sdm Bango Kecap Manis\n" +
                        "½ sdm air asam jawa\n" +
                        "1 sdt garam\n" +
                        "½ sdt gula pasir\n" +
                        "½ sdt lada putih bubuk\n" +
                        "250 ml air\n" +
                        "2 sdm minyak sayur\n" +
                        "4 siung bawang putih, haluskan\n" +
                        "10 butir bawang merah, haluskan\n" +
                        "2 buah cabai merah keriting\n" +
                        "2 cm jahe\n" +
                        "2 cm lengkuas\n" +
                        "1 sdt garam");
                GetCara.setText("1 Lumuri ayam dengan air perasan jeruk nipis dan garam, lalu diamkan selama 15 menit.\n" +
                        "\n" +
                        "2 Panaskan minyak. Tumis bumbu halus, tambahkan daun jeruk dan serai hingga harum. Masukkan ayam, aduk sampai berubah warna.\n" +
                        "\n" +
                        "3 Tambahkan Kecap Manis Bango, lada putih bubuk, gula pasir, air dan asam jawa. Aduk merata, masak hingga matang dan bumbu meresap.\n" +
                        "\n" +
                        "4 Bakar ayam sambil sesekali dibalik dan diolesi bumbu hingga harum. Angkat dan hidangkan.");
                break;
            case "Ayam Goreng":
                GetNama.setText("Ayam Goreng");
                GetGambar.setImageURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.drawable.ayamgoreng));
                GetBahan.setText("8 potong daging ayam\n" +
                        "1 buah jeruk nipis\n" +
                        "2 batang serai, memarkan\n" +
                        "8 lembar daun jeruk\n" +
                        "1 sdt garam\n" +
                        "½ sdt gula pasir\n" +
                        "½ sdt lada putih bubuk\n" +
                        "250 ml air\n" +
                        "2 sdm minyak sayur\n" +
                        "4 siung bawang putih, haluskan\n" +
                        "10 butir bawang merah, haluskan\n" +
                        "2 buah cabai merah keriting\n" +
                        "1 sdt garam");
                GetCara.setText("1 Lumuri ayam dengan air perasan jeruk nipis dan garam, lalu diamkan selama 15 menit.\n" +
                        "\n" +
                        "2 Panaskan minyak. Tumis bumbu halus, tambahkan daun jeruk dan serai hingga harum. Masukkan ayam, aduk sampai berubah warna.\n" +
                        "\n" +
                        "3 Tambahkan lada putih bubuk, gula pasir, dan air. Aduk merata, masak hingga matang dan bumbu meresap.\n" +
                        "\n" +
                        "4 Goreng ayam sambil sesekali dibalik hingga harum dan bewarna keemasan. Angkat dan hidangkan.");
                break;
            case "Bebek Bakar":
                GetNama.setText("Bebek Bakar");
                GetGambar.setImageURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.drawable.bebekbakar));
                GetBahan.setText("8 potong daging bebek\n" +
                        "1 buah jeruk nipis\n" +
                        "2 batang serai, memarkan\n" +
                        "8 lembar daun jeruk\n" +
                        "2 sdm Bango Kecap Manis\n" +
                        "½ sdm air asam jawa\n" +
                        "1 sdt garam\n" +
                        "½ sdt gula pasir\n" +
                        "½ sdt lada putih bubuk\n" +
                        "250 ml air\n" +
                        "2 sdm minyak sayur\n" +
                        "4 siung bawang putih, haluskan\n" +
                        "10 butir bawang merah, haluskan\n" +
                        "2 buah cabai merah keriting\n" +
                        "2 cm jahe\n" +
                        "2 cm lengkuas\n" +
                        "1 sdt garam");
                GetCara.setText("1 Lumuri bebek dengan air perasan jeruk nipis dan garam, lalu diamkan selama 15 menit.\n" +
                        "\n" +
                        "2 Panaskan minyak. Tumis bumbu halus, tambahkan daun jeruk dan serai hingga harum. Masukkan bebek, aduk sampai berubah warna.\n" +
                        "\n" +
                        "3 Tambahkan Kecap Manis Bango, lada putih bubuk, gula pasir, air dan asam jawa. Aduk merata, masak hingga matang dan bumbu meresap.\n" +
                        "\n" +
                        "4 Bakar bebek sambil sesekali dibalik dan diolesi bumbu hingga harum. Angkat dan hidangkan.");
                break;
            case "Bebek Goreng":
                GetNama.setText("Bebek Goreng");
                GetGambar.setImageURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.drawable.bebekgoreng));
                GetBahan.setText("8 potong daging bebek\n" +
                        "1 buah jeruk nipis\n" +
                        "2 batang serai, memarkan\n" +
                        "8 lembar daun jeruk\n" +
                        "1 sdt garam\n" +
                        "½ sdt gula pasir\n" +
                        "½ sdt lada putih bubuk\n" +
                        "250 ml air\n" +
                        "2 sdm minyak sayur\n" +
                        "4 siung bawang putih, haluskan\n" +
                        "10 butir bawang merah, haluskan\n" +
                        "2 buah cabai merah keriting\n" +
                        "1 sdt garam");
                GetCara.setText("1 Lumuri bebek dengan air perasan jeruk nipis dan garam, lalu diamkan selama 15 menit.\n" +
                        "\n" +
                        "2 Panaskan minyak. Tumis bumbu halus, tambahkan daun jeruk dan serai hingga harum. Masukkan bebek, aduk sampai berubah warna.\n" +
                        "\n" +
                        "3 Tambahkan lada putih bubuk, gula pasir, dan air. Aduk merata, masak hingga matang dan bumbu meresap.\n" +
                        "\n" +
                        "4 Goreng bebek sambil sesekali dibalik hingga harum dan bewarna keemasan. Angkat dan hidangkan.");
                break;
            case "Nila Bakar":
                GetNama.setText("Nila Bakar");
                GetGambar.setImageURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.drawable.nilabakar));
                GetBahan.setText("4 ekor nila\n" +
                        "1 buah jeruk nipis\n" +
                        "2 batang serai, memarkan\n" +
                        "8 lembar daun jeruk\n" +
                        "2 sdm Bango Kecap Manis\n" +
                        "½ sdm air asam jawa\n" +
                        "1 sdt garam\n" +
                        "½ sdt gula pasir\n" +
                        "½ sdt lada putih bubuk\n" +
                        "250 ml air\n" +
                        "2 sdm minyak sayur\n" +
                        "4 siung bawang putih, haluskan\n" +
                        "10 butir bawang merah, haluskan\n" +
                        "2 buah cabai merah keriting\n" +
                        "2 cm jahe\n" +
                        "2 cm lengkuas\n" +
                        "1 sdt garam");
                GetCara.setText("1 Lumuri nila dengan air perasan jeruk nipis dan garam, lalu diamkan selama 15 menit.\n" +
                        "\n" +
                        "2 Panaskan minyak. Tumis bumbu halus, tambahkan daun jeruk dan serai hingga harum. Masukkan nila, aduk sampai berubah warna.\n" +
                        "\n" +
                        "3 Tambahkan Kecap Manis Bango, lada putih bubuk, gula pasir, air dan asam jawa. Aduk merata, masak hingga matang dan bumbu meresap.\n" +
                        "\n" +
                        "4 Bakar nila sambil sesekali dibalik dan diolesi bumbu hingga harum. Angkat dan hidangkan.");
                break;
            case "Nila Goreng":
                GetNama.setText("Nila Goreng");
                GetGambar.setImageURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.drawable.nilagoreng));
                GetBahan.setText("4 ekor nila\n" +
                        "1 buah jeruk nipis\n" +
                        "2 batang serai, memarkan\n" +
                        "8 lembar daun jeruk\n" +
                        "1 sdt garam\n" +
                        "½ sdt gula pasir\n" +
                        "½ sdt lada putih bubuk\n" +
                        "250 ml air\n" +
                        "2 sdm minyak sayur\n" +
                        "4 siung bawang putih, haluskan\n" +
                        "10 butir bawang merah, haluskan\n" +
                        "2 buah cabai merah keriting\n" +
                        "1 sdt garam");
                GetCara.setText("1 Lumuri nila dengan air perasan jeruk nipis dan garam, lalu diamkan selama 15 menit.\n" +
                        "\n" +
                        "2 Panaskan minyak. Tumis bumbu halus, tambahkan daun jeruk dan serai hingga harum. Masukkan nila, aduk sampai berubah warna.\n" +
                        "\n" +
                        "3 Tambahkan lada putih bubuk, gula pasir, dan air. Aduk merata, masak hingga matang dan bumbu meresap.\n" +
                        "\n" +
                        "4 Goreng nila sambil sesekali dibalik hingga harum dan bewarna keemasan. Angkat dan hidangkan.");
                break;
            case "Telur Dadar":
                GetNama.setText("Telur Dadar");
                GetGambar.setImageURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.drawable.telurdadar));
                GetBahan.setText("3 butir telur ayam\n" +
                        "1/2 sdt kaldu ayam bubuk\n" +
                        "1 sdt garam (sesuai selera)\n" +
                        "2 sdm tepung beras\n" +
                        "100 ml minyak sayur\n"+
                         "1 batang bawang prai/daun bawang\n"+
                        "1 batang daun seledri\n"+
                       " 1/2 bh bawang bombay\n"+
                       " 2 siung bawang putih\n"+
                        "1/2 lmbar daun kunyit\n"+
                "yang dihaluskan 5 cabe merah keriting, 2 siung bawang putih, 3 siung bawang merah");
                GetCara.setText("1. Iris bawang prai, daun seledri, bawang bombay, 2 siung bawang putih, dan daun kunyit.\n" +
                        "\n" +
                        "2. Haluskan cabe merah keriting, bawang merah, dan bawang putih.\n" +
                        "\n" +
                        "3. Pecahkan telur ke dalam wadah mangkok. Campurkan semua bahan yaitu kaldu bubuk, garam, tepung beras, irisan dedaunan, dan cabe yang telah dihaluskan. Kocok lepas sampai semua bahan tercampur rata. Jangan lupa dicicip ya untuk menyesuaikan selera.\n" +
                        "\n" +
                        "4. Panaskan minyak goreng, lalu masukkan secara perlahan adonan telur dadar dan masak dengan api kecil. Tunggu telur dadarnya masak, dan jangan lupa dibalik ya bun.");
                break;
            case "Telur Ceplok":
                GetNama.setText("Telur Ceplok");
                GetGambar.setImageURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.drawable.telurceplok));
                GetBahan.setText("1 Butir Telur\n"+ "Garam Secukupnya\n"+"Minyak");
                GetCara.setText("1 Panaskan Minyak\n"+"2 Pecahkan telur dan masukkan ke minyak panas\n"+
                        "3 Taburi dengan garam secukupnya lulu angkat dan hidangkan");
                break;
        }
    }
}
