package com.example.practice.old

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.practice.R
import com.example.practice.old.MainActivityOld

class MainActivityOld : AppCompatActivity() {
    var btnFadeIn: Button? = null
    var btnFadeOut: Button? = null
    var btnCrossFade: Button? = null
    var btnBlink: Button? = null
    var btnZoomIn: Button? = null
    var btnZoomOut: Button? = null
    var btnRotate: Button? = null
    var btnMove: Button? = null
    var btnSlideUp: Button? = null
    var btnSlideDown: Button? = null
    var btnBounce: Button? = null
    var btnSequential: Button? = null
    var btnTogether: Button? = null
    var animFadeIn: Animation? = null
    var animFadeOut: Animation? = null
    var animBlink: Animation? = null
    var animZoomIn: Animation? = null
    var animZoomOut: Animation? = null
    var animRotate: Animation? = null
    var animMove: Animation? = null
    var animSlideUp: Animation? = null
    var animSlideDown: Animation? = null
    var animBounce: Animation? = null
    var animSequential: Animation? = null
    var animTogether: Animation? = null
    var animCrossFadeIn: Animation? = null
    var animCrossFadeOut: Animation? = null
    var txtFadeIn: TextView? = null
    var txtFadeOut: TextView? = null
    var txtBlink: TextView? = null
    var txtZoomIn: TextView? = null
    var txtZoomOut: TextView? = null
    var txtRotate: TextView? = null
    var txtMove: TextView? = null
    var txtSlideUp: TextView? = null
    var txtSlideDown: TextView? = null
    var txtBounce: TextView? = null
    var txtSeq: TextView? = null
    var txtTog: TextView? = null
    var txtIn: TextView? = null
    var txtOut: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_old)
        btnFadeIn = findViewById<View>(R.id.btnFadeIn) as? Button
        btnFadeOut = findViewById<View>(R.id.btnFadeOut) as? Button
        btnCrossFade = findViewById<View>(R.id.btnCrossFade) as? Button
        btnBlink = findViewById<View>(R.id.btnBlink) as? Button
        btnZoomIn = findViewById<View>(R.id.btnZoomIn) as? Button
        btnZoomOut = findViewById<View>(R.id.btnZoomOut) as? Button
        btnRotate = findViewById<View>(R.id.btnRotate) as? Button
        btnMove = findViewById<View>(R.id.btnMove) as? Button
        btnSlideUp = findViewById<View>(R.id.btnSlideUp) as? Button
        btnSlideDown = findViewById<View>(R.id.btnSlideDown) as? Button
        btnBounce = findViewById<View>(R.id.btnBounce) as? Button
        btnSequential = findViewById<View>(R.id.btnSequential) as? Button
        btnTogether = findViewById<View>(R.id.btnTogether) as? Button
        txtFadeIn = findViewById<View>(R.id.txt_fade_in) as? TextView
        txtFadeOut = findViewById<View>(R.id.txt_fade_out) as? TextView
        txtBlink = findViewById<View>(R.id.txt_blink) as? TextView
        txtZoomIn = findViewById<View>(R.id.txt_zoom_in) as? TextView
        txtZoomOut = findViewById<View>(R.id.txt_zoom_out) as? TextView
        txtRotate = findViewById<View>(R.id.txt_rotate) as? TextView
        txtMove = findViewById<View>(R.id.txt_move) as? TextView
        txtSlideUp = findViewById<View>(R.id.txt_slide_up) as? TextView
        txtSlideDown = findViewById<View>(R.id.txt_slide_down) as? TextView
        txtBounce = findViewById<View>(R.id.txt_bounce) as? TextView
        txtSeq = findViewById<View>(R.id.txt_seq) as? TextView
        txtTog = findViewById<View>(R.id.txt_tog) as? TextView
        txtIn = findViewById<View>(R.id.txt_in) as? TextView
        txtOut = findViewById<View>(R.id.txt_out) as? TextView
        animFadeIn = AnimationUtils.loadAnimation(applicationContext,
                R.anim.fade_in)
        /*
         * Buttons click events
         */animFadeIn = AnimationUtils.loadAnimation(applicationContext,
                R.anim.fade_in)
        // fade in
        btnFadeIn!!.setOnClickListener {
            txtFadeIn!!.visibility = View.VISIBLE
            txtFadeIn!!.startAnimation(animFadeIn)
        }
        animFadeOut = AnimationUtils.loadAnimation(applicationContext,
                R.anim.fade_out)

        // fade out
        btnFadeOut!!.setOnClickListener {
            txtFadeOut!!.visibility = View.VISIBLE
            txtFadeOut!!.startAnimation(animFadeOut)
        }
        animCrossFadeIn = AnimationUtils.loadAnimation(applicationContext,
                R.anim.fade_in)
        animCrossFadeOut = AnimationUtils.loadAnimation(applicationContext,
                R.anim.fade_out)
        // cross fade
        btnCrossFade!!.setOnClickListener {
            txtOut!!.visibility = View.VISIBLE
            // start fade in animation
            txtOut!!.startAnimation(animCrossFadeIn)

            // start fade out animation
            txtIn!!.startAnimation(animCrossFadeOut)
        }
        animBlink = AnimationUtils.loadAnimation(applicationContext,
                R.anim.blink)
        // blink
        btnBlink!!.setOnClickListener {
            txtBlink!!.visibility = View.VISIBLE
            txtBlink!!.startAnimation(animBlink)
        }
        animZoomIn = AnimationUtils.loadAnimation(applicationContext,
                R.anim.zoom_in)
        // Zoom In
        btnZoomIn!!.setOnClickListener {
            txtZoomIn!!.visibility = View.VISIBLE
            txtZoomIn!!.startAnimation(animZoomIn)
        }
        animZoomOut = AnimationUtils.loadAnimation(applicationContext,
                R.anim.zoom_out)
        // Zoom Out
        btnZoomOut!!.setOnClickListener {
            txtZoomOut!!.visibility = View.VISIBLE
            txtZoomOut!!.startAnimation(animZoomOut)
        }
        animRotate = AnimationUtils.loadAnimation(applicationContext,
                R.anim.rotate)

        // Rotate
        btnRotate!!.setOnClickListener { txtRotate!!.startAnimation(animRotate) }
        animMove = AnimationUtils.loadAnimation(applicationContext,
                R.anim.move)
        // Move
        btnMove!!.setOnClickListener { txtMove!!.startAnimation(animMove) }
        animSlideUp = AnimationUtils.loadAnimation(applicationContext,
                R.anim.slide_up)
        // Slide Up
        btnSlideUp!!.setOnClickListener { txtSlideUp!!.startAnimation(animSlideUp) }
        animSlideDown = AnimationUtils.loadAnimation(applicationContext,
                R.anim.slide_down)
        // Slide Down
        btnSlideDown!!.setOnClickListener { txtSlideDown!!.startAnimation(animSlideDown) }
        animBounce = AnimationUtils.loadAnimation(applicationContext,
                R.anim.bounce)
        // Slide Down
        btnBounce!!.setOnClickListener { txtBounce!!.startAnimation(animBounce) }
        animSequential = AnimationUtils.loadAnimation(applicationContext,
                R.anim.sequential)
        // Sequential
        btnSequential!!.setOnClickListener { txtSeq!!.startAnimation(animSequential) }
        animTogether = AnimationUtils.loadAnimation(applicationContext,
                R.anim.together)

        // Together
        btnTogether!!.setOnClickListener { txtTog!!.startAnimation(animTogether) }
    }

    fun CustomOnClick(view: View) {
        startActivity(Intent(this@MainActivityOld, MainActivityOld::class.java))
        when (view.id) {
            R.id.btnLeftToRight -> overridePendingTransition(R.anim.anim_slide_in_left, R.anim.anim_slide_out_right)
            R.id.btnRightToLeft -> overridePendingTransition(R.anim.anim_slide_in_right, R.anim.anim_slide_out_left)
            R.id.btnTopToBottom -> overridePendingTransition(R.anim.anim_slide_in_top, R.anim.anim_slide_out_bottom)
            R.id.btnBottomToTop -> overridePendingTransition(R.anim.anim_slide_in_bottom, R.anim.anim_slide_out_top)
            else -> {
            }
        }
        finish()
    }
}