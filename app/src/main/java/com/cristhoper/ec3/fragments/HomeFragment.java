package com.cristhoper.ec3.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cristhoper.ec3.databinding.FragmentHomeBinding;
import com.cristhoper.ec3.model.Platillo2;
import com.cristhoper.ec3.model.Shows;

import java.util.ArrayList;
import java.util.List;


public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding=FragmentHomeBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        RVResumeAdapter adapter = new RVResumeAdapter(getData());
        binding.rvMoviesResume.setAdapter(adapter);
        LinearLayoutManager layoutManager = new LinearLayoutManager(view.getContext(),LinearLayoutManager.VERTICAL,false);
        binding.rvMoviesResume.setLayoutManager(layoutManager);
    }

    private List<Shows> getData(){
        List<Shows> shows=new ArrayList<>();
        shows.add(new Platillo2("Es un guiso, una preparación típica de la costa peruana hecha a base de gallina deshilachada, que con frecuencia se sustituye por pollo.","https://www.recetas-argentinas.com/base/stock/Recipe/61-image/61-image_web.jpg.webp","Aji de Gallina"));
        shows.add(new Platillo2(" Un delicioso arroz verde al culantro, cocinado con presas de pollo y verduras.","https://www.jamear.com/wp-content/uploads/2022/05/arrozconpollo-peruano.png","Arroz con Pollo"));
        shows.add(new Platillo2(" Un delicioso arroz verde al culantro, cocinado con presas de pollo y verduras.","https://www.todoenperu.net/recetas/wp-content/uploads/2019/07/cau-cau-1024x576.jpg","Cau Cau"));
        shows.add(new Platillo2("Saltado Estilo Oriental de Carne y Vegetales.","https://movistarplus.pe/wp-content/uploads/sites/3/2021/03/Nota-web-1.jpg","Lomo Saltado"));
        shows.add(new Platillo2("Sun guiso de origen árabe y se conoce desde tiempos de la Colonia, donde se le llamaban Seco Tajime, y se preparaba con carne de carnero.","https://comeperuano.b-cdn.net/wp-content/uploads/2022/09/receta-seco-de-cabrito.jpg.webp","Seco de Cabrito"));
        shows.add(new Platillo2("Es un filete, normalmente de carne vacuna, que se cocina frito o al horno.","https://www.196flavors.com/wp-content/uploads/2018/12/milanesa-4.jpg","Milanesa"));
        shows.add(new Platillo2("Su elaboración es con carne seca, carne fresca bien aliñada y plátano frito ","https://comidasperuanas.net/wp-content/uploads/2021/01/Seco-de-chavelo.webp","Seco Chavelo"));
        shows.add(new Platillo2("Piel de cerdo oreada y frita, de textura crujiente ","https://www.lugaresturisticosperu.com/wp-content/uploads/chicharron-de-chancho.jpg","Chicharron"));
        shows.add(new Platillo2("Guiso de carne rehogada y cocida en un recipiente bien tapado con agua u otro líquido al que se le añaden diversos ingredientes y especias, como papas, hongos, cebolla, pimentón","https://cdn2.cocinadelirante.com/sites/default/files/styles/gallerie/public/images/2019/09/estofado-de-res-con-papas.jpg","Estofado de Pollo"));
        shows.add(new Platillo2(" Es una receta casera por excelencia. Lleva un relleno jugoso a base de carne de res, frecuentemente con pasas","https://decomidaperuana.com/wp-content/uploads/2019/11/receta-de-arroz-tapado.jpg", "Arroz Tapado"));
        shows.add(new Platillo2("Un plato que consta de arroz, verduras, hojas de culantro, piezas de pato","https://www.comedera.com/wp-content/uploads/2022/05/Arroz-con-pato-peruano-shutterstock_1846729603.jpg","Arroz con Pato"));
        shows.add(new Platillo2("El sabroso y tan conocido escabeche es un método de conservación de los alimentos en vinagre.","https://comidasperuanas.pe/wp-content/uploads/2022/04/Pescado-en-Escabeche-768x650.jpg.webp","Escabeche"));
        shows.add(new Platillo2("Consiste en secar la carne cruda con el calor directo del sol, deshidratando la carne para su conservación.","https://www.receitasnestle.com.br/sites/default/files/styles/recipe_detail_desktop/public/srh_recipes/f9e17e1f1381514e243fdef38c553384.webp?itok=0t2jig83","Carne Seca"));
        shows.add(new Platillo2("Se trata de un plato marino a base de pequeñas láminas de pescado cuya preparación es muy similar a la del Cebiche","https://comidasperuanas.net/wp-content/uploads/2019/09/Tiradito.webp","Tiradito"));










        return shows;
    }
}