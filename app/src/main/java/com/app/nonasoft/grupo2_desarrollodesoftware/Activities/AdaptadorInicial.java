package com.app.nonasoft.grupo2_desarrollodesoftware.Activities;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import com.app.nonasoft.grupo2_desarrollodesoftware.R;


/**
 * Created by Yoel on 10/09/2016.
 */
public class AdaptadorInicial extends BaseExpandableListAdapter{
    Context contexto;
    //CONTENIDO DEL NIVEL INICIAL
    //Definiendo las categorias
    static String[] padrea_inicial = {"CONFIGURACION / USO INICIAL", "MANEJO DE CONTACTOS",
            "GESTION DE LLAMADAS / SMS"};
    //Definiendo los tutoriales de cada categoria
    static String[][] tutoriales_inicial = {
            {"Loguear o crear cuenta Google", "Buscar y bajar aplicaciones", "Barra superior deslizante"},
            {"Agregar contacto", "Eliminar contacto", "Buscar contacto"},
            {"Realizar llamada", "Atender llamada", "Enviar SMS", "Ver registro"}
    };
    //Defiendo la estructura generica de los tutoriales
    //NOTA: Los tutoriales_inicial_generico y tutoriales_inicial deben ser identicos en tamaño
    //NOTA: la eleccion va a tomar el valor de tutoriales_inicial_generico
    static String[][] tutoriales_inicial_generico = {
            {"inicial_categoria1_tut1", "inicial_categoria1_tut2", "inicial_categoria1_tut3"},
            {"inicial_categoria2_tut1", "inicial_categoria2_tut2", "inicial_categoria2_tut3"},
            {"inicial_categoria3_tut1", "inicial_categoria3_tut2", "inicial_categoria3_tut3", "inicial_categoria3_tut4"}
    };

    private Typeface tf;

    private int punto;

    public AdaptadorInicial(Context context){
        this.contexto = context;
        this.tf = Typeface.createFromAsset(context.getAssets(), "fonts/century-gothic.ttf");
        this.punto = 0;
    }

    @Override
    public int getGroupCount() {
        return padrea_inicial.length;
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return tutoriales_inicial[groupPosition].length;
    }

    @Override
    public Object getGroup(int groupPosition) {
        return groupPosition;
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return null;
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return 0;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        //Con esto "inflate" "hereda" la estructura del layout "group_item.xml"
        View inflate = View.inflate(contexto, R.layout.list_group, null);
        TextView tv = (TextView) inflate.findViewById(R.id.tvPadre);
        tv.setText(padrea_inicial[groupPosition]);
        tv.setBackgroundColor(Color.parseColor("#FFCE5C9A"));
        tv.setTextColor(Color.parseColor("#ffffff"));
        tv.setTypeface(tf);

        switch (this.punto){
            case 1:
                tv.setBackgroundColor(Color.parseColor("#e35d19"));
                break;
            case 2:
                tv.setBackgroundColor(Color.parseColor("#D9D207"));
                break;
            case 3:
                this.punto = 0;
        }

        this.punto = this.punto + 1;
        Log.d("COLOR:", String.valueOf(punto));




        return inflate;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        //Con esto "inflate" "heredo" la estructura del layout "list_item.xml"
        View inflate = View.inflate(contexto, R.layout.list_item, null);
        TextView tv = (TextView) inflate.findViewById(R.id.tvHijo);
        tv.setText(tutoriales_inicial[groupPosition][childPosition]);

        tv.setBackgroundColor(Color.parseColor("#FFF500"));
        tv.setTextColor(Color.parseColor("#000000"));
        tv.setTypeface(tf);

        return inflate;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }
}

