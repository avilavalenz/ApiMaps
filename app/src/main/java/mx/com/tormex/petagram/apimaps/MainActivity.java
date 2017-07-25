package mx.com.tormex.petagram.apimaps;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Ubicacion> ubicaciones;
    private RecyclerView listaUbicaciones;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaUbicaciones = (RecyclerView) findViewById(R.id.rvUbicaciones);
        /*LinearLayoutManager lm = new LinearLayoutManager(this);
        lm.setOrientation(LinearLayoutManager.VERTICAL);*/
        GridLayoutManager lm = new GridLayoutManager(this,2);
        listaUbicaciones.setLayoutManager(lm);

        inicializarUbicaciones();
        inicializarAdaptador();
    }

    public void inicializarAdaptador() {
        UbicacionAdaptador adaptador = new UbicacionAdaptador(ubicaciones, this);
        listaUbicaciones.setAdapter(adaptador);
    }

    public void inicializarUbicaciones(){
        ubicaciones = new ArrayList<Ubicacion>();
        //001333
        ubicaciones.add(new Ubicacion(R.drawable.estadiorevolucion, "Estadio Revolución", 25.5388876, -103.4298688));
        ubicaciones.add(new Ubicacion(R.drawable.galeriaslaguna, "Galerías Laguna", 25.5813752, -103.40537264067056)); //-103.4067056
        ubicaciones.add(new Ubicacion(R.drawable.tsm, "Territorio Santos Modelo", 25.6276515,  -103.3798998)); //-103.3812328
        ubicaciones.add(new Ubicacion(R.drawable.cuatrocaminos, "Plaza Cuatro Caminos", 25.5597795,-103.4338259));//-103.4351589
        /**TSM * 25.6276515, -103.3812328
         * Galerias Laguna * 25.5813752, -103.4067056
         * Plaza cuatro caminos * 25.5597795, -103.4351589
         * Estadio Revolucion * 25.5388876, -103.4312018 */
    }
}