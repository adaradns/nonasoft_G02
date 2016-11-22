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
import android.content.res.AssetManager;
import com.app.nonasoft.grupo2_desarrollodesoftware.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yoel on 10/09/2016.
 */
public class AdaptadorIntermedio extends BaseExpandableListAdapter {
    Context contexto;
<<<<<<< HEAD
    static String[] padre_intermedio = {"APLICACIONES UTILES", "REDES SOCIALES", "USO DE REDES SOCIALES"};
=======
    static String[] padre_intermedio = {"redes sociales", "Musica/Radio", "Descarga de aplicaciones","aplicaciones utiles"    };
>>>>>>> a750cbe73a94b14198f76895f838e894c7b222d6

    static String[][] tutoriales_intermedio= {
            {"Google maps", "Notas", "Google fotos"},
            {"Loguear/crear cuenta de FaceBook", "Loguear/crear cuenta de Twitter","Loguear/crear cuenta de Instagram"},
            {"Funciones basicas del Facebook", "Funciones basicas del Twitter","Funciones basicas del Instagram"}
    };

    static String[][] tutoriales_intermedio_generico = {
            {"intermedio_categoria1_tut1", "intermedio_categoria1_tut2", "intermedio_categoria1_tut3"},
            {"intermedio_categoria2_tut1", "intermedio_categoria2_tut2", "intermedio_categoria2_tut3"},
            {"intermedio_categoria3_tut1", "intermedio_categoria3_tut2", "intermedio_categoria3_tut3"}
    };

    private Typeface tf;

    public AdaptadorIntermedio(Context context){
        this.contexto = context;
        this.tf = Typeface.createFromAsset(context.getAssets(), "fonts/century-gothic.ttf");
    }

    @Override
    public int getGroupCount() {
        return padre_intermedio.length;
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return tutoriales_intermedio[groupPosition].length;
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
        tv.setText(padre_intermedio[groupPosition]);

        tv.setBackgroundColor(Color.parseColor("#007CC3"));
        tv.setTextColor(Color.parseColor("#ffffff"));
        tv.setTypeface(tf);

        return inflate;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        //Con esto "inflate" "heredo" la estructura del layout "list_item.xml"
        View inflate = View.inflate(contexto, R.layout.list_item, null);
        TextView tv = (TextView) inflate.findViewById(R.id.tvHijo);
        tv.setText(tutoriales_intermedio[groupPosition][childPosition]);

        tv.setBackgroundColor(Color.parseColor("#4DB4BB"));
        tv.setTextColor(Color.parseColor("#ffffff"));
        tv.setTypeface(tf);

        return inflate;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }
}
