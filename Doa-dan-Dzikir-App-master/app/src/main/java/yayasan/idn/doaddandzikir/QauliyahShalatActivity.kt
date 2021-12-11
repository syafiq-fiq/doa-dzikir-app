package yayasan.idn.doaddandzikir

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import yayasan.idn.doaddandzikir.adapter.DzikirDoaAdapter
import yayasan.idn.doaddandzikir.model.DataDzikirDoa

class QauliyahShalatActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        setContentView(R.layout.activity_qauliyah_shalat)

        val rvQauliyah = findViewById<RecyclerView>(R.id.rv_qauliyah_shalat)
        rvQauliyah.layoutManager = LinearLayoutManager(this)

        rvQauliyah.adapter = DzikirDoaAdapter(DataDzikirDoa.listQauliyah)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }
}