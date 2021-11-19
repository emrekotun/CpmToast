@file:Suppress("unused")

package com.emrekotun.toast

import android.app.Activity
import android.content.Context
import android.graphics.Color
import android.graphics.PorterDuff
import android.graphics.PorterDuffColorFilter
import android.graphics.drawable.Drawable
import android.os.CountDownTimer
import android.view.LayoutInflater
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.annotation.ColorRes
import androidx.annotation.DrawableRes
import androidx.appcompat.content.res.AppCompatResources
import androidx.core.content.ContextCompat
import androidx.core.graphics.drawable.DrawableCompat

// Created by Emre KOTUN on 28.10.2021.
class CpmToast {
    companion object {
        const val LONG_DURATION = 5000L
        const val SHORT_DURATION = 2000L
        const val TOAST_ERROR = "FAILED"
        const val TOAST_INFO = "INFO"
        const val TOAST_SUCCESS = "SUCCESS"
        const val TOAST_WARNING = "WARNING"
        private lateinit var layoutInflater: LayoutInflater
        private var errorToastColor: Int = R.color.lightError
        private var infoToastColor: Int = R.color.lightPrimary
        private var successToastColor: Int = R.color.lightSuccess
        private var warningToastColor: Int = R.color.lightWarning
        private fun createColorToast(
            context: Activity,
            message: String,
            style: String,
            duration: Long
        ) {
            layoutInflater = LayoutInflater.from(context)
            val layout = layoutInflater.inflate(
                R.layout.toast_layout,
                (context).findViewById(R.id.color_toast_view)
            )
            val ivToast: ImageView = layout.findViewById(R.id.color_toast_image)
            val tvToastMsg: TextView = layout.findViewById(R.id.color_toast_description)
            when (style) {
                // Function for Toast Success
                TOAST_SUCCESS -> {
                    ivToast.setImageDrawable(context.drawable(R.drawable.ic_check_bg_filled))
                    DrawableCompat.setTint(DrawableCompat.wrap(ivToast.drawable), ContextCompat.getColor(context, successToastColor))
                    // round background color
                    setBackgroundAndFilter(successToastColor, layout, context)
                    // Setting up the color for title & Message text
                    setDescriptionDetails(message, tvToastMsg)
                    // init toast
                    val toast = Toast(context.applicationContext)
                    startTimer(duration, toast)
                    // Setting Toast Gravity
                    setGravity(toast)
                    // Setting layout to toast
                    toast.view = layout
                    toast.show()
                }
                TOAST_ERROR -> {
                    ivToast.setImageDrawable(context.drawable(R.drawable.ic_close_bg_filled))
                    DrawableCompat.setTint(DrawableCompat.wrap(ivToast.drawable), ContextCompat.getColor(context, errorToastColor))
                    // round background color
                    setBackgroundAndFilter(errorToastColor, layout, context)
                    // Setting up the color for title & Message text
                    setDescriptionDetails(message, tvToastMsg)
                    // init toast
                    val toast = Toast(context.applicationContext)
                    startTimer(duration, toast)
                    // Setting Toast Gravity
                    setGravity(toast)
                    // Setting layout to toast
                    toast.view = layout
                    toast.show()
                }
                TOAST_WARNING -> {
                    ivToast.setImageDrawable(context.drawable(R.drawable.ic_error_sign_filled))
                    DrawableCompat.setTint(DrawableCompat.wrap(ivToast.drawable), ContextCompat.getColor(context, warningToastColor))
                    // round background color
                    setBackgroundAndFilter(warningToastColor, layout, context)
                    // Setting up the color for title & Message text
                    setDescriptionDetails(message, tvToastMsg)
                    // init toast
                    val toast = Toast(context.applicationContext)
                    startTimer(duration, toast)
                    // Setting Toast Gravity
                    setGravity(toast)
                    // Setting layout to toast
                    toast.view = layout
                    toast.show()
                }
                TOAST_INFO -> {
                    ivToast.setImageDrawable(context.drawable(R.drawable.ic_info_sign_filled))
                    DrawableCompat.setTint(DrawableCompat.wrap(ivToast.drawable), ContextCompat.getColor(context, infoToastColor))
                    // round background color
                    setBackgroundAndFilter(infoToastColor, layout, context)
                    // Setting up the color for title & Message text
                    setDescriptionDetails(message, tvToastMsg)
                    // init toast
                    val toast = Toast(context.applicationContext)
                    startTimer(duration, toast)
                    // Setting Toast Gravity
                    setGravity(toast)
                    // Setting layout to toast
                    toast.view = layout
                    toast.show()
                }
            }
        }

        fun Activity.toastSuccess(message: String, duration: Long = SHORT_DURATION) {
            createColorToast(
                this,
                message,
                TOAST_SUCCESS,
                duration
            )
        }

        fun Activity.toastError(message: String, duration: Long = SHORT_DURATION) {
            createColorToast(
                this,
                message,
                TOAST_ERROR,
                duration
            )
        }

        fun Activity.toastWarning(message: String, duration: Long = SHORT_DURATION) {
            createColorToast(
                this,
                message,
                TOAST_WARNING,
                duration
            )
        }

        fun Activity.toastInfo(message: String, duration: Long = SHORT_DURATION) {
            createColorToast(
                this,
                message,
                TOAST_INFO,
                duration
            )
        }

        private fun startTimer(duration: Long, toast: Toast) {
            val timer = object : CountDownTimer(duration, 1000) {
                override fun onTick(millisUntilFinished: Long) {
                    // do nothing
                }

                override fun onFinish() {
                    toast.cancel()
                }
            }
            timer.start()
        }

        private fun setDescriptionDetails(
            message: String,
            layout: TextView
        ) {
            layout.setTextColor(Color.WHITE)
            layout.text = message
        }

        private fun setGravity(myToast: Toast) {
            myToast.setGravity(50, 100, 100)
        }

        private fun setBackgroundAndFilter(
            @ColorRes colorFilter: Int,
            layout: View,
            context: Context
        ) {
            val drawable = context.drawable(R.drawable.toast_round_background)
            drawable?.colorFilter = PorterDuffColorFilter(
                ContextCompat.getColor(context, colorFilter),
                PorterDuff.Mode.MULTIPLY
            )
            layout.background = drawable
        }
    }
}

fun Context.drawable(@DrawableRes drawableResId: Int): Drawable? {
    return AppCompatResources.getDrawable(this, drawableResId)
}