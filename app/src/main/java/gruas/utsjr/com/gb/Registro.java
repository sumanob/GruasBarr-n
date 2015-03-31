/*package gruas.utsjr.com.gb;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.sql.SQLException;


public class Registro extends ActionBarActivity {


    private EditText txtNombre, txtDuracion, txtGenero, txtProtagonista;
    private Button btnRegistrar, btnRegresar;
    private PeliculaDAO pdao;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        txtNombre= (EditText)findViewById(R.id.TxtNombre);
        txtDuracion= (EditText)findViewById(R.id.TxtDuracion);
        txtGenero= (EditText)findViewById(R.id.TxtGenero);
        txtProtagonista= (EditText)findViewById(R.id.TxtProtagonista);
        btnRegistrar=(Button)findViewById(R.id.BtnRegistrar);
        btnRegresar=(Button)findViewById(R.id.BtnRegresar);



        btnRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //declaramos un objeto de tipo contacto
                Pelicula p=new Pelicula();

                //asignamos los valosres de los cuadrso de texto a los atributos del objeto
                p.setNombre(txtNombre.getText().toString());
                p.setDuracion(txtDuracion.getText().toString());
                p.setGenero(txtGenero.getText().toString());
                p.setProtagonista(txtProtagonista.getText().toString());


                //inicializamos el dao y abrimos la conexion

                pdao=new PeliculaDAO(AgregarPeliculaActivity.this);
                try{
                    pdao.open();
                }catch (SQLException e){
                    e.printStackTrace();
                }


                //llamamos al metodo agregar contacto del DAO y generamos mensaje en consecuencia
                if(pdao.agregarContacto(p)){
                    mostarMensaje("Alta de pelicula","Pelicula registrado correctamente");
                }
                else{
                    mostarMensaje("Alta de pelicula","Pelicula no registrado");
                }


            }
        });
        btnRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AgregarPeliculaActivity.this.finish();
            }
        });

    }

    //metodo para generar el cuadro de dialogo con el mensaje
    private void mostarMensaje(String titulo,String mensaje){
        //declaramos e instanciamos el objeto AlertDialog
        AlertDialog.Builder builder=new AlertDialog.Builder(this);

        TextView lblMensaje=new TextView(this);
        builder.setTitle(titulo);
        lblMensaje.setText(mensaje);
        lblMensaje.setTextSize(20);
        lblMensaje.setGravity(Gravity.CENTER_HORIZONTAL);

        builder.setView(lblMensaje);

        builder.setCancelable(false);


        //agregamos boton al dialogo

        builder.setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();

                //bprramos contenido de los cuadros
                ((EditText)(findViewById(R.id.TxtNombre))).setText("");
                ((EditText)(findViewById(R.id.TxtDuracion))).setText("");
                ((EditText)(findViewById(R.id.TxtGenero))).setText("");
                ((EditText)(findViewById(R.id.TxtProtagonista))).setText("");

                //enviamos el cursor al primer cuadro
                ((EditText)(findViewById(R.id.TxtNombre))).requestFocus();
            }
        });

        builder.show();


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_agragar_pelicula, menu);
        return true;

    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}

*/