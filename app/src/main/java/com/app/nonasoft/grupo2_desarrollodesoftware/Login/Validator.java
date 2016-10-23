package com.app.nonasoft.grupo2_desarrollodesoftware.Login;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

import com.app.nonasoft.grupo2_desarrollodesoftware.R;

/**
 * Created by Adara on 10/22/2016.
 */
public abstract class Validator implements TextWatcher {
    private final EditText  pass, user;

    public Validator(EditText pass, EditText user) {
        this.pass = pass;
        this.user = user;
    }

    public abstract void validate( EditText pass, EditText user, String textUser, String textPass);

    @Override
    final public void afterTextChanged(Editable s) {
        String textUser = user.getText().toString();
        String textPass = pass.getText().toString();

        validate(user, pass, textUser, textPass);
    }



    @Override
    final public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

    @Override
    final public void onTextChanged(CharSequence s, int start, int before, int count) { }


}
