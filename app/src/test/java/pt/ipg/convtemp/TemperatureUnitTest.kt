package pt.ipg.convtemp

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class TemperatureUnitTest {

    @Test
    fun conversaoFahrenheit_isCorrect() {
        val frio = TemperaturaFahrenheit(32.0)
        assertEquals(0.0, frio.GetCelsius(), 0.001)
        assertEquals(32.0, frio.GetFahrenheit(), 0.001)

        val calor = TemperaturaFahrenheit(77.0)
        assertEquals(25.0, calor.GetCelsius(), 0.001)
        assertEquals(77.0, calor.GetFahrenheit(), 0.001)
    }

    @Test
    fun conversaoCelsius_isCorrect() {
        val frio = TemperaturaCelsius (0.0)
        assertEquals(0.0, frio.GetCelsius(), 0.001)
        assertEquals(32.0, frio.GetFahrenheit(), 0.001)

        val calor = TemperaturaCelsius(25.0)
        assertEquals(25.0, calor.GetCelsius(), 0.001)
        assertEquals(77.0, calor.GetFahrenheit(), 0.001)
    }
}