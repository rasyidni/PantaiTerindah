package id.co.apprasyid.myapplication

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import id.co.apprasyid.myapplication.databinding.ItemPantaiBinding

class PantaiAdapter (private val list: ArrayList<Pantai>): RecyclerView.Adapter<PantaiAdapter.PantaiViewHolder>() {
    inner class PantaiViewHolder (binding: ItemPantaiBinding) : RecyclerView.ViewHolder(binding.root) {
        var pantaiName: TextView = binding.pantaiName
        var pantaiDetails: TextView = binding.pantaiDetails
        var pantaiPhoto: ImageView = binding.pantaiPhoto
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PantaiViewHolder {
        val binding = ItemPantaiBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return PantaiViewHolder(binding)
    }

    override fun onBindViewHolder(holder: PantaiViewHolder, position: Int) {
        val pantai = list[position]

        holder.pantaiName.text = pantai.name
        holder.pantaiDetails.text = pantai.detail

        Glide.with(holder.itemView.context)
            .load(pantai.photo)
            .apply(RequestOptions().override(100, 100))
            .into(holder.pantaiPhoto)
    }

    override fun getItemCount(): Int {
        return list.size
    }
}