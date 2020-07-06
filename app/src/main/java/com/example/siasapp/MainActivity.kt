package com.example.siasapp

import android.os.Bundle
import android.view.Menu
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.ui.AppBarConfiguration
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.content_main.*
import kotlinx.android.synthetic.main.fragment_home.*

class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()







        val drawerLayout: DrawerLayout = findViewById(R.id.drawer_layout)
        drawer_icon.setOnClickListener {
            drawerLayout.openDrawer(GravityCompat.START)
        }


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

//            spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
//                override fun onItemSelected(
//                    parent: AdapterView<*>,
//                    view: View,
////                    position: Int,
//                    id: Long
//                ) {
//                    Toast.makeText(
//                        this@Main3Activity,
//                        getString(R.string.selected_item) + " " + selectCourse[position],
//                        Toast.LENGTH_SHORT
//                    ).show()
//                }
//
//                override fun onNothingSelected(parent: AdapterView<*>) {
//                    // Code to perform some action when nothing is selected
//                }
        }

        val selectSemester = arrayOf("Select Semester", "1", "2", "3", "4", "5", "6")
        val spinner2 = findViewById<Spinner>(R.id.spinner2)
        if (spinner2 != null) {
            var arrayAdapter =
                ArrayAdapter(this, android.R.layout.simple_spinner_item, selectSemester)
            spinner2.adapter = arrayAdapter


        }

//        val selectSubject = arrayOf("Select Subject", " ")
//        val spinner3 = findViewById<Spinner>(R.id.spinner3)
//        if (spinner3 != null) {
//            var  arrayAdapter =
//                ArrayAdapter(this, android.R.layout.simple_spinner_item, selectSubject)
//            spinner3.adapter = arrayAdapter
//
//
//        }
//
//        val selectYear = arrayOf("Select Year", "2017", "2018", "2019")
//        val spinner4 = findViewById<Spinner>(R.id.spinner4)
//        if (spinner4 != null) {
//            var  arrayAdapter =
//                ArrayAdapter(this, android.R.layout.simple_spinner_item, selectYear)
//            spinner4.adapter = arrayAdapter
//
//
//        }

        submitBtn.setOnClickListener {
            Toast.makeText(this, "Opening the question paper...", Toast.LENGTH_LONG).show()
        }

//        val drawerLayout: DrawerLayout = findViewById(R.id.drawer_layout)
//        val navView: NavigationView = findViewById(R.id.nav_view)
//        val navController = findNavController(R.id.nav_host_fragment)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
//        appBarConfiguration = AppBarConfiguration(setOf(
//                R.id.nav_home, R.id.nav_gallery, R.id.nav_slideshow), drawerLayout)
//        setupActionBarWithNavController(navController, appBarConfiguration)
//        navView.setupWithNavController(navController)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

//    override fun onSupportNavigateUp(): Boolean {
//        val navController = findNavController(R.id.nav_host_fragment)
//        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
//    }
}