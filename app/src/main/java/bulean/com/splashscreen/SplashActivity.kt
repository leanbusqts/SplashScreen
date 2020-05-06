package bulean.com.splashscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.Window
import android.view.WindowManager

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // https://developer.android.com/reference/android/view/Window.
        // Abstract base class for a top-level window look and behavior policy.
        // An instance of this class should be used as the top-level view added to the window manager.
        // It provides standard UI policies such as a background, title area, default key processing, etc.
        // The only existing implementation of this abstract class is android.view.PhoneWindow,
        // which you should instantiate when needing a Window..
        // Hiding title bar of this activity.
        // If not called, no extended features will be available.
        window.requestFeature(Window.FEATURE_NO_TITLE)
        // Making this activity full screen.
        // Set the flags of the window, as per the WindowManager.LayoutParams flags.
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN)
        // Set the activity content to an explicit view.
        // This view is placed directly into the activity's view hierarchy.
        setContentView(R.layout.activity_splash)
        // Causes the Runnable r to be added to the message queue,
        // to be run after the specified amount of time elapses.
        // The runnable will be run on the thread to which this handler is attached.
        Handler().postDelayed({
            // Start main activity
            startActivity(Intent(this@SplashActivity, MainActivity::class.java))
            // Finish this activity
            finish()
        },500) // 2 second splash time.
    }
}
