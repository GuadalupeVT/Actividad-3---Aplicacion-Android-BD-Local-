package com.example.bd_sqlite_basico;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import controlador.AlumnoDAO;
import modelo.Alumno;

public class ActivityAltas extends Activity {

    EditText txtnumControl, txtNombre, txtPrimerAp, txtSegundoAp, txtEdad, txtSemestre, txtCarrera;
    Button Agregar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_altas);
        Agregar = findViewById(R.id.btn_agregar);

        txtnumControl=findViewById(R.id.cajaId_alta);
        txtNombre=findViewById(R.id.cajaNombre_alta);
        txtPrimerAp=findViewById(R.id.cajaPrimerAp_alta);
        txtSegundoAp=findViewById(R.id.cajaSegundoAp_alta);
        txtEdad=findViewById(R.id.cajaEdad_alta);
        txtSemestre=findViewById(R.id.cajaSemestre_alta);
        txtCarrera=findViewById(R.id.cajacarrera_alta);
    }

    public void Onclick(View v){
        final AlumnoDAO aa = new AlumnoDAO(this);

        Alumno a = new Alumno();
        a.setNumControl(txtnumControl.getText().toString());
        a.setNombre(txtNombre.getText().toString());
        a.setPrimerAp(txtPrimerAp.getText().toString());
        a.setSegundoAp(txtSegundoAp.getText().toString());
        a.setEdad((Byte.valueOf(txtEdad.getText().toString())) );
        a.setSemestre(Byte.valueOf(txtSemestre.getText().toString()));
        a.setCarrera(txtCarrera.getText().toString());
        aa.agregarAlumno(a);
        Toast toast = Toast.makeText(ActivityAltas.this, aa.agregarAlumno(a)+" Se agrego Alumno", Toast.LENGTH_SHORT);
        toast.show();

    }
}
