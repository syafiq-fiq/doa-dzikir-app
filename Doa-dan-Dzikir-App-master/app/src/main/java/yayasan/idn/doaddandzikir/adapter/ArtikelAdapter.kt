package yayasan.idn.doaddandzikir.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import yayasan.idn.doaddandzikir.DetailArtikelActivity
import yayasan.idn.doaddandzikir.R
import yayasan.idn.doaddandzikir.helper.OnItemClickCallback
import yayasan.idn.doaddandzikir.model.Artikel

class ArtikelAdapter(private val listArtikel: ArrayList<Artikel>) :
    RecyclerView.Adapter<ArtikelAdapter.MyViewHolder>() {

    private lateinit var onItemClickCallback: OnItemClickCallback

//    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
//        this.onItemClickCallback = onItemClickCallback
//    }

    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val imgArtikel: ImageView = view.findViewById(R.id.img_artikel)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = MyViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.fragment_artikel, parent, false)
    )

    override fun getItemCount() = listArtikel.size

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val holderImage = holder.imgArtikel
        holderImage.apply {
            setImageResource(listArtikel[position].imageArtikel)
            setOnClickListener {
                val intent = Intent(context, DetailArtikelActivity::class.java)
                intent.putExtra(DetailArtikelActivity.DATA_TITLE, listArtikel[position].titleArtikel)
                intent.putExtra(DetailArtikelActivity.DATA_DESC, listArtikel[position].descArtikel)
                intent.putExtra(DetailArtikelActivity.DATA_IMAGE, listArtikel[position].imageArtikel)
                context.startActivity(intent)
            }
        }
    }
}