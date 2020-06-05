package carperta

fun main (args: Array<String>){
    val listaDeSeleccion: List<String> = arrayListOf<String>("Agua", "Leche", "Carne", "Verduras", "Frutas", "Cereal","Huevos", "Aceite",
    "No quiero más ingredientes")
    val listaSeleccionada: ArrayList<Int> = arrayListOf<Int>()
    var logic = true
    while(true){
        mostrarMenuDeOpciones()
        var datoDeSeleccion: Int? = tomarDato() //Recogemos el dato de seleccion
        if (datoDeSeleccion == 1) {
            mostrarIngredientes()
            logic = true
            while (logic) {
                var datoElegido: Int = tomarDato()
                if (datoElegido != 9) {
                    println(listaDeSeleccion[datoElegido])
                    listaSeleccionada.add(datoElegido - 1)
                    logic = true
                } else {
                    logic = false
                }
            }
        } else if (datoDeSeleccion == 2) {
            println("Usted eligió la receta con los siguientes ingredientes: ")
            for (variableRecorrido in listaSeleccionada) {
                println(listaDeSeleccion[variableRecorrido])
            }
        } else if (datoDeSeleccion == 3) {
            println("Bye bye")
            listaSeleccionada.clear()
        }
    }
}

fun mostrarMenuDeOpciones (){
    println("""
        :: Bienvenido a Recipe Maker ::
        Selecciona la opción deseada
        1. Hacer una receta
        2. Ver mis recetas
        3. Salir
    """.trimIndent())
}

fun mostrarIngredientes (){
    println("""
            Hagamos una receta!!!
            Puede elegir los siguientes ingredientes:
            1. Agua
            2. Leche
            3. Carne
            4. Verduras
            5. Frutas
            6. Cereal
            7. Huevos
            8. Aceite
            9. No quiero más ingredientes
        """.trimIndent())
}

fun tomarDato () :Int {
    val tomarDatoIngrediente: String = readLine()?: "0"
    return tomarDatoIngrediente.toInt()
}
