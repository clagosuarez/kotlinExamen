/**
 * El constructor por defecto del Aparcamiento recibe un nombre (como cadena de texto), plazasTotakes y plazasLibres () y un objeto de clase Coche
 * */
class Aparcamiento (var nombre: String, var plazasTotales: Int, var plazasLibres: Int, var coche1: Coche, var coche2: Coche, var coche3: Coche){

    // La función mostrar imprime en pantalla el aparcamiento con su nombre, plazas totales y plazas libres y sus dos coches con sus respectivas matriculas, horas de entrada y salida
    fun mostrar(){
        println("Aparcamiento:"+"\n Nombre: "+nombre+"\n Plazas totales: "+plazasTotales+
                "\n Plazas libres: "+plazasLibres+"\n Coches: "+"\n   Matricula: "+coche1.matricula+
                "\n   Hora de entrada: "+coche1.horaEntrada+"\n   Hora de salida: "+coche1.horaSalida+
                "\n   Matricula: "+coche2.matricula+"\n   Hora de entrada: "+coche2.horaEntrada+
                "\n   Hora de salida: "+coche2.horaSalida+ "\n   Matricula: "+coche3.matricula+
                "\n   Hora de entrada: "+coche3.horaEntrada+ "\n   Hora de salida: "+coche3.horaSalida);
    }
}