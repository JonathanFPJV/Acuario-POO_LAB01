package Acuario
abstract class Pez {
    abstract val color: String
}

class Tiburon : Pez() {
    override val color = "Gris"
}

class PezPayaso : Pez () {
    override val color = "Dorado"
}