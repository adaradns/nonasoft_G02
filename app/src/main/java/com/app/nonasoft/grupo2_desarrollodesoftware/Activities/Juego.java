package com.app.nonasoft.grupo2_desarrollodesoftware.Activities;

<<<<<<< HEAD
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.CountDownTimer;
=======
import android.content.Intent;
import android.graphics.Color;
<<<<<<< HEAD
import android.graphics.Typeface;
import android.os.Bundle;
>>>>>>> 96755b89d81283293e2ad2ac2f8d2072f0d08b35
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
<<<<<<< HEAD
=======
=======
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
>>>>>>> a750cbe73a94b14198f76895f838e894c7b222d6
>>>>>>> 96755b89d81283293e2ad2ac2f8d2072f0d08b35
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.app.nonasoft.grupo2_desarrollodesoftware.R;

/**
 * Created by Adara on 11/18/2016.
 */
public class Juego extends AppCompatActivity {

<<<<<<< HEAD
    Context context;
    SharedPreferences logros;

=======
>>>>>>> 96755b89d81283293e2ad2ac2f8d2072f0d08b35
    private TextView pregunta;

    private Button btnOpcion_1;
    private Button btnOpcion_2;
    private Button btnOpcion_3;
    private Button btnOpcion_4;

<<<<<<< HEAD
=======
<<<<<<< HEAD
    private TextView txtPuntaje;

>>>>>>> 96755b89d81283293e2ad2ac2f8d2072f0d08b35
    private String election;

    private Toolbar toolbar;

    private boolean isButtonClicked = false;
<<<<<<< HEAD
    private ImageView imgResultado;
    private ImageView imageLogro;


    public int intPuntaje;
    public TextView txtPuntaje;
    public int preguntaNumero = 0;

    public int puedoPulsarRespuesta = 1;



    //LISTA DE CONTENIDO PARA LOS MINIJUEGOS
    //NOTA: solo puede haber 3 preguntas y 4 opciones para ellas
        //para el btnInicial1
            //preguntas
    static String[] preguntasInicial1 = {"¿Cuál de las siguientes cuentas pertenece a Google?", "¿Cómo se llama la tienda de aplicaciones de Android?", "¿Cuál de las siguientes funciones NO se encuentran en la barra superior del celular?"};
            //opciones
            //Orden de respuestas correctas: [3],[2],[0]
    static String[][] opcionesInicial1 = {
                    {"Hotmail", "Facebook", "Whatsapp", "Gmail"},
                    {"Spotify", "AppStore", "PlayStore", "Youtube"},
                    {"Calculadora", "Ubicación/GPS", "Notificaciones", "Brillo de pantalla"}
            };
        //para el btnInicial2
           //preguntas
    static String[] preguntasInicial2 = {"Según los datos de contacto a cargar ¿Cuáles de estos consideras más importantes?", "Cuando eliminas un contacto ¿Qué datos se borran?", "¿Hasta cuantos contactos podemos cargar en el celular?"};
            //opciones
            //Orden de respuestas correctas: [2],[3],[2]
    static String[][] opcionesInicial2 = {
            {"Correo/Apellido", "Nombre/Dirección", "Nombre/Número", "Dirección/Número"},
            {"El número", "El nombre", "La dirección", "Todo"},
            {"20", "1000", "Infinitos", "200"}
    };
         //para el btnInicial3
         //preguntas
    static String[] preguntasInicial3 = {"¿De cuanto es el límite que puede guardar el registro de llamadas?", "¿Qué datos necesitamos para enviar un SMS?", "Cuando realizamos una llamada ¿Cuál de estas opciones no podemos realizar?"};
         //opciones
         //Orden de respuestas correctas: [2],[0],[3]
    static String[][] opcionesInicial3 = {
            {"28 Números y mensajes", "50 Números y mensajes", "Infinitos", "499 Números y mensajes"},
            {"El número de celular", "El nombre y apellido del contacto", "El permiso de su madre", "El correo electrónico"},
            {"Silenciar micrófono", "Poner en Altavoz", "Cortar antes", "Realizar Videollamada"}
    };

        //para el btnIntermedio1
            //preguntas
    static String[] preguntasIntermedio1 = {"¿Que función es necesaria para el Google Maps?", "¿Cual de las siguientes funciones NO posee la aplicación NOTAS?", "Google photos ¿Con que cuenta la podemos sincronizar?"};
            //opciones
            // Orden de respuestas correctas: [2],[2],[0]
    static String[][] opcionesIntermedio1 = {
            {"Wi-fi", "Bluetooth/Datos móviles", "Ubicación/Datos móviles", "Modo Avión"},
            {"Cargar imagen", "Grabar audio", "Calcular", "Dibujar"},
            {"Gmail", "FaceBook", "Instagram", "Photoshop"}
    };
        //para el btnIntermedio2
            //preguntas
    static String[] preguntasIntermedio2 = {"¿Cuál es la aplicación nativa de mensajería para Facebook?", "¿Cual de las siguientes es la Red Social más utilizada?", "¿Cual de las siguientes funciones no tiene Instagram?"};
            //opciones
            //Orden de respuestas correctas: [0],[1],[0]
    static String[][] opcionesIntermedio2 = {
            {"Mensseger", "Whatsapp", "No tiene", "Maps"},
            {"Twitter", "Facebook", "Instagram", "Google+"},
            {"Estados", "Fotos", "Videos", "Chat"}
    };
        //para el btnIntermedio3
            //preguntas
    static String[] preguntasIntermedio3 = {"¿Cual de las siguientes funciones destaca a Facebook?", "¿Cual de las siguientes funciones destaca a Twitter?", "pregunta 3"};
            //opciones
            //Orden de respuestas correctas: [3],[2],[3]
    static String[][] opcionesIntermedio3 = {
            {"Comentar", "Compartir", "Agregar amigos", "Me gusta"},
            {"Gif", "Compartir", "Twett", "Publicar"},
            {"opcion1 e", "opcion2 f", "opcion3 g", "opcion4 h"}
    };


        //para el btnAvanzado1
            //preguntas
    static String[] preguntasAvanzado1 = {"¿Que puedo hacer en Youtube?", "¿Que es whatsapp?", "¿Que NO puedo hacer en whatsapp?"};
            //opciones
            // Orden de respuestas correctas: [3],[1],[2]
    static String[][] opcionesAvanzado1 = {
            {"Publicar fotos", "Chatear", "Jugar", "Mirar videos"},
            {"Una red social", "Una aplicacion para comunicarse", "Aplicacion de entretenimiento", "Aplicacion para musica"},
            {"Enviar audios", "Realizar llamadas", "Dar me gusta", "Enviar mensajes"}
    };
        //para el btnAvanzado2
            //preguntas
    static String[] preguntasAvanzado2 = {"¿Para que sirve la conexion compartida?", "¿Que es la configuracion antirobos?", "¿Que te demuestra la barra color naranja en el grafico de consumo de datos moviles?"};
            //opciones
            //Orden de respuestas correctas: [0],[2],[3]
    static String[][] opcionesAvanzado2 = {
            {"Para compartir internet", "Para compartir fotos", "No existe", "Para usar internet"},
            {"Para no perder el celular", "Por si me lo roban saber localizarlo", "Por seguridad", "Todas son correctas"},
            {"El limite de bloqueo", "Los datos alcanzados", "Los datos que ya utilizaste", "Todas son correctas"}
    };
        //para el btnIntermedio3
            //preguntas
    static String[] preguntasAvanzado3 = {"¿Por que no creer cuando salta un cartel diciendo que gane 1.000.000 de pesos?", "¿Que buscador predeterminado viene en el motor de busqueda de Google Chrome?", "¿Que aparece en el historial de navegacion?"};
            //opciones
            //Orden de respuestas correctas: [3],[2],[0]
    static String[][] opcionesAvanzado3 = {
            {"Debemos creerlo, es verdad", "Es solo un juego", "Nunca me paso", "Son virus"},
            {"Ask", "Yahoo", "Google", "Bing"},
            {"Todas las paginas que visito", "Nada", "Configuraciones de google", "Datos del navegador"}
    };
=======
    private ImageView imgCorrecto;
    private ImageView imgIncorrecto;
=======
    private String election;



    private boolean isButtonClicked = false;
    private ImageView imgCorrecto;
>>>>>>> a750cbe73a94b14198f76895f838e894c7b222d6
>>>>>>> 96755b89d81283293e2ad2ac2f8d2072f0d08b35

    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_juego_opciones);

<<<<<<< HEAD
        //para el almacenamiento de logros conseguidos
        context = this;
        logros = getSharedPreferences("logrosConseguidos", 0);





        intPuntaje = 0;
        txtPuntaje = (TextView) findViewById(R.id.txtPuntaje);
=======
<<<<<<< HEAD
        //creando toolbar
        toolbar = (Toolbar) findViewById(R.id.tool_bar1);
        setSupportActionBar(toolbar);
        //para poner boton atras
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
>>>>>>> 96755b89d81283293e2ad2ac2f8d2072f0d08b35

        pregunta = (TextView) findViewById(R.id.txtPregunta);

        btnOpcion_1 = (Button) findViewById(R.id.btnOpcion1);
        btnOpcion_2 = (Button) findViewById(R.id.btnOpcion2);
        btnOpcion_3 = (Button) findViewById(R.id.btnOpcion3);
        btnOpcion_4 = (Button) findViewById(R.id.btnOpcion4);
<<<<<<< HEAD

        imgResultado = (ImageView) findViewById(R.id.imgResultado);
        imageLogro = (ImageView) findViewById(R.id.imageLogro);
=======
        imgCorrecto = (ImageView) findViewById(R.id.imgCorrecto);
        imgIncorrecto = (ImageView) findViewById(R.id.imgIncorrecto);

>>>>>>> 96755b89d81283293e2ad2ac2f8d2072f0d08b35

        //----TIPOGRAFIA----
        //cargando ruta
        final String fontPach = "fonts/century-gothic.ttf";
        //cargando fuente
        final Typeface tf = Typeface.createFromAsset(getAssets(), fontPach);
        //----TIPOGRAFIA----
        pregunta.setTypeface(tf);
        btnOpcion_1.setTypeface(tf);
        btnOpcion_2.setTypeface(tf);
        btnOpcion_3.setTypeface(tf);
        btnOpcion_4.setTypeface(tf);
<<<<<<< HEAD

        //creando toolbar
        toolbar = (Toolbar) findViewById(R.id.tool_bar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Jugando");
        //para poner boton atras
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

=======
=======
        pregunta = (TextView) findViewById(R.id.txtPregunta);

        btnOpcion_1 = (Button) findViewById(R.id.btnFacebook);
        btnOpcion_2 = (Button) findViewById(R.id.btnTwitter);
        btnOpcion_3 = (Button) findViewById(R.id.btnWhatsapp);
        btnOpcion_4 = (Button) findViewById(R.id.btnInstagram);

        imgCorrecto = (ImageView) findViewById(R.id.imgCorrecto);

        btnOpcion_4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (v.getId() == R.id.btnInstagram) {
                    isButtonClicked = !isButtonClicked;
                    imgCorrecto.setVisibility(View.VISIBLE);
                }
            }
        });
>>>>>>> a750cbe73a94b14198f76895f838e894c7b222d6
>>>>>>> 96755b89d81283293e2ad2ac2f8d2072f0d08b35

        //capturando eleccion
        Intent intent = getIntent();
        Bundle extra = intent.getExtras();
        if(extra != null){
            election = extra.getString("ELECCION");
        }
<<<<<<< HEAD

        actualizarContenido();
    }

    private void actualizarContenido() {
        //si la eleccion es igual a alguna categoria perteneciente al nivel 1
        if(election.equals("btnInicial1") || election.equals("btnInicial2") || election.equals("btnInicial3")) {
            // Se da el estilo de botón predeterminado a todos los botones
            btnOpcion_1.setBackgroundColor(Color.parseColor("#DD137B"));
            btnOpcion_2.setBackgroundColor(Color.parseColor("#C985A3"));
            btnOpcion_3.setBackgroundColor(Color.parseColor("#974578"));
            btnOpcion_4.setBackgroundColor(Color.parseColor("#DD137B"));

            //se carga el contenido de la pregunta y las opciones dependiendo de donde he ingresado yo
            if (election.equals("btnInicial1")) {
                inicial1(); //cargo el siguiente contenido
            } else if(election.equals("btnInicial2")) {
                inicial2(); //cargo el siguiente contenido
            } else if(election.equals("btnInicial3")) {
                inicial3(); //cargo el siguiente contenido
            }
        } else if(election.equals("btnIntermedio1") || election.equals("btnIntermedio2") || election.equals("btnIntermedio3")) {
            // Se da el estilo de botón predeterminado a todos los botones
            btnOpcion_1.setBackgroundColor(Color.parseColor("#007CC3"));
            btnOpcion_2.setBackgroundColor(Color.parseColor("#75C5F0"));
            btnOpcion_3.setBackgroundColor(Color.parseColor("#4DB4BB"));
            btnOpcion_4.setBackgroundColor(Color.parseColor("#007CC3"));

            //se carga el contenido de la pregunta y las opciones dependiendo de donde he ingresado yo
            if (election.equals("btnIntermedio1")) {
                intermedio1(); //cargo el siguiente contenido
            } else if(election.equals("btnIntermedio2")) {
                intermedio2(); //cargo el siguiente contenido
            } else if(election.equals("btnIntermedio3")) {
                intermedio3(); //cargo el siguiente contenido
            }
        } else if(election.equals("btnAvanzado1") || election.equals("btnAvanzado2") || election.equals("btnAvanzado3")) {
            // Se da el estilo de botón predeterminado a todos los botones
            btnOpcion_1.setBackgroundColor(Color.parseColor("#DA251D"));
            btnOpcion_2.setBackgroundColor(Color.parseColor("#e35d19"));
            btnOpcion_3.setBackgroundColor(Color.parseColor("#D9D207"));
            btnOpcion_4.setBackgroundColor(Color.parseColor("#BADA1C"));

            //se carga el contenido de la pregunta y las opciones dependiendo de donde he ingresado yo
            if (election.equals("btnAvanzado1")) {
                avanzado1(); //cargo el siguiente contenido
            } else if(election.equals("btnAvanzado2")) {
                avanzado2(); //cargo el siguiente contenido
            } else if(election.equals("btnAvanzado3")) {
                avanzado3(); //cargo el siguiente contenido
            }
        }

    }


    private void avanzado3() {
        //contenido de la pregunta 1
        if(preguntaNumero == 0){
            pregunta.setText(preguntasAvanzado3[0]);

            btnOpcion_1.setText(opcionesAvanzado3[0][0]);
            btnOpcion_2.setText(opcionesAvanzado3[0][1]);
            btnOpcion_3.setText(opcionesAvanzado3[0][2]);
            btnOpcion_4.setText(opcionesAvanzado3[0][3]);

            btnOpcion_1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    respuestaIncorrecta(btnOpcion_1);
                }
            });
            btnOpcion_2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    respuestaIncorrecta(btnOpcion_2);
                }
            });
            btnOpcion_3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    respuestaIncorrecta(btnOpcion_3);
                }
            });
            btnOpcion_4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    respuestaCorrecta(btnOpcion_4);
                }
            });
        }
        //contenido de la pregunta 2
        if(preguntaNumero == 1){
            pregunta.setText(preguntasAvanzado3[1]);

            btnOpcion_1.setText(opcionesAvanzado3[1][0]);
            btnOpcion_2.setText(opcionesAvanzado3[1][1]);
            btnOpcion_3.setText(opcionesAvanzado3[1][2]);
            btnOpcion_4.setText(opcionesAvanzado3[1][3]);

            btnOpcion_1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    respuestaIncorrecta(btnOpcion_1);
                }
            });
            btnOpcion_2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    respuestaIncorrecta(btnOpcion_2);
                }
            });
            btnOpcion_3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    respuestaCorrecta(btnOpcion_3);
                }
            });
            btnOpcion_4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    respuestaIncorrecta(btnOpcion_4);
                }
            });
        }
        //contenido de la pregunta 3
        if(preguntaNumero == 2){
            pregunta.setText(preguntasAvanzado3[2]);

            btnOpcion_1.setText(opcionesAvanzado3[2][0]);
            btnOpcion_2.setText(opcionesAvanzado3[2][1]);
            btnOpcion_3.setText(opcionesAvanzado3[2][2]);
            btnOpcion_4.setText(opcionesAvanzado3[2][3]);

            btnOpcion_1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    respuestaCorrecta(btnOpcion_1);
                }
            });
            btnOpcion_2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    respuestaIncorrecta(btnOpcion_2);
                }
            });
            btnOpcion_3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    respuestaIncorrecta(btnOpcion_3);
                }
            });
            btnOpcion_4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    respuestaIncorrecta(btnOpcion_4);
                }
            });
        }
        //mensaje de resultado
        if(preguntaNumero == 3) {
            resultadoFinal();
        }
    }

    private void avanzado2() {
        //contenido de la pregunta 1
        if(preguntaNumero == 0){
            pregunta.setText(preguntasAvanzado2[0]);

            btnOpcion_1.setText(opcionesAvanzado2[0][0]);
            btnOpcion_2.setText(opcionesAvanzado2[0][1]);
            btnOpcion_3.setText(opcionesAvanzado2[0][2]);
            btnOpcion_4.setText(opcionesAvanzado2[0][3]);

            btnOpcion_1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    respuestaCorrecta(btnOpcion_1);
                }
            });
            btnOpcion_2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    respuestaIncorrecta(btnOpcion_2);
                }
            });
            btnOpcion_3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    respuestaIncorrecta(btnOpcion_3);
                }
            });
            btnOpcion_4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    respuestaIncorrecta(btnOpcion_4);
                }
            });
        }
        //contenido de la pregunta 2
        if(preguntaNumero == 1){
            pregunta.setText(preguntasAvanzado2[1]);

            btnOpcion_1.setText(opcionesAvanzado2[1][0]);
            btnOpcion_2.setText(opcionesAvanzado2[1][1]);
            btnOpcion_3.setText(opcionesAvanzado2[1][2]);
            btnOpcion_4.setText(opcionesAvanzado2[1][3]);

            btnOpcion_1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    respuestaIncorrecta(btnOpcion_1);
                }
            });
            btnOpcion_2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    respuestaIncorrecta(btnOpcion_2);
                }
            });
            btnOpcion_3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    respuestaCorrecta(btnOpcion_3);
                }
            });
            btnOpcion_4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    respuestaIncorrecta(btnOpcion_4);
                }
            });
        }
        //contenido de la pregunta 3
        if(preguntaNumero == 2){
            pregunta.setText(preguntasAvanzado2[2]);

            btnOpcion_1.setText(opcionesAvanzado2[2][0]);
            btnOpcion_2.setText(opcionesAvanzado2[2][1]);
            btnOpcion_3.setText(opcionesAvanzado2[2][2]);
            btnOpcion_4.setText(opcionesAvanzado2[2][3]);

            btnOpcion_1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    respuestaIncorrecta(btnOpcion_1);
                }
            });
            btnOpcion_2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    respuestaIncorrecta(btnOpcion_2);
                }
            });
            btnOpcion_3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    respuestaIncorrecta(btnOpcion_3);
                }
            });
            btnOpcion_4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    respuestaCorrecta(btnOpcion_4);
                }
            });
        }
        //mensaje de resultado
        if(preguntaNumero == 3) {
            resultadoFinal();
        }
    }

    //contenido de la categoria 1 nivel inicial
    public void avanzado1(){
        //contenido de la pregunta 1
        if(preguntaNumero == 0){
            pregunta.setText(preguntasAvanzado1[0]);

            btnOpcion_1.setText(opcionesAvanzado1[0][0]);
            btnOpcion_2.setText(opcionesAvanzado1[0][1]);
            btnOpcion_3.setText(opcionesAvanzado1[0][2]);
            btnOpcion_4.setText(opcionesAvanzado1[0][3]);

            btnOpcion_1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    respuestaIncorrecta(btnOpcion_1);
                }
            });
            btnOpcion_2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    respuestaIncorrecta(btnOpcion_2);
                }
            });
            btnOpcion_3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    respuestaIncorrecta(btnOpcion_3);
                }
            });
            btnOpcion_4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    respuestaCorrecta(btnOpcion_4);
                }
            });
        }
        //contenido de la pregunta 2
        if(preguntaNumero == 1){
            pregunta.setText(preguntasAvanzado1[1]);

            btnOpcion_1.setText(opcionesAvanzado1[1][0]);
            btnOpcion_2.setText(opcionesAvanzado1[1][1]);
            btnOpcion_3.setText(opcionesAvanzado1[1][2]);
            btnOpcion_4.setText(opcionesAvanzado1[1][3]);

            btnOpcion_1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    respuestaIncorrecta(btnOpcion_1);
                }
            });
            btnOpcion_2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    respuestaCorrecta(btnOpcion_2);
                }
            });
            btnOpcion_3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    respuestaIncorrecta(btnOpcion_3);
                }
            });
            btnOpcion_4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    respuestaIncorrecta(btnOpcion_4);
                }
            });
        }
        //contenido de la pregunta 3
        if(preguntaNumero == 2){
            pregunta.setText(preguntasAvanzado1[2]);

            btnOpcion_1.setText(opcionesAvanzado1[2][0]);
            btnOpcion_2.setText(opcionesAvanzado1[2][1]);
            btnOpcion_3.setText(opcionesAvanzado1[2][2]);
            btnOpcion_4.setText(opcionesAvanzado1[2][3]);

            btnOpcion_1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    respuestaIncorrecta(btnOpcion_1);
                }
            });
            btnOpcion_2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    respuestaIncorrecta(btnOpcion_2);
                }
            });
            btnOpcion_3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    respuestaCorrecta(btnOpcion_3);
                }
            });
            btnOpcion_4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    respuestaIncorrecta(btnOpcion_4);
                }
            });
        }
        //mensaje de resultado
        if(preguntaNumero == 3) {
            resultadoFinal();

        }
    }


    private void intermedio3() {
        //contenido de la pregunta 1
        if(preguntaNumero == 0){
            pregunta.setText(preguntasIntermedio1[0]);

            btnOpcion_1.setText(opcionesIntermedio3[0][0]);
            btnOpcion_2.setText(opcionesIntermedio3[0][1]);
            btnOpcion_3.setText(opcionesIntermedio3[0][2]);
            btnOpcion_4.setText(opcionesIntermedio3[0][3]);

            btnOpcion_1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    respuestaIncorrecta(btnOpcion_1);
                }
            });
            btnOpcion_2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    respuestaIncorrecta(btnOpcion_2);
                }
            });
            btnOpcion_3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    respuestaIncorrecta(btnOpcion_3);
                }
            });
            btnOpcion_4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    respuestaCorrecta(btnOpcion_4);
                }
            });
        }
        //contenido de la pregunta 2
        if(preguntaNumero == 1){
            pregunta.setText(preguntasIntermedio3[1]);

            btnOpcion_1.setText(opcionesIntermedio3[1][0]);
            btnOpcion_2.setText(opcionesIntermedio3[1][1]);
            btnOpcion_3.setText(opcionesIntermedio3[1][2]);
            btnOpcion_4.setText(opcionesIntermedio3[1][3]);

            btnOpcion_1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    respuestaIncorrecta(btnOpcion_1);
                }
            });
            btnOpcion_2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    respuestaIncorrecta(btnOpcion_2);
                }
            });
            btnOpcion_3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    respuestaCorrecta(btnOpcion_3);
                }
            });
            btnOpcion_4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    respuestaIncorrecta(btnOpcion_4);
                }
            });
        }
        //contenido de la pregunta 3
        if(preguntaNumero == 2){
            pregunta.setText(preguntasIntermedio3[2]);

            btnOpcion_1.setText(opcionesIntermedio3[2][0]);
            btnOpcion_2.setText(opcionesIntermedio3[2][1]);
            btnOpcion_3.setText(opcionesIntermedio3[2][2]);
            btnOpcion_4.setText(opcionesIntermedio3[2][3]);

            btnOpcion_1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    respuestaIncorrecta(btnOpcion_1);
                }
            });
            btnOpcion_2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    respuestaIncorrecta(btnOpcion_2);
                }
            });
            btnOpcion_3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    respuestaIncorrecta(btnOpcion_3);
                }
            });
            btnOpcion_4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    respuestaCorrecta(btnOpcion_4);
                }
            });
        }
        //mensaje de resultado
        if(preguntaNumero == 3) {
            resultadoFinal();
        }
    }

    private void intermedio2() {
        //contenido de la pregunta 1
        if(preguntaNumero == 0){
            pregunta.setText(preguntasIntermedio2[0]);

            btnOpcion_1.setText(opcionesIntermedio2[0][0]);
            btnOpcion_2.setText(opcionesIntermedio2[0][1]);
            btnOpcion_3.setText(opcionesIntermedio2[0][2]);
            btnOpcion_4.setText(opcionesIntermedio2[0][3]);

            btnOpcion_1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    respuestaCorrecta(btnOpcion_1);
                }
            });
            btnOpcion_2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    respuestaIncorrecta(btnOpcion_2);
                }
            });
            btnOpcion_3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    respuestaIncorrecta(btnOpcion_3);
                }
            });
            btnOpcion_4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    respuestaIncorrecta(btnOpcion_4);
                }
            });
        }
        //contenido de la pregunta 2
        if(preguntaNumero == 1){
            pregunta.setText(preguntasIntermedio2[1]);

            btnOpcion_1.setText(opcionesIntermedio2[1][0]);
            btnOpcion_2.setText(opcionesIntermedio2[1][1]);
            btnOpcion_3.setText(opcionesIntermedio2[1][2]);
            btnOpcion_4.setText(opcionesIntermedio2[1][3]);

            btnOpcion_1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    respuestaIncorrecta(btnOpcion_1);
                }
            });
            btnOpcion_2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    respuestaCorrecta(btnOpcion_2);
                }
            });
            btnOpcion_3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    respuestaIncorrecta(btnOpcion_3);
                }
            });
            btnOpcion_4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    respuestaIncorrecta(btnOpcion_4);
                }
            });
        }
        //contenido de la pregunta 3
        if(preguntaNumero == 2){
            pregunta.setText(preguntasIntermedio2[2]);

            btnOpcion_1.setText(opcionesIntermedio2[2][0]);
            btnOpcion_2.setText(opcionesIntermedio2[2][1]);
            btnOpcion_3.setText(opcionesIntermedio2[2][2]);
            btnOpcion_4.setText(opcionesIntermedio2[2][3]);

            btnOpcion_1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    respuestaCorrecta(btnOpcion_1);
                }
            });
            btnOpcion_2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    respuestaIncorrecta(btnOpcion_2);
                }
            });
            btnOpcion_3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    respuestaIncorrecta(btnOpcion_3);
                }
            });
            btnOpcion_4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    respuestaIncorrecta(btnOpcion_4);
                }
            });
        }
        //mensaje de resultado
        if(preguntaNumero == 3) {
            resultadoFinal();
        }
    }

    //contenido de la categoria 1 nivel inicial
    public void intermedio1(){
        //contenido de la pregunta 1
        if(preguntaNumero == 0){
            pregunta.setText(preguntasIntermedio1[0]);

            btnOpcion_1.setText(opcionesIntermedio1[0][0]);
            btnOpcion_2.setText(opcionesIntermedio1[0][1]);
            btnOpcion_3.setText(opcionesIntermedio1[0][2]);
            btnOpcion_4.setText(opcionesIntermedio1[0][3]);

            btnOpcion_1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    respuestaIncorrecta(btnOpcion_1);
                }
            });
            btnOpcion_2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    respuestaIncorrecta(btnOpcion_2);
                }
            });
            btnOpcion_3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    respuestaCorrecta(btnOpcion_3);
                }
            });
            btnOpcion_4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    respuestaIncorrecta(btnOpcion_4);
                }
            });
        }
        //contenido de la pregunta 2
        if(preguntaNumero == 1){
            pregunta.setText(preguntasIntermedio1[1]);

            btnOpcion_1.setText(opcionesIntermedio1[1][0]);
            btnOpcion_2.setText(opcionesIntermedio1[1][1]);
            btnOpcion_3.setText(opcionesIntermedio1[1][2]);
            btnOpcion_4.setText(opcionesIntermedio1[1][3]);

            btnOpcion_1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    respuestaIncorrecta(btnOpcion_1);
                }
            });
            btnOpcion_2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    respuestaIncorrecta(btnOpcion_2);
                }
            });
            btnOpcion_3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    respuestaCorrecta(btnOpcion_3);
                }
            });
            btnOpcion_4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    respuestaIncorrecta(btnOpcion_4);
                }
            });
        }
        //contenido de la pregunta 3
        if(preguntaNumero == 2){
            pregunta.setText(preguntasIntermedio1[2]);

            btnOpcion_1.setText(opcionesIntermedio1[2][0]);
            btnOpcion_2.setText(opcionesIntermedio1[2][1]);
            btnOpcion_3.setText(opcionesIntermedio1[2][2]);
            btnOpcion_4.setText(opcionesIntermedio1[2][3]);

            btnOpcion_1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    respuestaCorrecta(btnOpcion_1);
                }
            });
            btnOpcion_2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    respuestaIncorrecta(btnOpcion_2);
                }
            });
            btnOpcion_3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    respuestaIncorrecta(btnOpcion_3);
                }
            });
            btnOpcion_4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    respuestaIncorrecta(btnOpcion_4);
                }
            });
        }
        //mensaje de resultado
        if(preguntaNumero == 3) {
            resultadoFinal();

        }
    }


    private void inicial3() {
        //contenido de la pregunta 1
        if(preguntaNumero == 0){
            pregunta.setText(preguntasInicial3[0]);

            btnOpcion_1.setText(opcionesInicial3[0][0]);
            btnOpcion_2.setText(opcionesInicial3[0][1]);
            btnOpcion_3.setText(opcionesInicial3[0][2]);
            btnOpcion_4.setText(opcionesInicial3[0][3]);

            btnOpcion_1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    respuestaIncorrecta(btnOpcion_1);
                }
            });
            btnOpcion_2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    respuestaIncorrecta(btnOpcion_2);
                }
            });
            btnOpcion_3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    respuestaCorrecta(btnOpcion_3);
                }
            });
            btnOpcion_4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    respuestaIncorrecta(btnOpcion_4);
                }
            });
        }
        //contenido de la pregunta 2
        if(preguntaNumero == 1){
            pregunta.setText(preguntasInicial3[1]);

            btnOpcion_1.setText(opcionesInicial3[1][0]);
            btnOpcion_2.setText(opcionesInicial3[1][1]);
            btnOpcion_3.setText(opcionesInicial3[1][2]);
            btnOpcion_4.setText(opcionesInicial3[1][3]);

            btnOpcion_1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    respuestaCorrecta(btnOpcion_1);
                }
            });
            btnOpcion_2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    respuestaIncorrecta(btnOpcion_2);
                }
            });
            btnOpcion_3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    respuestaIncorrecta(btnOpcion_3);
                }
            });
            btnOpcion_4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    respuestaIncorrecta(btnOpcion_4);
                }
            });
        }
        //contenido de la pregunta 3
        if(preguntaNumero == 2){
            pregunta.setText(preguntasInicial3[2]);

            btnOpcion_1.setText(opcionesInicial3[2][0]);
            btnOpcion_2.setText(opcionesInicial3[2][1]);
            btnOpcion_3.setText(opcionesInicial3[2][2]);
            btnOpcion_4.setText(opcionesInicial3[2][3]);

            btnOpcion_1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    respuestaIncorrecta(btnOpcion_1);
                }
            });
            btnOpcion_2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    respuestaIncorrecta(btnOpcion_2);
                }
            });
            btnOpcion_3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    respuestaIncorrecta(btnOpcion_3);
                }
            });
            btnOpcion_4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    respuestaCorrecta(btnOpcion_4);
                }
            });
        }
        //mensaje de resultado
        if(preguntaNumero == 3) {
            resultadoFinal();
        }
    }

    private void inicial2() {
        //contenido de la pregunta 1
        if(preguntaNumero == 0){
            pregunta.setText(preguntasInicial2[0]);

            btnOpcion_1.setText(opcionesInicial2[0][0]);
            btnOpcion_2.setText(opcionesInicial2[0][1]);
            btnOpcion_3.setText(opcionesInicial2[0][2]);
            btnOpcion_4.setText(opcionesInicial2[0][3]);

            btnOpcion_1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    respuestaIncorrecta(btnOpcion_1);
                }
            });
            btnOpcion_2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    respuestaIncorrecta(btnOpcion_2);
                }
            });
            btnOpcion_3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    respuestaCorrecta(btnOpcion_3);
                }
            });
            btnOpcion_4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    respuestaIncorrecta(btnOpcion_4);
                }
            });
        }
        //contenido de la pregunta 2
        if(preguntaNumero == 1){
            pregunta.setText(preguntasInicial2[1]);

            btnOpcion_1.setText(opcionesInicial2[1][0]);
            btnOpcion_2.setText(opcionesInicial2[1][1]);
            btnOpcion_3.setText(opcionesInicial2[1][2]);
            btnOpcion_4.setText(opcionesInicial2[1][3]);

            btnOpcion_1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    respuestaIncorrecta(btnOpcion_1);
                }
            });
            btnOpcion_2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    respuestaIncorrecta(btnOpcion_2);
                }
            });
            btnOpcion_3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    respuestaIncorrecta(btnOpcion_3);
                }
            });
            btnOpcion_4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    respuestaCorrecta(btnOpcion_4);
                }
            });
        }
        //contenido de la pregunta 3
        if(preguntaNumero == 2){
            pregunta.setText(preguntasInicial2[2]);

            btnOpcion_1.setText(opcionesInicial2[2][0]);
            btnOpcion_2.setText(opcionesInicial2[2][1]);
            btnOpcion_3.setText(opcionesInicial2[2][2]);
            btnOpcion_4.setText(opcionesInicial2[2][3]);

            btnOpcion_1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    respuestaIncorrecta(btnOpcion_1);
                }
            });
            btnOpcion_2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    respuestaIncorrecta(btnOpcion_2);
                }
            });
            btnOpcion_3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    respuestaCorrecta(btnOpcion_3);
                }
            });
            btnOpcion_4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    respuestaIncorrecta(btnOpcion_4);
                }
            });
        }
        //mensaje de resultado
        if(preguntaNumero == 3) {
            resultadoFinal();
        }
    }

    //contenido de la categoria 1 nivel inicial
    public void inicial1(){
        //contenido de la pregunta 1
        if(preguntaNumero == 0){
            pregunta.setText(preguntasInicial1[0]);

            btnOpcion_1.setText(opcionesInicial1[0][0]);
            btnOpcion_2.setText(opcionesInicial1[0][1]);
            btnOpcion_3.setText(opcionesInicial1[0][2]);
            btnOpcion_4.setText(opcionesInicial1[0][3]);

            btnOpcion_1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    respuestaIncorrecta(btnOpcion_1);
                }
            });
            btnOpcion_2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    respuestaIncorrecta(btnOpcion_2);
                }
            });
            btnOpcion_3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    respuestaIncorrecta(btnOpcion_3);
                }
            });
            btnOpcion_4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    respuestaCorrecta(btnOpcion_4);
                }
            });
        }
        //contenido de la pregunta 2
        if(preguntaNumero == 1){
            pregunta.setText(preguntasInicial1[1]);

            btnOpcion_1.setText(opcionesInicial1[1][0]);
            btnOpcion_2.setText(opcionesInicial1[1][1]);
            btnOpcion_3.setText(opcionesInicial1[1][2]);
            btnOpcion_4.setText(opcionesInicial1[1][3]);

            btnOpcion_1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    respuestaIncorrecta(btnOpcion_1);
                }
            });
            btnOpcion_2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    respuestaIncorrecta(btnOpcion_2);
                }
            });
            btnOpcion_3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    respuestaCorrecta(btnOpcion_3);
                }
            });
            btnOpcion_4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    respuestaIncorrecta(btnOpcion_4);
                }
            });
        }
        //contenido de la pregunta 3
        if(preguntaNumero == 2){
            pregunta.setText(preguntasInicial1[2]);

            btnOpcion_1.setText(opcionesInicial1[2][0]);
            btnOpcion_2.setText(opcionesInicial1[2][1]);
            btnOpcion_3.setText(opcionesInicial1[2][2]);
            btnOpcion_4.setText(opcionesInicial1[2][3]);

            btnOpcion_1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    respuestaCorrecta(btnOpcion_1);
                }
            });
            btnOpcion_2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    respuestaIncorrecta(btnOpcion_2);
                }
            });
            btnOpcion_3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    respuestaIncorrecta(btnOpcion_3);
                }
            });
            btnOpcion_4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    respuestaIncorrecta(btnOpcion_4);
                }
            });
        }
        //mensaje de resultado
        if(preguntaNumero == 3) {
            resultadoFinal();

        }
    }

    private void resultadoFinal() {
        btnOpcion_1.setVisibility(View.INVISIBLE);
        btnOpcion_2.setVisibility(View.INVISIBLE);
        btnOpcion_3.setVisibility(View.INVISIBLE);
        btnOpcion_4.setVisibility(View.INVISIBLE);
        //si el usuario atino en las 3 preguntas
        if (intPuntaje == 3) {
            //para guardar el logro una ves conseguido
            //---------------LOGRO---------------
                //INICIAL
            if (election.equals("btnInicial1")){
                SharedPreferences.Editor editor = logros.edit();
                editor.putInt("btnLogroInicial1", 1);
                editor.commit();
            }
            if (election.equals("btnInicial2")){
                SharedPreferences.Editor editor = logros.edit();
                editor.putInt("btnLogroInicial2", 1);
                editor.commit();
            }
            if (election.equals("btnInicial3")){
                SharedPreferences.Editor editor = logros.edit();
                editor.putInt("btnLogroInicial3", 1);
                editor.commit();
            }
                //INTERMEDIO
            if (election.equals("btnIntermedio1")){
                SharedPreferences.Editor editor = logros.edit();
                editor.putInt("btnLogroIntermedio1", 1);
                editor.commit();
            }
            if (election.equals("btnIntermedio2")){
                SharedPreferences.Editor editor = logros.edit();
                editor.putInt("btnLogroIntermedio2", 1);
                editor.commit();
            }
            if (election.equals("btnIntermedio3")){
                SharedPreferences.Editor editor = logros.edit();
                editor.putInt("btnLogroIntermedio3", 1);
                editor.commit();
            }
                //AVANSADO
            if (election.equals("btnAvanzado1")){
                SharedPreferences.Editor editor = logros.edit();
                editor.putInt("btnLogroAvanzado1", 1);
                editor.commit();
            }
            if (election.equals("btnAvanzado2")){
                SharedPreferences.Editor editor = logros.edit();
                editor.putInt("btnLogroAvanzado2", 1);
                editor.commit();
            }
            if (election.equals("btnAvanzado3")){
                SharedPreferences.Editor editor = logros.edit();
                editor.putInt("btnLogroAvanzado3", 1);
                editor.commit();
            }
            //---------------LOGRO--------------

            imageLogro.setImageResource(android.R.drawable.star_big_on);
            new CountDownTimer(10000, 1000) {
                @Override
                public void onTick(long millisUntilFinished) {
                    pregunta.setText("¡FELICIDADES!, has acertado en todas las preguntas y has conseguido un logro \nSeras redirigido al menu de los minijuegos en: " + (millisUntilFinished / 1000));
                }

                @Override
                //me voy a otro activity
                public void onFinish() {
                    Intent intent = new Intent(Juego.this, MiniJuegoActivity.class);
                    startActivity(intent);
                }
            }.start();
            //si no atino en las 3 preguntas
        } else {
            new CountDownTimer(5000, 1000) {
                @Override
                public void onTick(long millisUntilFinished) {
                    pregunta.setText("Parece que no has logrado llegar a los 3 acierto vuelve a intentarlo la proxima ves\nSeras redirigido al menu de los minijuegos en: " + (millisUntilFinished / 1000));
                }

                @Override
                public void onFinish() {
                    Intent intent = new Intent(Juego.this, MiniJuegoActivity.class);
                    startActivity(intent);
                }
            }.start();

        }
    }

    private void respuestaCorrecta(Button botonCorrecto) {
        if(puedoPulsarRespuesta == 1) {
            puedoPulsarRespuesta = 0;
            intPuntaje = intPuntaje + 1;
            txtPuntaje.setText(intPuntaje + "/ 3");

            imgResultado.setImageResource(R.drawable.correcto);
            imgResultado.setVisibility(View.VISIBLE);
            botonCorrecto.setBackgroundColor(Color.parseColor("#4DBB58"));

            siguientePregunta();
        }
    }

    private void respuestaIncorrecta(Button botonIncorrecto) {
        if(puedoPulsarRespuesta == 1) {
            puedoPulsarRespuesta = 0;
            imgResultado.setImageResource(R.drawable.incorrecto);
            imgResultado.setVisibility(View.VISIBLE);
            botonIncorrecto.setBackgroundColor(Color.parseColor("#B11B1B"));
            siguientePregunta();
        }
    }

    private void siguientePregunta() {
        new CountDownTimer(5000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                //mostrar mensaje dicieno: "pasando a la siguiente pregunta en: -tiempo-"
                if(preguntaNumero == 3){
                    //me voy a otro activity
                    pregunta.setText("Cargando resultado en: " + (millisUntilFinished/1000));
                } else{
                    pregunta.setText("Pregunta siguiente en: " + (millisUntilFinished/1000));
                }
            }

            @Override
            public void onFinish() {
                //PASANDO A LA SIGUIENTE PREGUNTA
                    //vuelvo a hacer el resultado invisible
                imgResultado.setVisibility(View.INVISIBLE);
                    //para pasar a la siguiente pregunta
                preguntaNumero = preguntaNumero + 1;
                    //vuelvo a permitir volver a precionar sobre una opcion
                puedoPulsarRespuesta = 1;
                    //vuelvo a cargar el contenido
                actualizarContenido();
            }
        }.start();
=======
<<<<<<< HEAD

        //NIVEL INICIAL
        //coloco el contenido de los minijuegos
        if(election.equals("btnInicial1")){
            pregunta.setText("¿Que necesito para mandar un mensaje de texto?");

            btnOpcion_1.setText("internet");
            btnOpcion_2.setText("nada, es gratis");
            btnOpcion_3.setText("facebook");
            btnOpcion_4.setText("credito");

            btnOpcion_1.setBackgroundColor(Color.parseColor("#E72517"));
            btnOpcion_2.setBackgroundColor(Color.parseColor("#E77817"));
            btnOpcion_3.setBackgroundColor(Color.parseColor("#D9D207"));
            btnOpcion_4.setBackgroundColor(Color.parseColor("#E72517"));

            btnOpcion_1.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    if (v.getId() == R.id.btnOpcion1) {
                        isButtonClicked = !isButtonClicked;
                        imgIncorrecto.setVisibility(View.VISIBLE);
                        imgCorrecto.setVisibility(View.INVISIBLE);
                        btnOpcion_2.setBackgroundColor(Color.parseColor("#B11B1B"));
                        btnOpcion_1.setBackgroundColor(Color.parseColor("#B11B1B"));
                        btnOpcion_3.setBackgroundColor(Color.parseColor("#B11B1B"));
                        btnOpcion_4.setBackgroundColor(Color.parseColor("#4DBB58"));
                    }
                }
            });

            btnOpcion_2.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    if (v.getId() == R.id.btnOpcion2) {
                        isButtonClicked = !isButtonClicked;
                        imgIncorrecto.setVisibility(View.VISIBLE);
                        imgCorrecto.setVisibility(View.INVISIBLE);
                        btnOpcion_2.setBackgroundColor(Color.parseColor("#B11B1B"));
                        btnOpcion_1.setBackgroundColor(Color.parseColor("#B11B1B"));
                        btnOpcion_3.setBackgroundColor(Color.parseColor("#B11B1B"));
                        btnOpcion_4.setBackgroundColor(Color.parseColor("#4DBB58"));
                    }
                }
            });

            btnOpcion_3.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    if (v.getId() == R.id.btnOpcion3) {
                        isButtonClicked = !isButtonClicked;
                        imgIncorrecto.setVisibility(View.VISIBLE);
                        imgCorrecto.setVisibility(View.INVISIBLE);
                        btnOpcion_2.setBackgroundColor(Color.parseColor("#B11B1B"));
                        btnOpcion_1.setBackgroundColor(Color.parseColor("#B11B1B"));
                        btnOpcion_3.setBackgroundColor(Color.parseColor("#B11B1B"));
                        btnOpcion_4.setBackgroundColor(Color.parseColor("#4DBB58"));
                    }
                }
            });

            //OPCION CORRECTA
            btnOpcion_4.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    if (v.getId() == R.id.btnOpcion4) {
                        isButtonClicked = !isButtonClicked;
                        imgIncorrecto.setVisibility(View.INVISIBLE);
                        imgCorrecto.setVisibility(View.VISIBLE);
                        btnOpcion_1.setBackgroundColor(Color.parseColor("#E72517"));
                        btnOpcion_2.setBackgroundColor(Color.parseColor("#E77817"));
                        btnOpcion_3.setBackgroundColor(Color.parseColor("#D9D207"));
                        btnOpcion_4.setBackgroundColor(Color.parseColor("#4DBB58"));
                    }
                }
            });


        }



        //coloco el contenido de los minijuegos
        if(election.equals("btnInicial2")){
            pregunta.setText("¿Como haces para llamar a un contacto desde tu propio telefono?");

            btnOpcion_1.setText("desde las llamadas de whatsapp");
            btnOpcion_2.setText("ingresando a facebook");
            btnOpcion_3.setText("ingresando a la seccion de contactos");
            btnOpcion_4.setText("todas son correctas");


            btnOpcion_1.setBackgroundColor(Color.parseColor("#E72517"));
            btnOpcion_2.setBackgroundColor(Color.parseColor("#E77817"));
            btnOpcion_3.setBackgroundColor(Color.parseColor("#D9D207"));
            btnOpcion_4.setBackgroundColor(Color.parseColor("#E72517"));

            btnOpcion_1.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    if (v.getId() == R.id.btnOpcion1) {
                        isButtonClicked = !isButtonClicked;
                        imgIncorrecto.setVisibility(View.VISIBLE);
                        imgCorrecto.setVisibility(View.INVISIBLE);
                        btnOpcion_2.setBackgroundColor(Color.parseColor("#B11B1B"));
                        btnOpcion_1.setBackgroundColor(Color.parseColor("#B11B1B"));
                        btnOpcion_3.setBackgroundColor(Color.parseColor("#4DBB58"));
                        btnOpcion_4.setBackgroundColor(Color.parseColor("#B11B1B"));
                    }
                }
            });

            btnOpcion_2.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    if (v.getId() == R.id.btnOpcion2) {
                        isButtonClicked = !isButtonClicked;
                        imgIncorrecto.setVisibility(View.VISIBLE);
                        imgCorrecto.setVisibility(View.INVISIBLE);
                        btnOpcion_2.setBackgroundColor(Color.parseColor("#B11B1B"));
                        btnOpcion_1.setBackgroundColor(Color.parseColor("#B11B1B"));
                        btnOpcion_3.setBackgroundColor(Color.parseColor("#4DBB58"));
                        btnOpcion_4.setBackgroundColor(Color.parseColor("#B11B1B"));
                    }
                }
            });

            //OPCION CORRECTA
            btnOpcion_3.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    if (v.getId() == R.id.btnOpcion3) {
                        isButtonClicked = !isButtonClicked;
                        imgCorrecto.setVisibility(View.VISIBLE);
                        imgIncorrecto.setVisibility(View.INVISIBLE);
                        btnOpcion_1.setBackgroundColor(Color.parseColor("#E72517"));
                        btnOpcion_2.setBackgroundColor(Color.parseColor("#E77817"));
                        btnOpcion_3.setBackgroundColor(Color.parseColor("#4DBB58"));
                        btnOpcion_4.setBackgroundColor(Color.parseColor("#E72517"));
                    }
                }
            });

            btnOpcion_4.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    if (v.getId() == R.id.btnOpcion4) {
                        isButtonClicked = !isButtonClicked;
                        imgIncorrecto.setVisibility(View.VISIBLE);
                        imgCorrecto.setVisibility(View.INVISIBLE);
                        btnOpcion_2.setBackgroundColor(Color.parseColor("#B11B1B"));
                        btnOpcion_1.setBackgroundColor(Color.parseColor("#B11B1B"));
                        btnOpcion_3.setBackgroundColor(Color.parseColor("#4DBB58"));
                        btnOpcion_4.setBackgroundColor(Color.parseColor("#B11B1B"));
                    }
                }
            });

        }

        //coloco el contenido de los minijuegos
        if(election.equals("btnInicial3")){
            pregunta.setText("¿Como llamar a un contacto ya agendado?");

            btnOpcion_1.setText("Desde whatsapp");
            btnOpcion_2.setText("Deslizando el dedo sobre su nombre");
            btnOpcion_3.setText("Tocando dos veces sobre el contacto");
            btnOpcion_4.setText("Desde la galeria de imagenes");

            btnOpcion_1.setBackgroundColor(Color.parseColor("#E72517"));
            btnOpcion_2.setBackgroundColor(Color.parseColor("#E77817"));
            btnOpcion_3.setBackgroundColor(Color.parseColor("#D9D207"));
            btnOpcion_4.setBackgroundColor(Color.parseColor("#E72517"));

            btnOpcion_1.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    if (v.getId() == R.id.btnOpcion1) {
                        isButtonClicked = !isButtonClicked;
                        imgIncorrecto.setVisibility(View.VISIBLE);
                        imgCorrecto.setVisibility(View.INVISIBLE);
                        btnOpcion_2.setBackgroundColor(Color.parseColor("#4DBB58"));
                        btnOpcion_1.setBackgroundColor(Color.parseColor("#B11B1B"));
                        btnOpcion_3.setBackgroundColor(Color.parseColor("#B11B1B"));
                        btnOpcion_4.setBackgroundColor(Color.parseColor("#B11B1B"));
                    }
                }
            });

            //OPCION CORRECTA
            btnOpcion_2.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    if (v.getId() == R.id.btnOpcion2) {
                        isButtonClicked = !isButtonClicked;
                        imgCorrecto.setVisibility(View.VISIBLE);
                        imgIncorrecto.setVisibility(View.INVISIBLE);
                        btnOpcion_1.setBackgroundColor(Color.parseColor("#E72517"));
                        btnOpcion_2.setBackgroundColor(Color.parseColor("#4DBB58"));
                        btnOpcion_3.setBackgroundColor(Color.parseColor("#D9D207"));
                        btnOpcion_4.setBackgroundColor(Color.parseColor("#E72517"));
                    }
                }
            });

            btnOpcion_3.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    if (v.getId() == R.id.btnOpcion3) {
                        isButtonClicked = !isButtonClicked;
                        imgIncorrecto.setVisibility(View.VISIBLE);
                        imgCorrecto.setVisibility(View.INVISIBLE);
                        btnOpcion_2.setBackgroundColor(Color.parseColor("#4DBB58"));
                        btnOpcion_1.setBackgroundColor(Color.parseColor("#B11B1B"));
                        btnOpcion_3.setBackgroundColor(Color.parseColor("#B11B1B"));
                        btnOpcion_4.setBackgroundColor(Color.parseColor("#B11B1B"));
                    }
                }
            });

            btnOpcion_4.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    if (v.getId() == R.id.btnOpcion4) {
                        isButtonClicked = !isButtonClicked;
                        imgIncorrecto.setVisibility(View.VISIBLE);
                        imgCorrecto.setVisibility(View.INVISIBLE);
                        btnOpcion_2.setBackgroundColor(Color.parseColor("#4DBB58"));
                        btnOpcion_1.setBackgroundColor(Color.parseColor("#B11B1B"));
                        btnOpcion_3.setBackgroundColor(Color.parseColor("#B11B1B"));
                        btnOpcion_4.setBackgroundColor(Color.parseColor("#B11B1B"));
                    }
                }
            });
        }

         //NIVEL INTERMEDIO
        //coloco el contenido de los minijuegos
        if(election.equals("btnIntermedio1")) {
            pregunta.setText("¿Que nos hace falta para añadir una cuenta de Google?");

            btnOpcion_1.setText("Cuenta de Gmail");
            btnOpcion_2.setText("Cuenta de Hotmail");
            btnOpcion_3.setText("Cuenta de Facebook");
            btnOpcion_4.setText("Cuenta de Twitter ");

            btnOpcion_1.setBackgroundColor(Color.parseColor("#007CC3"));
            btnOpcion_2.setBackgroundColor(Color.parseColor("#75C5F0"));
            btnOpcion_3.setBackgroundColor(Color.parseColor("#4DB4BB"));
            btnOpcion_4.setBackgroundColor(Color.parseColor("#007CC3"));

            //OPCION CORRECTA
            btnOpcion_1.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    if (v.getId() == R.id.btnOpcion1) {
                        isButtonClicked = !isButtonClicked;
                        imgCorrecto.setVisibility(View.VISIBLE);
                        imgIncorrecto.setVisibility(View.INVISIBLE);
                        btnOpcion_1.setBackgroundColor(Color.parseColor("#4DBB58"));
                        btnOpcion_2.setBackgroundColor(Color.parseColor("#75C5F0"));
                        btnOpcion_3.setBackgroundColor(Color.parseColor("#4DB4BB"));
                        btnOpcion_4.setBackgroundColor(Color.parseColor("#007CC3"));
                    }
                }
            });

            btnOpcion_2.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    if (v.getId() == R.id.btnOpcion2) {
                        isButtonClicked = !isButtonClicked;
                        imgIncorrecto.setVisibility(View.VISIBLE);
                        imgCorrecto.setVisibility(View.INVISIBLE);
                        btnOpcion_2.setBackgroundColor(Color.parseColor("#B11B1B"));
                        btnOpcion_1.setBackgroundColor(Color.parseColor("#4DBB58"));
                        btnOpcion_3.setBackgroundColor(Color.parseColor("#B11B1B"));
                        btnOpcion_4.setBackgroundColor(Color.parseColor("#B11B1B"));
                    }
                }
            });

            btnOpcion_3.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    if (v.getId() == R.id.btnOpcion3) {
                        isButtonClicked = !isButtonClicked;
                        imgIncorrecto.setVisibility(View.VISIBLE);
                        imgCorrecto.setVisibility(View.INVISIBLE);
                        btnOpcion_2.setBackgroundColor(Color.parseColor("#B11B1B"));
                        btnOpcion_1.setBackgroundColor(Color.parseColor("#4DBB58"));
                        btnOpcion_3.setBackgroundColor(Color.parseColor("#B11B1B"));
                        btnOpcion_4.setBackgroundColor(Color.parseColor("#B11B1B"));
                    }
                }
            });

            btnOpcion_4.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    if (v.getId() == R.id.btnOpcion4) {
                        isButtonClicked = !isButtonClicked;
                        imgIncorrecto.setVisibility(View.VISIBLE);
                        imgCorrecto.setVisibility(View.INVISIBLE);
                        btnOpcion_2.setBackgroundColor(Color.parseColor("#B11B1B"));
                        btnOpcion_1.setBackgroundColor(Color.parseColor("#4DBB58"));
                        btnOpcion_3.setBackgroundColor(Color.parseColor("#B11B1B"));
                        btnOpcion_4.setBackgroundColor(Color.parseColor("#B11B1B"));
                    }
                }
            });

        }

        //coloco el contenido de los minijuegos
        if(election.equals("btnIntermedio2")) {
            pregunta.setText("¿Que red social sirve solamente para publicar" +
                    " fotos y videos?");

            btnOpcion_1.setText("Twitter");
            btnOpcion_2.setText("Facebook");
            btnOpcion_3.setText("Instagram");
            btnOpcion_4.setText("Google maps");

            btnOpcion_1.setBackgroundColor(Color.parseColor("#007CC3"));
            btnOpcion_2.setBackgroundColor(Color.parseColor("#75C5F0"));
            btnOpcion_3.setBackgroundColor(Color.parseColor("#4DB4BB"));
            btnOpcion_4.setBackgroundColor(Color.parseColor("#007CC3"));


            btnOpcion_1.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    if (v.getId() == R.id.btnOpcion1) {
                        isButtonClicked = !isButtonClicked;
                        imgIncorrecto.setVisibility(View.VISIBLE);
                        imgCorrecto.setVisibility(View.INVISIBLE);
                        btnOpcion_2.setBackgroundColor(Color.parseColor("#B11B1B"));
                        btnOpcion_1.setBackgroundColor(Color.parseColor("#B11B1B"));
                        btnOpcion_3.setBackgroundColor(Color.parseColor("#4DBB58"));
                        btnOpcion_4.setBackgroundColor(Color.parseColor("#B11B1B"));
                    }
                }
            });

            btnOpcion_2.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    if (v.getId() == R.id.btnOpcion2) {
                        isButtonClicked = !isButtonClicked;
                        imgIncorrecto.setVisibility(View.VISIBLE);
                        imgCorrecto.setVisibility(View.INVISIBLE);
                        btnOpcion_2.setBackgroundColor(Color.parseColor("#B11B1B"));
                        btnOpcion_1.setBackgroundColor(Color.parseColor("#B11B1B"));
                        btnOpcion_3.setBackgroundColor(Color.parseColor("#4DBB58"));
                        btnOpcion_4.setBackgroundColor(Color.parseColor("#B11B1B"));
                    }
                }
            });
            //OPCION CORRECTA
            btnOpcion_3.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    if (v.getId() == R.id.btnOpcion3) {
                        isButtonClicked = !isButtonClicked;
                        imgCorrecto.setVisibility(View.VISIBLE);
                        imgIncorrecto.setVisibility(View.INVISIBLE);
                        btnOpcion_1.setBackgroundColor(Color.parseColor("#007CC3"));
                        btnOpcion_2.setBackgroundColor(Color.parseColor("#75C5F0"));
                        btnOpcion_3.setBackgroundColor(Color.parseColor("#4DBB58"));
                        btnOpcion_4.setBackgroundColor(Color.parseColor("#007CC3"));
                    }
                }
            });

            btnOpcion_4.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    if (v.getId() == R.id.btnOpcion4) {
                        isButtonClicked = !isButtonClicked;
                        imgIncorrecto.setVisibility(View.VISIBLE);
                        imgCorrecto.setVisibility(View.INVISIBLE);
                        btnOpcion_2.setBackgroundColor(Color.parseColor("#B11B1B"));
                        btnOpcion_1.setBackgroundColor(Color.parseColor("#B11B1B"));
                        btnOpcion_3.setBackgroundColor(Color.parseColor("#4DBB58"));
                        btnOpcion_4.setBackgroundColor(Color.parseColor("#B11B1B"));
                    }
                }
            });

        }

        //coloco el contenido de los minijuegos
        if(election.equals("btnIntermedio3")) {
            pregunta.setText("¿Que boton debes presionar para publicar un estado en " +
                    "Facebook?");

            btnOpcion_1.setText("Enviar");
            btnOpcion_2.setText("Publicar");
            btnOpcion_3.setText("Seguir");
            btnOpcion_4.setText("Agregar");

            btnOpcion_1.setBackgroundColor(Color.parseColor("#007CC3"));
            btnOpcion_2.setBackgroundColor(Color.parseColor("#75C5F0"));
            btnOpcion_3.setBackgroundColor(Color.parseColor("#4DB4BB"));
            btnOpcion_4.setBackgroundColor(Color.parseColor("#007CC3"));


            btnOpcion_1.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    if (v.getId() == R.id.btnOpcion1) {
                        isButtonClicked = !isButtonClicked;
                        imgIncorrecto.setVisibility(View.VISIBLE);
                        imgCorrecto.setVisibility(View.INVISIBLE);
                        btnOpcion_2.setBackgroundColor(Color.parseColor("#4DBB58"));
                        btnOpcion_1.setBackgroundColor(Color.parseColor("#B11B1B"));
                        btnOpcion_3.setBackgroundColor(Color.parseColor("#B11B1B"));
                        btnOpcion_4.setBackgroundColor(Color.parseColor("#B11B1B"));
                    }
                }
            });
            //OPCION CORRECTA
            btnOpcion_2.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    if (v.getId() == R.id.btnOpcion2) {
                        isButtonClicked = !isButtonClicked;
                        imgCorrecto.setVisibility(View.VISIBLE);
                        imgIncorrecto.setVisibility(View.INVISIBLE);
                        btnOpcion_1.setBackgroundColor(Color.parseColor("#007CC3"));
                        btnOpcion_2.setBackgroundColor(Color.parseColor("#4DBB58"));
                        btnOpcion_3.setBackgroundColor(Color.parseColor("#4DB4BB"));
                        btnOpcion_4.setBackgroundColor(Color.parseColor("#007CC3"));
                    }
                }
            });

            btnOpcion_3.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    if (v.getId() == R.id.btnOpcion3) {
                        isButtonClicked = !isButtonClicked;
                        imgIncorrecto.setVisibility(View.VISIBLE);
                        imgCorrecto.setVisibility(View.INVISIBLE);
                        btnOpcion_2.setBackgroundColor(Color.parseColor("#4DBB58"));
                        btnOpcion_1.setBackgroundColor(Color.parseColor("#B11B1B"));
                        btnOpcion_3.setBackgroundColor(Color.parseColor("#B11B1B"));
                        btnOpcion_4.setBackgroundColor(Color.parseColor("#B11B1B"));
                    }
                }
            });

            btnOpcion_4.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    if (v.getId() == R.id.btnOpcion4) {
                        isButtonClicked = !isButtonClicked;
                        imgIncorrecto.setVisibility(View.VISIBLE);
                        imgCorrecto.setVisibility(View.INVISIBLE);
                        btnOpcion_2.setBackgroundColor(Color.parseColor("#4DBB58"));
                        btnOpcion_1.setBackgroundColor(Color.parseColor("#B11B1B"));
                        btnOpcion_3.setBackgroundColor(Color.parseColor("#B11B1B"));
                        btnOpcion_4.setBackgroundColor(Color.parseColor("#B11B1B"));
                    }
                }
            });

        }


        //NIVEL AVANZADO
        //coloco el contenido de los minijuegos
        if(election.equals("btnAvanzado1")) {
            pregunta.setText("¿Que cosas podemos enviar a travez de un correo electronico?");

            btnOpcion_1.setText("texto");
            btnOpcion_2.setText("imagenes");
            btnOpcion_3.setText("archivos");
            btnOpcion_4.setText("todas son correctas");

            btnOpcion_1.setBackgroundColor(Color.parseColor("#DD137B"));
            btnOpcion_2.setBackgroundColor(Color.parseColor("#C985A3"));
            btnOpcion_3.setBackgroundColor(Color.parseColor("#974578"));
            btnOpcion_4.setBackgroundColor(Color.parseColor("#DD137B"));

            btnOpcion_1.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    if (v.getId() == R.id.btnOpcion1) {
                        isButtonClicked = !isButtonClicked;
                        imgIncorrecto.setVisibility(View.VISIBLE);
                        imgCorrecto.setVisibility(View.INVISIBLE);
                        btnOpcion_2.setBackgroundColor(Color.parseColor("#B11B1B"));
                        btnOpcion_1.setBackgroundColor(Color.parseColor("#B11B1B"));
                        btnOpcion_3.setBackgroundColor(Color.parseColor("#B11B1B"));
                        btnOpcion_4.setBackgroundColor(Color.parseColor("#4DBB58"));
                    }
                }
            });

            btnOpcion_2.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    if (v.getId() == R.id.btnOpcion2) {
                        isButtonClicked = !isButtonClicked;
                        imgIncorrecto.setVisibility(View.VISIBLE);
                        imgCorrecto.setVisibility(View.INVISIBLE);
                        btnOpcion_2.setBackgroundColor(Color.parseColor("#B11B1B"));
                        btnOpcion_1.setBackgroundColor(Color.parseColor("#B11B1B"));
                        btnOpcion_3.setBackgroundColor(Color.parseColor("#B11B1B"));
                        btnOpcion_4.setBackgroundColor(Color.parseColor("#4DBB58"));
                    }
                }
            });

            btnOpcion_3.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    if (v.getId() == R.id.btnOpcion3) {
                        isButtonClicked = !isButtonClicked;
                        imgIncorrecto.setVisibility(View.VISIBLE);
                        imgCorrecto.setVisibility(View.INVISIBLE);
                        btnOpcion_2.setBackgroundColor(Color.parseColor("#B11B1B"));
                        btnOpcion_1.setBackgroundColor(Color.parseColor("#B11B1B"));
                        btnOpcion_3.setBackgroundColor(Color.parseColor("#B11B1B"));
                        btnOpcion_4.setBackgroundColor(Color.parseColor("#4DBB58"));
                    }
                }
            });

            //OPCION CORRECTA
            btnOpcion_4.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    if (v.getId() == R.id.btnOpcion4) {
                        isButtonClicked = !isButtonClicked;
                        imgCorrecto.setVisibility(View.VISIBLE);
                        imgIncorrecto.setVisibility(View.INVISIBLE);
                        btnOpcion_4.setBackgroundColor(Color.parseColor("#4DBB58"));
                    }
                }
            });


        }

        //coloco el contenido de los minijuegos
        if(election.equals("btnAvanzado2")) {
            pregunta.setText("¿Con cual de estas opciones borras el texto pero podes pegarlo en " +
                    "otro lado?");

            btnOpcion_1.setText("Copiar");
            btnOpcion_2.setText("Enviar");
            btnOpcion_3.setText("Cortar");
            btnOpcion_4.setText("Seleccionar");

            btnOpcion_1.setBackgroundColor(Color.parseColor("#DD137B"));
            btnOpcion_2.setBackgroundColor(Color.parseColor("#C985A3"));
            btnOpcion_3.setBackgroundColor(Color.parseColor("#974578"));
            btnOpcion_4.setBackgroundColor(Color.parseColor("#DD137B"));

            btnOpcion_1.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    if (v.getId() == R.id.btnOpcion1) {
                        isButtonClicked = !isButtonClicked;
                        imgIncorrecto.setVisibility(View.VISIBLE);
                        imgCorrecto.setVisibility(View.INVISIBLE);
                        btnOpcion_2.setBackgroundColor(Color.parseColor("#B11B1B"));
                        btnOpcion_1.setBackgroundColor(Color.parseColor("#B11B1B"));
                        btnOpcion_3.setBackgroundColor(Color.parseColor("#4DBB58"));
                        btnOpcion_4.setBackgroundColor(Color.parseColor("#B11B1B"));
                    }
                }
            });

            btnOpcion_2.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    if (v.getId() == R.id.btnOpcion2) {
                        isButtonClicked = !isButtonClicked;
                        imgIncorrecto.setVisibility(View.VISIBLE);
                        imgCorrecto.setVisibility(View.INVISIBLE);
                        btnOpcion_2.setBackgroundColor(Color.parseColor("#B11B1B"));
                        btnOpcion_1.setBackgroundColor(Color.parseColor("#B11B1B"));
                        btnOpcion_3.setBackgroundColor(Color.parseColor("#4DBB58"));
                        btnOpcion_4.setBackgroundColor(Color.parseColor("#B11B1B"));
                    }
                }
            });

            //OPCION CORRECTA
            btnOpcion_3.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    if (v.getId() == R.id.btnOpcion3) {
                        isButtonClicked = !isButtonClicked;
                        imgCorrecto.setVisibility(View.VISIBLE);
                        imgIncorrecto.setVisibility(View.INVISIBLE);
                        btnOpcion_3.setBackgroundColor(Color.parseColor("#4DBB58"));

                    }
                }
            });

            btnOpcion_4.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    if (v.getId() == R.id.btnOpcion4) {
                        isButtonClicked = !isButtonClicked;
                        imgIncorrecto.setVisibility(View.VISIBLE);
                        imgCorrecto.setVisibility(View.INVISIBLE);
                        btnOpcion_2.setBackgroundColor(Color.parseColor("#B11B1B"));
                        btnOpcion_1.setBackgroundColor(Color.parseColor("#B11B1B"));
                        btnOpcion_3.setBackgroundColor(Color.parseColor("#4DBB58"));
                        btnOpcion_4.setBackgroundColor(Color.parseColor("#B11B1B"));
                    }
                }
            });


        }

        //coloco el contenido de los minijuegos
        if(election.equals("btnAvanzado3")) {
            pregunta.setText("¿Cual buscador mas utilizado de internet?");

            btnOpcion_1.setText("Yahoo");
            btnOpcion_2.setText("Bing");
            btnOpcion_3.setText("Ask");
            btnOpcion_4.setText("Google");

            btnOpcion_1.setBackgroundColor(Color.parseColor("#DD137B"));
            btnOpcion_2.setBackgroundColor(Color.parseColor("#C985A3"));
            btnOpcion_3.setBackgroundColor(Color.parseColor("#974578"));
            btnOpcion_4.setBackgroundColor(Color.parseColor("#DD137B"));

            btnOpcion_1.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    if (v.getId() == R.id.btnOpcion1) {
                        isButtonClicked = !isButtonClicked;
                        imgIncorrecto.setVisibility(View.VISIBLE);
                        imgCorrecto.setVisibility(View.INVISIBLE);
                        btnOpcion_2.setBackgroundColor(Color.parseColor("#B11B1B"));
                        btnOpcion_1.setBackgroundColor(Color.parseColor("#B11B1B"));
                        btnOpcion_3.setBackgroundColor(Color.parseColor("#B11B1B"));
                        btnOpcion_4.setBackgroundColor(Color.parseColor("#4DBB58"));
                    }
                }
            });

            btnOpcion_2.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    if (v.getId() == R.id.btnOpcion2) {
                        isButtonClicked = !isButtonClicked;
                        imgIncorrecto.setVisibility(View.VISIBLE);
                        imgCorrecto.setVisibility(View.INVISIBLE);
                        btnOpcion_2.setBackgroundColor(Color.parseColor("#B11B1B"));
                        btnOpcion_1.setBackgroundColor(Color.parseColor("#B11B1B"));
                        btnOpcion_3.setBackgroundColor(Color.parseColor("#B11B1B"));
                        btnOpcion_4.setBackgroundColor(Color.parseColor("#4DBB58"));
                    }
                }
            });

            btnOpcion_3.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    if (v.getId() == R.id.btnOpcion3) {
                        isButtonClicked = !isButtonClicked;
                        imgIncorrecto.setVisibility(View.VISIBLE);
                        imgCorrecto.setVisibility(View.INVISIBLE);
                        btnOpcion_2.setBackgroundColor(Color.parseColor("#B11B1B"));
                        btnOpcion_1.setBackgroundColor(Color.parseColor("#B11B1B"));
                        btnOpcion_3.setBackgroundColor(Color.parseColor("#B11B1B"));
                        btnOpcion_4.setBackgroundColor(Color.parseColor("#4DBB58"));
                    }
                }
            });

            //OPCION CORRECTA
            btnOpcion_4.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    if (v.getId() == R.id.btnOpcion4) {
                        isButtonClicked = !isButtonClicked;
                        imgCorrecto.setVisibility(View.VISIBLE);
                        imgIncorrecto.setVisibility(View.INVISIBLE);
                        btnOpcion_4.setBackgroundColor(Color.parseColor("#4DBB58"));
                        btnOpcion_1.setBackgroundColor(Color.parseColor("#DD137B"));
                        btnOpcion_2.setBackgroundColor(Color.parseColor("#C985A3"));
                        btnOpcion_3.setBackgroundColor(Color.parseColor("#974578"));

                    }
                }
            });


        }


>>>>>>> 96755b89d81283293e2ad2ac2f8d2072f0d08b35
    }
    @Override public boolean onCreateOptionsMenu(android.view.Menu mimenu){
        getMenuInflater().inflate(R.menu.menu_tutorial, mimenu);

        return true;
    }

    @Override public boolean onOptionsItemSelected(MenuItem opcion_menu){
        int id = opcion_menu.getItemId();

        switch (id){
            case R.id.home:
                NavUtils.navigateUpFromSameTask(this);
                return true;
        }

        return super.onOptionsItemSelected(opcion_menu);
<<<<<<< HEAD
=======
=======
        //coloco el contenido de los minijuegos
        if(election.equals("btnInicial1")){
            pregunta.setText("¿Cual red social se utiliza solo para subir " +
                    "imagenes y videos?");

            btnOpcion_1.setText("facebook");
            btnOpcion_2.setText("gmail");
            btnOpcion_3.setText("twitter");
            btnOpcion_4.setText("instagram");

            if(election.equals("instagram")){}
        }
        //coloco el contenido de los minijuegos
        if(election.equals("btnInicial2")){
            pregunta.setText("¿Cual red social se utiliza solo para subir " +
                    "imagenes y videos?");

            btnOpcion_1.setText("facebookasda");
            btnOpcion_2.setText("gmaiasdal");
            btnOpcion_3.setText("twittasdasder");
            btnOpcion_4.setText("instagasdasdram");
        }

>>>>>>> a750cbe73a94b14198f76895f838e894c7b222d6
>>>>>>> 96755b89d81283293e2ad2ac2f8d2072f0d08b35
    }
}
