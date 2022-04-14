package pe.idat.edu.project.appwebprojectdamv1;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class BDRide extends SQLiteOpenHelper {

    public static final String DBNAME = "bd_ride.db";

    public BDRide (Context context) {super(context, "BDRide", null, 1);}

    @Override
    public void onCreate(SQLiteDatabase MyDB){
        MyDB.execSQL("create table usuarios(usuario TEXT primary key, contraseña TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase MyDB, int i, int i1){
        MyDB.execSQL("drop table if exists usuarios");
    }

    public Boolean insertData(String usuario, String contraseña){
        SQLiteDatabase MyDB = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("usuario", usuario);
        contentValues.put("contraseña", contraseña);
        long result = MyDB.insert("usuarios", null, contentValues);
        if(result==-1)return false;
        else
            return true;
    }

    public Boolean checkUsuario(String usuario){
        SQLiteDatabase MyDB = this.getWritableDatabase();
        Cursor cursor = MyDB.rawQuery("select * from usuarios where usuario = ?" , new String[]{usuario});
        if(cursor.getCount()>0)
            return true;
        else
            return false;
    }

    public Boolean checkUsuarioContraseña(String usuario, String contraseña ){
        SQLiteDatabase MyDB = this.getWritableDatabase();
        Cursor cursor = MyDB.rawQuery("select * from usuarios where usuario = ? and contraseña = ?", new String[]{usuario, contraseña});
        if(cursor.getCount()>0)
            return true;
        else
            return false;
    }
}
