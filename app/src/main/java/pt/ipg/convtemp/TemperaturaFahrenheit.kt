package pt.ipg.convtemp

class TemperaturaFahrenheit(valor: Double) : Temperatura(valor) {
    override fun GetFahrenheit(): Double = valor

    override fun GetCelsius(): Double = (valor - 32.0)*5.0/9.0
}