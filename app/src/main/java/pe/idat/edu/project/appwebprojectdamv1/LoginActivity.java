package pe.idat.edu.project.appwebprojectdamv1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    //
    EditText usuario1, contraseña1;
    Button btnlogin, btnnuevo;
    BDRide bdRide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        //
        usuario1 = (EditText) findViewById(R.id.txtUser);
        contraseña1 = (EditText) findViewById(R.id.txtPass);
        btnlogin = (Button) findViewById(R.id.btnLogin);
        btnnuevo = (Button) findViewById(R.id.btnNuevoRegistrar);
        bdRide = new BDRide(this);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = usuario1.getText().toString();
                String pass = contraseña1.getText().toString();

                if(user.equals("")||pass.equals(""))
                    Toast.makeText(LoginActivity.this, "Favor de ingresar el usuario y contraseña", Toast.LENGTH_SHORT).show();
                else{
                    Boolean checkuserpass = bdRide.checkUsuarioContraseña(user,pass);
                    if(checkuserpass == true){
                        Toast.makeText(LoginActivity.this, "Ingreso satisfactorio", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(getApplicationContext(), MenuLateralActivity.class);
                        startActivity(intent);
                    }else {
                        Toast.makeText(LoginActivity.this, "Credenciales invalidos, Intente de nuevo", Toast.LENGTH_SHORT).show();
                    }
                }

            }
        });

        btnnuevo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });


    }
}