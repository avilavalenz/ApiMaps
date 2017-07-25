package mx.com.tormex.petagram.apimaps;


import android.app.Activity;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by Sistemas on 25/07/2017.
 */

public class UbicacionAdaptador extends RecyclerView.Adapter<UbicacionAdaptador.UbicacionViewHolder> {

    ArrayList<Ubicacion> ubicaciones;
    Activity activity;

    public UbicacionAdaptador(ArrayList<Ubicacion> ubicaciones, Activity activity){
        this.ubicaciones = ubicaciones;
        this.activity = activity;
    }

    @Override
    public UbicacionViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_ubicacion, parent, false);
        return new UbicacionViewHolder(v);
    }

    @Override
    public void onBindViewHolder(UbicacionViewHolder ubicacionViewHolder, int position) {
        final Ubicacion ubicacion = ubicaciones.get(position);
        ubicacionViewHolder.imgFoto.setImageResource(ubicacion.getImagen());
        ubicacionViewHolder.tvNombreCV.setText(ubicacion.getNombre());

        ubicacionViewHolder.imgFoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(activity, MapsActivity.class);
                intent.putExtra("lat", ubicacion.getLat());
                intent.putExtra("lon", ubicacion.getLon());
                activity.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return ubicaciones.size();
    }

    public static class UbicacionViewHolder extends RecyclerView.ViewHolder{

        private ImageButton imgFoto;
        private TextView tvNombreCV;

        public UbicacionViewHolder(View itemView) {
            super(itemView);
            imgFoto = (ImageButton) itemView.findViewById(R.id.imgFoto);
            tvNombreCV = (TextView) itemView.findViewById(R.id.tvNombreCV);
        }
    }
}
