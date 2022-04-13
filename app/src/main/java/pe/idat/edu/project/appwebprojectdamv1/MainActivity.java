package pe.idat.edu.project.appwebprojectdamv1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //
    EditText user, pass, repass;
    Button btning, btnreg;
    BDRide DB;


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
        DB = new BDRide(this);


        btnreg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String us = user.getText().toString();
                String pa = pass.getText().toString();
                String rpa = repass.getText().toString();

                if(us.equals("")||pa.equals("")||rpa.equals(""))
                    Toast.makeText(MainActivity.this, "Favor de insertar los datos", Toast.LENGTH_SHORT).show();
                else{
                    if(pa.equals(rpa)){
                        Boolean checkUser = DB.checkUsuario(us);
                        if(checkUser == false){
                            Boolean insert = DB.insertData(us,pa);
                            if(insert == true){
                                Toast.makeText(MainActivity.this, "Se registro con exito!!!", Toast.LENGTH_SHORT).show();
                            }else {
                                Toast.makeText(MainActivity.this, "Fallo en el registro", Toast.LENGTH_SHORT).show();
                            }
                        }
                        else {
                            Toast.makeText(MainActivity.this, "El usuario ya existe", Toast.LENGTH_SHORT).show();
                        }
                    }else {
                        Toast.makeText(MainActivity.this, "no coincide la contraseñas, intente otra vez", Toast.LENGTH_SHORT).show();

                    }
                }

            }
        });

        btning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(intent);

            }
        });



    }

}