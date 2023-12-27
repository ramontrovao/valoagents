package dev.ramontrovao.contacthub

import android.content.Intent
import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private val contactsList = listOf(Contact(1, "Eu", R.drawable.contact1, "27995785613"))

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val contactsView = findViewById<ListView>(R.id.contactsView)

        val contactsAdapter = ContactsAdapter(this, contactsList)
        contactsView.adapter = contactsAdapter

        contactsView.setOnClickListener {
            val intent = Intent(this@MainActivity, ContactActivity::class.java)
            startActivity(intent)
        }
    }
}