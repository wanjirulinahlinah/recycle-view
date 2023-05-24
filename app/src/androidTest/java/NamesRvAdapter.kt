import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.RecycledViewPool
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.recycleviews.R.
import com.example.recycleviews.R.Companion



class NamesRvAdapter (var namesList: List<String>):RecyclerView.Adapter<NamesViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NamesViewHolder {
        var itemView= LayoutInflater.from(parent.context)
            .inflate(R.layout.javaClass,parent,false)
        return NamesViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: NamesViewHolder, position: Int) {
       var currentName = namesList.get(position)
        holder.tvName.text = currentName
    }

    override fun getItemCount(): Int {
      return  namesList.size
    }
}

private fun LayoutInflater.inflate(javaClass: Class<Any>, parent: ViewGroup, b: Boolean): View {

}

private fun LayoutInflateinflate(javaClass: Class<Any>, parent: ViewGroup, b: Boolean): View {

}

class NamesViewHolder(itemView:View):ViewHolder(itemView){
    var tvName = itemView.findViewById<TextView>(R.id.)
}