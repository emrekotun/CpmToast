package com.emrekotun.cpmtoast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       /* CpmToast.createColorToast(
            this,
            message,
            CpmToast.TOAST_ERROR,
            CpmToast.GRAVITY_TOP,
            CpmToast.LONG_DURATION
        )*/
    }
}