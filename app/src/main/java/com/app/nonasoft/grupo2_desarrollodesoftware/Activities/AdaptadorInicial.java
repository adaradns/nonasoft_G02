package com.app.nonasoft.grupo2_desarrollodesoftware.Activities;

import android.content.Context;
import android.graphics.Color;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import com.app.nonasoft.grupo2_desarrollodesoftware.Parsers.CategoriesGet;
import com.app.nonasoft.grupo2_desarrollodesoftware.R;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Yoel on 10/09/2016.
 */
public class AdaptadorInicial extends BaseExpandableListAdapter{
    Context contexto;
    //String[] padrea_inicial = {"getion de llamadas", "gestion de contactos", "galeria de imagenes", "mensajes de texto"};
    List<String> padrea_inicial = new ArrayList<String>();;

    static String[][] tutoriales_inicial = {
            {"Agregar contacto", "Eliminar contacto", "Buscar contacto"},
            {"Agregar tutoriales"},
            {"Agregar tutoriales"},
            {"Agregar tutoriales"},
            {"Agregar tutoriales"},
    };


    public AdaptadorInicial(Context context, List<String> listaCategoriaInicial){
        this.contexto = context;
        Log.d("MI ELEM: ", listaCategoriaInicial.get(0));
        for(int i = 0; i < listaCategoriaInicial.size(); i++){
            padrea_inicial.add(listaCategoriaInicial.get(i));
        }
    }

    @Override
    public int getGroupCount() {
        return padrea_inicial.size();
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
        tv.setText(padrea_inicial.get(groupPosition));

        return inflate;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        //Con esto "inflate" "heredo" la estructura del layout "list_item.xml"
        View inflate = View.inflate(contexto, R.layout.list_item, null);
        TextView tv = (TextView) inflate.findViewById(R.id.tvHijo);
        tv.setText(tutoriales_inicial[groupPosition][childPosition]);

        return inflate;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }
}

