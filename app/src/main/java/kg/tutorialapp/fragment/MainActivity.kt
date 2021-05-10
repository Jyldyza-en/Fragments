package kg.tutorialapp.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity(), FragmentAListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupFragment ()

        setup()
    }

    private fun setup() {

        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener {

            val text = findViewById<EditText>(R.id.editText)

            val fragment = FragmentA()

            val args = Bundle()
            args.putString("String", text.text.toString())

            fragment.arguments = args

            supportFragmentManager
                    .beginTransaction()
                    .add(R.id.container, fragment, FragmentA.TAG)
                    .commit()
        }
    }

    private fun setupFragment() {

        val transaction = supportFragmentManager.beginTransaction()

        transaction.replace(R.id.container, FragmentA())

        transaction.commit()
    }

    override fun ShowToast() {
        Toast.makeText(this, "FragmentA told me to do this", Toast.LENGTH_LONG).show()
    }
}