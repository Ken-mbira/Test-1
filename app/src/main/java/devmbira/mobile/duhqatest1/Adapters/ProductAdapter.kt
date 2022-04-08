package devmbira.mobile.duhqatest1.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import devmbira.mobile.duhqatest1.Product
import devmbira.mobile.duhqatest1.R

class ProductAdapter(val context:Context, private val products:ArrayList<Product>,
                        private val listener: OnProductClickListener
                     ) :
    RecyclerView.Adapter<ProductAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(context).inflate(
                R.layout.custom_product_card,
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int {
        return products.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val product = products[position]
        holder.product_name.text = product.name
        holder.product_description.text = product.description
        holder.product_image.setImageResource(product.image1)
        holder.product_price.text = product.price


    }

    inner class ViewHolder(view:View): RecyclerView.ViewHolder(view),
    View.OnClickListener{
        val product_name:TextView = view.findViewById(R.id.product_name)
        val product_description:TextView = view.findViewById(R.id.product_description)
        val product_image:ImageView = view.findViewById(R.id.product_image)
        val product_price:TextView = view.findViewById(R.id.product_price)
        val product_item:CardView = view.findViewById(R.id.product_item)

        init {
            view.setOnClickListener(this)
        }

        override fun onClick(p0: View?) {
            val position:Int = adapterPosition
            if(position != RecyclerView.NO_POSITION){
                listener.onProductClick(position)
            }
        }
    }
    interface OnProductClickListener{
        fun onProductClick(position:Int)
    }
}