package pt.ipg.convtemp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.RadioButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun converte(view: android.view.View) {
        val editTemperatura = findViewById<EditText>(R.id.editTemperatura)
        val radioButtonFahrenheit = findViewById<RadioButton>(R.id.radioButtonFahrenheit)
        val radioButtonCelsius = findViewById<RadioButton>(R.id.radioButtonCelsius)

        val valorTemperatura = editTemperatura.toString().toDoubleOrNull()
        if(valorTemperatura == null) {
            editTemperatura.error = getString(R.string.temperatura_invalida)
            editTemperatura.requestFocus()
            return
        }

        if (radioButtonFahrenheit.isChecked) {
            DadosApp.temperatura = TemperaturaFahrenheit(valorTemperatura)
        } else if (radioButtonCelsius.isChecked) {
            DadosApp.temperatura = TemperaturaCelsius(valorTemperatura)
        } else {
            radioButtonFahrenheit.error = "Escolha a unidade de temperatura"
            return
        }

        val intent = Intent(this, VerConversaoActivity::class.java)
        startActivity(intent)
    }
}