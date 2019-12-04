/**
 * Función principal, punto de inicio del programa
 * */
fun main(){
    // Instancio cuatro objetos de clase Coche llamados mustang, bmw, ford y vw y le paso los parámetros indicados abajo (matricula, hora entrada y salida)
    var mustang = Coche("0555 MTG", "17:03", "17:41");
    var bmw = Coche("1423 KTM", "14:00", "15:35");
    var ford = Coche("4253 BTR", "18:13", "19:02");
    var vw = Coche("3211 AGT", "22:10", "23:36");
    // Instancio dos objetos de clase Aparcamiento llamados parking y parking2 y le asigno los siguientes valores a los parámetros nombre, plazas totales y plazas libres y dos objetos de clase/tipo Coche
    val parking = Aparcamiento("VigoParking", 300, 51, mustang, bmw, vw);
    val parking2 = Aparcamiento("CangasCar", 50, 27, vw, ford, mustang);
    // Llamo al método mostrar que imprime en pantalla las características del aparcamiento y de sus coches
    parking.mostrar();
    parking2.mostrar();
}