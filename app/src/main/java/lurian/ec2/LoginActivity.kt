package lurian.ec2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.Toast
import androidx.core.widget.addTextChangedListener
import lurian.ec2.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnlogin.setOnClickListener{
            val email = binding.tILEmail.editText?.text.toString()
            val password = binding.tILContrasena.editText?.text.toString()

            if (validateEmailPass(email, password)) {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                finish()
            }
        }
    }
    private fun validateEmailPass(email:String, pass:String):Boolean{
        val isEmailvalid = email.isNotEmpty() && Patterns.EMAIL_ADDRESS.matcher(email).matches() && email == "ejemplo@idat.edu.pe"
        val ispassvalid = pass.isNotEmpty() && pass == "123456"
        if (!isEmailvalid || !ispassvalid) {
            sendMessage("Los datos ingresados son incorrectos")
        }
        return isEmailvalid && ispassvalid
    }
    private fun sendMessage(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}