package com.example.cdca1.apptdmobile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // UI References
    private TextView tv_registrarse;
    private TextView tv_iniciar_sesion;
    private TextView tv_ir_al_menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_registrarse = (TextView) findViewById(R.id.tv_registrarse);
        tv_iniciar_sesion= (TextView) findViewById(R.id.tv_iniciar_sesion);
        tv_ir_al_menu= (TextView) findViewById(R.id.tv_ir_al_menu);
    }

    public void goToLogin(View view) {
        Intent i = new Intent(this, login.class);
        startActivity(i);
    }
}
