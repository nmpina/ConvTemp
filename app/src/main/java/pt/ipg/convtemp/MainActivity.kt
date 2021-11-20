package pt.ipg.convtemp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
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
        val  radioButtonCelsius = findViewById<RadioButton>(R.id.radioButtonCelsius)

        val intent = Intent(this, VerConversaoActivity::class.java)
        startActivity(intent)
    }
}