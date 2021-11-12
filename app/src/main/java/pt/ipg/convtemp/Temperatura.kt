package pt.ipg.convtemp

abstract class Temperatura(val valor: Double) {
    abstract fun GetFahrenheit() : Double
    abstract fun GetCelsius() : Double
}