// Declaração do pacote onde esta classe está localizada
package com.example.appcompatactivity

// Importação de bibliotecas necessárias
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

// Definição da classe MainActivity que herda da classe AppCompatActivity
class MainActivity : AppCompatActivity() {

    // Declaração de propriedades para as views que serão utilizadas na atividade
    private lateinit var nomeEmpresa: TextView
    private lateinit var atuacaoEmpresa: TextView
    private lateinit var resultado: TextView

    // Método chamado quando a atividade é criada
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Define o layout da atividade a partir do arquivo XML (activity_main.xml)
        setContentView(R.layout.activity_main)

        // Inicializa as propriedades com as views correspondentes
        nomeEmpresa = findViewById(R.id.nomeEmpresa)
        atuacaoEmpresa = findViewById(R.id.atuacaoEmpresa)
        resultado = findViewById(R.id.resultado)

        // Define o texto inicial das views
        nomeEmpresa.text = "FIAP"
        atuacaoEmpresa.text = "Consultor SAP BTP"
        resultado.text = ""
    }

    // Função chamada quando o botão é clicado (TAP)
    fun combinarTextos(view: View) {
        // Criar uma string combinando o texto das views nomeEmpresa e atuacaoEmpresa
        val textoFinal = "${nomeEmpresa.text} - ${atuacaoEmpresa.text}"
        // Define o texto da view resultado com o texto combinado
        resultado.text = textoFinal
    }
}