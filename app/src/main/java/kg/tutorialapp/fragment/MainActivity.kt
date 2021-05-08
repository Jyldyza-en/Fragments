package kg.tutorialapp.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupFragment ()
    }

    private fun setupFragment() {

        val transaction = supportFragmentManager.beginTransaction()

        transaction.replace(R.id.container, FragmentA())

        transaction.commit()
    }
}