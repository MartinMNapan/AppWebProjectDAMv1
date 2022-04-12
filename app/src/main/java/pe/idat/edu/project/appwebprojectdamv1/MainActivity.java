package pe.idat.edu.project.appwebprojectdamv1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    //
    EditText user, pass, repass;
    Button btning, btnreg;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Ingresar los parametros
        user = (EditText)findViewById(R.id.txtUsuario);
        pass = (EditText)findViewById(R.id.txtContraseña);
        repass = (EditText)findViewById(R.id.txtRContraseña);
        btning = (Button)findViewById(R.id.btnIngresar);
        btnreg = (Button)findViewById(R.id.btnRegistrar);

        btnreg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });



    }

}