package com.example.fechaactual

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fechaactual.databinding.ActivityMainBinding
import java.text.SimpleDateFormat
import java.time.ZoneOffset.UTC
import java.util.*

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    val fechallll:String = obtenerFechaConFormato()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        //manera simplificada
       // binding.fecha.text = SimpleDateFormat("dd MMM. yyyy, hh:mm a").format(Date())


        binding.fecha.text = fecha
    }

    fun obtenerFechaConFormato ( ) :String {
        val calendar: Calendar = Calendar.getInstance()
        val date: Date = calendar.time
        var sdf: SimpleDateFormat
        sdf = SimpleDateFormat("dd MMM. yyyy, hh:mm a")
        return sdf.format(date)
    }





}