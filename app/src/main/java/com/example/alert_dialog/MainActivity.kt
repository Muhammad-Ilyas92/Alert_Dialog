package com.example.alert_dialog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun alert(v:View)
    {
        val alert = AlertDialog.Builder(this)
        alert.setTitle("Delete")
        alert.setIcon(android.R.drawable.ic_dialog_alert)
        alert.setMessage("Do you want to delete ")
        alert.setPositiveButton("yES")
        {
            dialogInterface, i ->
            Toast.makeText(this, "Deleted ", Toast.LENGTH_SHORT)
                .show()
        }
        alert.setNegativeButton("No")
        {
                dialogInterface, i ->
            Toast.makeText(this, "Cancel ", Toast.LENGTH_SHORT)
                .show()
        }

        alert.show()


    }


}