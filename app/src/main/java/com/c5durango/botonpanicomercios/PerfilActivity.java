package com.c5durango.botonpanicomercios;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class PerfilActivity extends AppCompatActivity {

    TextView txtNombreComercio;

    TextView txtNombreUsuario;
    TextView txtSexoUsuario;
    TextView txtTelMovil;
    TextView txtFechaNacimiento;
    TextView txtPadecimientos;
    TextView txtTipoSangre;
    TextView txtAlergias;

    TextView txtGiro;
    TextView txtTelFijo;
    TextView txtRazonSocial;
    TextView txtNumEmpleados;

    TextView txtCalleNumero;
    TextView txtColonia;
    TextView txtCPLocalidadMunicipio;
    TextView txtEntreCalles;
    TextView txtFachada;

    /*TextView txt;
    TextView txt;
    TextView txt;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);

        txtNombreComercio = findViewById(R.id.txtNombreComercio);

        txtNombreUsuario = findViewById(R.id.txtNombreUsuario);
        txtSexoUsuario = findViewById(R.id.txtSexoUsuario);
        txtTelMovil = findViewById(R.id.txtTelMovil);
        txtFechaNacimiento = findViewById(R.id.txtFechaNacimiento);
        txtPadecimientos = findViewById(R.id.txtPadecimientos);
        txtTipoSangre = findViewById(R.id.txtTipoSangre);
        txtAlergias = findViewById(R.id.txtAlergias);

        txtGiro = findViewById(R.id.txtGiro);
        txtTelFijo = findViewById(R.id.txtTelFijo);
        txtRazonSocial = findViewById(R.id.txtRazonSocial);
        txtNumEmpleados = findViewById(R.id.txtNumEmpleados);

        txtCalleNumero = findViewById(R.id.txtCalleNumero);
        txtColonia = findViewById(R.id.txtColonia);
        txtCPLocalidadMunicipio = findViewById(R.id.txtCPLocalidadMunicipio);
        txtEntreCalles = findViewById(R.id.txtCalle1y2);
        txtFachada = findViewById(R.id.txtFachada);

        SharedPreferences preferencesComercio = getSharedPreferences("Comercio", Context.MODE_PRIVATE);
        if (preferencesComercio.contains("id_comercio")){
            txtNombreComercio.setText(preferencesComercio.getString("nombre_comercio","X"));
            txtGiro.setText((preferencesComercio.getString("giro","X")).toUpperCase());
            txtTelFijo.setText((preferencesComercio.getString("telefono_fijo","X")).toUpperCase());
            txtRazonSocial.setText((preferencesComercio.getString("razon_social","X")).toUpperCase());
            txtNumEmpleados.setText(String.valueOf(preferencesComercio.getInt("num_empleados",999)) + " Empleados");
        } else {
            txtNombreComercio.setText("ID Comercio: 0");
        }

        SharedPreferences preferencesComercioDireccion = getSharedPreferences("ComercioDireccion", Context.MODE_PRIVATE);
        if (preferencesComercioDireccion.contains("id_dir_comercio")){
            txtCalleNumero.setText(
                    (preferencesComercioDireccion.getString("calle","X")).toUpperCase() + " #" +
                            (preferencesComercioDireccion.getString("numero","X")).toUpperCase());
            txtColonia.setText((preferencesComercioDireccion.getString("colonia","X")).toUpperCase());
            txtCPLocalidadMunicipio.setText(
                    (preferencesComercioDireccion.getString("nombre_localidad","X")).toUpperCase() + ", " +
                            (preferencesComercioDireccion.getString("nombre_municipio","X")).toUpperCase() +
                            " C.P. " + preferencesComercioDireccion.getInt("cp",00000));
            txtEntreCalles.setText( "ENTRE " +
                    (preferencesComercioDireccion.getString("entre_calle_1","X")).toUpperCase() + " Y " +
                    (preferencesComercioDireccion.getString("entre_calle_2","X")).toUpperCase() + ".");
            txtFachada.setText((preferencesComercioDireccion.getString("fachada","X")).toUpperCase());
        } else {
            txtSexoUsuario.setText("ID Direccion: 0");
        }

        SharedPreferences preferencesUsuario = getSharedPreferences("Usuario", Context.MODE_PRIVATE);
        if (preferencesUsuario.contains("id_usuarios_app")){
            txtNombreUsuario.setText(
                    (preferencesUsuario.getString("apell_pat","X")).toUpperCase() + " " +
                            (preferencesUsuario.getString("apell_mat","X")).toUpperCase() + " " +
                            (preferencesUsuario.getString("nombres_usuarios_app","X")).toUpperCase());
            String sexo = preferencesUsuario.getString("sexo_app","X");
            if(sexo.equals("F")){
                txtSexoUsuario.setText("FEMENINO");
            } else if (sexo.equals("M")){
                txtSexoUsuario.setText("MASCULINO");
            } else {
                txtSexoUsuario.setText("DESCONOCIDO");
            }


            txtTelMovil.setText(preferencesUsuario.getString("tel_movil","X"));
            txtFechaNacimiento.setText((preferencesUsuario.getString("fecha_nacimiento","X")).substring(0, 10));
            txtPadecimientos.setText("Padecimientos: " + (preferencesUsuario.getString("padecimientos","X")));
            txtTipoSangre.setText("Tipo sangre: " + (preferencesUsuario.getString("tipo_sangre","X")).toUpperCase());
            txtAlergias.setText("Alergias: " + (preferencesUsuario.getString("alergias","X")));
        } else {
            txtTelMovil.setText("ID Usuario: 0");
        }

    }
}

