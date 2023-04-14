package com.example.signupscreen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val login = findViewById<Button>(R.id.btn)
        val signup = findViewById<Button>(R.id.btn2)
        val retour = findViewById<Button>(R.id.btnretour)

        retour.visibility = View.GONE
        login.setOnClickListener { val fragment1 = supportFragmentManager.findFragmentByTag("fragment1")
            val fragment2 = supportFragmentManager.findFragmentByTag("fragment2")

            if (fragment1 == null) {
                val fragTransaction = supportFragmentManager.beginTransaction()
                fragTransaction.replace(R.id.flMain, Fragment1(), "fragment1").commit()
                if (fragment2 != null) {
                    val fragTransaction = supportFragmentManager.beginTransaction()
                    fragTransaction.remove(fragment2).commit()
                }
            }
            else {
                val fragTransaction = supportFragmentManager.beginTransaction()
                fragTransaction.remove(fragment1).commit()

            }
        }
        signup.setOnClickListener { val fragment2 = supportFragmentManager.findFragmentByTag("fragment2")
            val fragment1 = supportFragmentManager.findFragmentByTag("fragment1")
            if (fragment2 == null) {
                val fragTransaction = supportFragmentManager.beginTransaction()
                fragTransaction.replace(R.id.flMain2, Fragment2(), "fragment2").commit()
                login.visibility = View.GONE
                signup.visibility = View.GONE
                retour.visibility = View.VISIBLE
                if (fragment1 != null) {
                    val fragTransaction = supportFragmentManager.beginTransaction()
                    fragTransaction.remove(fragment1).commit()
                }
            }
            else {
                val fragTransaction = supportFragmentManager.beginTransaction()
                fragTransaction.remove(fragment2).commit()
            }
            retour.setOnClickListener {
                val fragment2 = supportFragmentManager.findFragmentByTag("fragment2")
                if (fragment2 != null) {
                    val fragTransaction = supportFragmentManager.beginTransaction()
                    fragTransaction.remove(fragment2).commit()
                    login.visibility = View.VISIBLE
                    signup.visibility = View.VISIBLE
                    retour.visibility = View.GONE
                }

            }
        }
    }


}