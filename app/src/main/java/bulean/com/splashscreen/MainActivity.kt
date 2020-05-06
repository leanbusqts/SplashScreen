package bulean.com.splashscreen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mCountField: TextView = findViewById(R.id.countField)
        // https://developer.android.com/reference/kotlin/android/os/CountDownTimer
        object : CountDownTimer(10000, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                mCountField.text = "T - " + millisUntilFinished / 1000
            }
            override fun onFinish() {
                mCountField.text = "DONE!"
            }
        }.start()
    }
}
