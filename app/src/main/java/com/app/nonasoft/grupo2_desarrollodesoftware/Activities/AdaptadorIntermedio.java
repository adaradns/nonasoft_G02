package com.app.nonasoft.grupo2_desarrollodesoftware.Activities;

import android.content.Context;
import android.graphics.Color;
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
public class AdaptadorIntermedio extends BaseExpandableListAdapter {
    Context contexto;
    static String[] padre_intermedio = {"redes sociales", "Musica/Radio", "Descarga de aplicaciones","aplicaciones utiles"    };

    static String[][] tutoriales_intermedio= {
            {"Agregar tutorial"},
            {"Agregar tutoriales"},
            {"Agregar tutoriales"},
            {"Agregar tutoriales"}
    };

    public AdaptadorIntermedio(Context context){
        this.contexto = context;
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

        return inflate;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        //Con esto "inflate" "heredo" la estructura del layout "list_item.xml"
        View inflate = View.inflate(contexto, R.layout.list_item, null);
        TextView tv = (TextView) inflate.findViewById(R.id.tvHijo);
        tv.setText(tutoriales_intermedio[groupPosition][childPosition]);

        return inflate;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }
}
