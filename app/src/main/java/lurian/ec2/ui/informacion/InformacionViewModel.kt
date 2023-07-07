package lurian.ec2.ui.informacion

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class InformacionViewModel : ViewModel() {

    private val _textInfo = MutableLiveData<String>().apply {
        value = "Android Studio usa Gradle como base del sistema de compilación, y el complemento de Android para Gradle proporciona capacidades específicas de Android. Este sistema de compilación se ejecuta en una herramienta integrada desde el menú de Android Studio, y lo hace independientemente de la línea de comandos. "
    }
    val textInfo: LiveData<String> = _textInfo

    private val _textTitulo = MutableLiveData<String>().apply {
        value = "IMFORMACION"
    }
    val textTitulo: LiveData<String> = _textTitulo
}