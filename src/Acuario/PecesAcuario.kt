package Acuario
abstract class Pez {
    abstract val color: String
}
 interface AccionPez {
     fun comer()
 }
class Tiburon : Pez(), AccionPez {
    override val color = "Gris"
    override fun comer() {
        println("cazar y comer peces")
    }
}

class PezPayaso : Pez (), AccionPez {
    override val color = "Dorado"
    override fun comer() {
        println("comer algas")
    }
}