package com.c5durango.botonpanicomercios;

public class Constantes {

    //     1,000 1 seg
    //    60,000 1 minuto
    // 3,600,000 1 hora

    public static final String CHANNEL_ID = "BOTON_PANICO_COMERCIOS";
    public static String NOMBRE_APP = "Botón de pánico para comercios";
    public static final int PRIORITY_MAX = 2;
    public static final int ID_SERVICIO_PANICO = 100;
    public static final int ID_SERVICIO_AUDIO = 102;
    public static final int ID_SERVICIO_WIDGET = 101;

    public static final int ID_SERVICIO_WIDGET_CREAR_REPORTE = 200;
    public static final int ID_SERVICIO_WIDGET_GENERAR_ALERTA = 201;
    public static final int ID_SERVICIO_WIDGET_ENVIAR_IMG = 202;
    public static final int ID_SERVICIO_WIDGET_GRABAR_AUDIO = 203;
    public static final int ID_SERVICIO_WIDGET_TOMAR_UBICAC = 204;

    // Permisos
    public static final int MY_PERMISSIONS_REQUEST_CAMERA = 100;
    public static final int MY_PERMISSIONS_REQUEST_ALMAC_READ = 101;
    public static final int MY_PERMISSIONS_REQUEST_ALMAC_WRITE = 102;
    public static final int MY_PERMISSIONS_REQUEST_UBICAC = 103;
    public static final int MY_PERMISSIONS_REQUEST_MICROF = 104;

    // Constantes para reporte
    public static final int DIFERENCIA_ENTRE_REPORTES = 600000; // 60,000 = 1 minuto
    public static final int LAPSO_PARA_CANCELAR_REPORTE = 60000; // 60,000 = 1 minuto

    // Constantes para audio
    public static int DURACION_AUDIO = 30000; // 30 x 4 = 2 minutos
    public static String EXTENSION_AUDIO = "mp3";


    // public static String URL = "http://10.11.127.70:8888"; // LOCAL
    public static String URL = "http://189.254.158.196:8888";    // IP PUBLICA
    //public static String URL = "http://10.11.118.91:8888";    // IP PRIVADA

}
