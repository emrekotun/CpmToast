package com.emrekotun.cpmtoast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.emrekotun.toast.CpmToast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        CpmToast.EXTRA
    }
}