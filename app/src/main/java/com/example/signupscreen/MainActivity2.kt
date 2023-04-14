package com.example.signupscreen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val listView= findViewById<RecyclerView>(R.id.recyclerView)
        val adapter = ListItemAdapter(this , generatePlayListe())
        listView.adapter = adapter
    }
}
fun generatePlayListe(): ArrayList<UserModel> {
    return arrayListOf(
        UserModel(
            "1",
            "L",
            "A",
            "Z",
            "Male",
            "1999",
            AdressModel("fgbhjh", 1, "fhjk", "fxgfchjbk"),
            CompanyModel("fgbhjh", "fhjk", "fxgfchjbk"),
            "sfdgf",
            "sfdg",
        ),
    )
}