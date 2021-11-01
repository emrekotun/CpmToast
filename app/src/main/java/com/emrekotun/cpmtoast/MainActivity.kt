package com.emrekotun.cpmtoast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.emrekotun.toast.CpmToast
import com.emrekotun.toast.CpmToast.Companion.toastSuccess


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       toastSuccess("Hello Word !",CpmToast.LONG_DURATION)

    }
}