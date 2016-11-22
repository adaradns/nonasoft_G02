package com.app.nonasoft.grupo2_desarrollodesoftware.Activities;

import android.content.Context;
import android.graphics.Color;
<<<<<<< HEAD
import android.graphics.Typeface;
=======
>>>>>>> a750cbe73a94b14198f76895f838e894c7b222d6
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListAdapter;
import android.widget.ListAdapter;
import android.widget.TextView;

import com.app.nonasoft.grupo2_desarrollodesoftware.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yoel on 10/09/2016.
 */
public class AdaptadorAvanzado extends BaseExpandableListAdapter {
    Context contexto;
<<<<<<< HEAD
    static String[] padre_avanzado = {"CORREO ELECTRONICO", "CONFIGURACION AVANZADA","NAVEGAR POR INTERNET"};
=======
    static String[] padre_avanzado = {"Correo electronico", "Configuracion avanzada del celular","Navegar por internet"};
>>>>>>> a750cbe73a94b14198f76895f838e894c7b222d6

    static String[][] tutoriales_avanzado= {
            {"Gmail: Bandeja, envio, adjuntar","Hotmail: Bandeja, envio, adjuntar","Exchange: Bandeja, envio, adjuntar"},
            {"Control de datos moviles","Conexión compartida", "Configuracion antirrobo"},
            {"Engaño y paginas falsas", "Configurar buscador y pagina inicio", "Historial de navegación"}
    };

    static String[][] tutoriales_avanzado_generico = {
            {"avanzado_categoria1_tut1", "avanzado_categoria1_tut2", "avanzado_categoria1_tut3"},
            {"avanzado_categoria2_tut1", "avanzado_categoria2_tut2", "avanzado_categoria2_tut3"},
            {"avanzado_categoria3_tut1", "avanzado_categoria3_tut2", "avanzado_categoria3_tut3"}
    };

    private Typeface tf;

    public AdaptadorAvanzado(Context context){
        this.contexto = context;
        this.tf = Typeface.createFromAsset(context.getAssets(), "fonts/century-gothic.ttf");
    }

    @Override
    public int getGroupCount() {
        return padre_avanzado.length;
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return tutoriales_avanzado[groupPosition].length;
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
        tv.setText(padre_avanzado[groupPosition]);

        tv.setTypeface(tf);
        tv.setBackgroundColor(Color.parseColor("#974578"));
        tv.setTextColor(Color.parseColor("#ffffff"));

        return inflate;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        //Con esto "inflate" "heredo" la estructura del layout "list_item.xml"
        View inflate = View.inflate(contexto, R.layout.list_item, null);
        TextView tv = (TextView) inflate.findViewById(R.id.tvHijo);
        tv.setText(tutoriales_avanzado[groupPosition][childPosition]);

        tv.setBackgroundColor(Color.parseColor("#DD137B"));
        tv.setTextColor(Color.parseColor("#ffffff"));
        tv.setTypeface(tf);

        return inflate;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }
}