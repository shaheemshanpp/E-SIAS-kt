package com.example.siasapp

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.Spinner
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.content_main.*
import kotlinx.android.synthetic.main.nav_header_main.*



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
//        onOptionsItemSelected()


//        val url: ImageView = findViewById(R.id.avatas_img)
//        Glide.with(this).load("https://image.flaticon.com/icons/svg/535/535572.svg")//Avatar Image
//            .into(url)
//        Picasso.get().load("https://image.flaticon.com/icons/svg/535/535572.svg").into(avatas_img)
//        Glide.with(this).load("https://image.flaticon.com/icons/svg/535/535572.svg")
//            .into(avatas_img)







        val drawerLayout: DrawerLayout = findViewById(R.id.drawer_layout)
        drawer_icon.setOnClickListener {
            drawerLayout.openDrawer(GravityCompat.START)
        }


//        val avatar_image = findViewById<ImageView>(R.id.avatas_img)
//        Glide.with(this).load("").into(avatar_image).view
//        val linearLayout = findViewById<LinearLayout>(R.id.linearLayout)
//        val imageView = ImageView(this)
//        Glide.with(this).load("https://image.flaticon.com/icons/svg/535/535572.svg")
//            .into(imageView)
//        linearLayout.addView(imageView)

//

        val selectCourse = arrayOf(
            "Select Course",
            "CS",
            "BCA",
            "BBA",
            "MB",
            "BT",
            "FT",
            "English",
            "Economics",
            "IF",
            "MCJ"
        )
        val spinner = findViewById<Spinner>(R.id.mySpinner)
        if (spinner != null) {
            val arrayAdapter =
                ArrayAdapter(this, android.R.layout.simple_spinner_item, selectCourse)
            spinner.adapter = arrayAdapter

        }

        val selectSemester = arrayOf("Select Semester", "1", "2", "3", "4", "5", "6")
        val spinner2 = findViewById<Spinner>(R.id.spinner2)
        if (spinner2 != null) {
            var arrayAdapter =
                ArrayAdapter(this, android.R.layout.simple_spinner_item, selectSemester)
            spinner2.adapter = arrayAdapter


        }

        submitBtn.setOnClickListener {
            Toast.makeText(this, "Opening the question paper...", Toast.LENGTH_LONG).show()
        }
    }

//    override fun onCreateOptionsMenu(menu: Menu): Boolean {
//        menuInflater.inflate(R.menu.main, menu)
//        return true
//    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle item selection
        return when (item.itemId) {
            R.id.nav_home -> {
                Toast.makeText(this,"Hello",Toast.LENGTH_SHORT).show()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}