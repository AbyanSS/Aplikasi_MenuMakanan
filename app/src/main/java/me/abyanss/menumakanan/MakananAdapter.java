package me.abyanss.menumakanan;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class MakananAdapter extends RecyclerView.Adapter<MakananAdapter.DashBoardHolder> {

    private ArrayList<Makanan> listdata;

    public MakananAdapter(ArrayList<Makanan>listdata){
        this.listdata = listdata;
    }

    @NonNull
    @Override
    public DashBoardHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_menu, parent, false);
        DashBoardHolder holder = new DashBoardHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull DashBoardHolder holder, int position) {

        Makanan model = listdata.get(position);
        final Makanan getData = listdata.get(position);
        String Makanan = getData.getMakanan();
        String Profile = getData.getProfile();
        String Harga = getData.getHarga();

        holder.makanan.setText(Makanan);
        holder.profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(view.getRootView().getContext());
                View dialogView = LayoutInflater.from(view.getRootView().getContext()).inflate(R.layout.activity_deskprisi,null);
                de.hdodenhof.circleimageview.CircleImageView profile_img;
                TextView nama_makanan;
                TextView deskripsi;
                TextView deskripsiHarga;
                nama_makanan = dialogView.findViewById(R.id.nama_makanan);
                deskripsi = dialogView.findViewById(R.id.Deskripsi);
                deskripsiHarga = dialogView.findViewById(R.id.txtHarga);
                profile_img = dialogView.findViewById(R.id.diskripsi_img);
                profile_img.setImageResource(model.getProfilepopup());
                nama_makanan.setText(model.getMakanan());
                deskripsi.setText(model.getDeskripsi());
                deskripsiHarga.setText(model.getDeskripsiHarga());
                builder.setView(dialogView);
                builder.setCancelable(true);
                builder.show();
            }
        });
        if(Profile.equals("FotoMakanan1")){
            holder.profile.setImageResource(R.drawable.sambalbawang);
        }
        else if(Profile.equals("FotoMakanan2")){
            holder.profile.setImageResource(R.drawable.geprekbbq);
        }
        else if(Profile.equals("FotoMakanan3")){
            holder.profile.setImageResource(R.drawable.smokymozza);
        }
        else if(Profile.equals("FotoMakanan4")){
            holder.profile.setImageResource(R.drawable.kejuoverload);
        }
        else if(Profile.equals("FotoMakanan5")){
            holder.profile.setImageResource(R.drawable.indomiecheddar);
        }

        holder.harga.setText(Harga);
    }

    @Override
    public int getItemCount() {
        return listdata.size();
    }

    public class DashBoardHolder extends RecyclerView.ViewHolder {
        TextView makanan;
        ImageView profile;
        TextView harga;


        public DashBoardHolder(@NonNull View itemView) {
            super(itemView);

            profile = itemView.findViewById(R.id.imgFoto);

            makanan = itemView.findViewById(R.id.txtName);
            harga = itemView.findViewById(R.id.txtHarga);

        }
    }
}