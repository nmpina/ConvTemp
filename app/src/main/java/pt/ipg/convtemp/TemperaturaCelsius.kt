package pt.ipg.convtemp

class TemperaturaCelsius(valor: Double) : Temperatura(valor){
    override fun GetFahrenheit(): Double = valor*1.8 + 32.0
    override fun GetCelsius(): Double = valor
}