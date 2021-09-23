package com.example.appli_cine_enigma

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.content.ContentValues

import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_add_note.*

class AddNoteActivity : AppCompatActivity() {

    val dbTable = "Notes"
    var id = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_note)

        try {
            val bundle: Bundle? = intent.extras
            if (bundle != null) {
                id = bundle.getInt("ID", 0)
            }
            if (id!=0){
                titleEt.setText(bundle.getString("nom"))
                nodeNote_scenarioET.setText(bundle.getInt("note sce"))
                nodeNote_realisationET.setText(bundle.getInt("note real"))
                nodeNote_musiueET.setText(bundle.getInt("note mus"))
                descEt.setText(bundle.getString("des"))
            }
        }catch (ex:Exception){}
    }

    fun addFunc(view:View){
        var dbManager = DbManager(this)

        var values = ContentValues()
        values.put("Title", titleEt.text.toString())
        values.put("note scenario", titleEt.text.toInt())
        values.put("note realisation", titleEt.text.toInt())
        values.put("note musique", titleEt.text.toInt())
        values.put("Description", descEt.text.toString())

        if (id ==0){
            val ID = dbManager.insert(values)
            if (ID>0){
                Toast.makeText(this, "Note is added", Toast.LENGTH_SHORT).show()
                finish()
            }
            else{
                Toast.makeText(this, "Error adding note...", Toast.LENGTH_SHORT).show()
            }
        }
        else{
            var selectionArgs = arrayOf(id.toString())
            val ID = dbManager.update(values, "ID=?", selectionArgs)
            if (ID>0){
                Toast.makeText(this, "Note is added", Toast.LENGTH_SHORT).show()
                finish()
            }
            else{
                Toast.makeText(this, "Error adding note...", Toast.LENGTH_SHORT).show()
            }
        }
    }
}