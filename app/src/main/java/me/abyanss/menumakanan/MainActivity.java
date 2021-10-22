package me.abyanss.menumakanan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<me.abyanss.menumakanan.Makanan> datamenu;
    GridLayoutManager gridLayoutManager;
    me.abyanss.menumakanan.MakananAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.rec_menu);

        addData();
        gridLayoutManager = new GridLayoutManager(this,1);
        recyclerView.setLayoutManager(gridLayoutManager);

        adapter = new me.abyanss.menumakanan.MakananAdapter(datamenu);
        recyclerView.setAdapter(adapter);
    }

    public void addData(){
        datamenu = new ArrayList<>();
        datamenu.add(new me.abyanss.menumakanan.Makanan("Ayam Geprek Sambal Bawang","FotoMakanan1","Rp.18.500","Ayam Geprek yang diberi sambal bawang, menu favorit sejuta umat (Pilih lvl 0-5)","Harga:   Rp.18.500",R.drawable.sambalbawang));
        datamenu.add(new me.abyanss.menumakanan.Makanan("Ayam Geprek BBQ","FotoMakanan2","Rp.21.000","Ayam mozzarella dicampur dengan BBQ sauce ala Geprek Zone. Mozarella dan BBQ merupakan kombinasi sedap, apalagi dipadukan dengan ayam yang crispy! (Pilih Lvl 0-5)","Harga:   Rp.21.000",R.drawable.geprekbbq));
        datamenu.add(new me.abyanss.menumakanan.Makanan("Ayam Geprek Red Smoky Mozza","FotoMakanan3","Rp.28.000","Ayam mozzarella dicampur dengan BBQ sauce ala Geprek Zone. Mozarella dan BBQ merupakan kombinasi sedap, apalagi dipadukan dengan ayam yang crispy! (Pilih Lvl 0-5)","Harga   Rp.28.000",R.drawable.smokymozza));
        datamenu.add(new me.abyanss.menumakanan.Makanan("Ayam Geprek Cheese Overload","FotoMakanan4","Rp.28.000","Ayam Mozzarella dicampur dengan cheese sauce ala Geprek Zone. Jadi luber-luber kejunya! (Pilih Lvl 0-5)","Harga   Rp.28.000",R.drawable.kejuoverload));
        datamenu.add(new me.abyanss.menumakanan.Makanan("Indomie Geprek Cheddar","FotoMakanan5","Rp.25.000","Kelezatan dari Indomie yang dipadukan dengan Ayam geprek sambal bawang ala Geprek Zone. Lezatnya sampai ke ubun-ubun! (Pilih Lvl 0-5)","Harga   Rp.25.000",R.drawable.indomiecheddar));
    }
}