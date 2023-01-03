package com.kaankarakas.planetapplication
import android.util.SparseBooleanArray
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.ImageView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.ListAdapter


class TaskItemAdapter(private val planets: Array<PlanetData>)
    : ListAdapter<PlanetData, TaskItemAdapter.TaskItemViewHolder>(PlanetDiffListCallback()) {
    private lateinit var _listener: TaskItemAdapter.OnClickListener

    interface OnClickListener {
        fun onClick(position: Int)
    }

    fun setOnItemClickListener(listener: OnClickListener) {
        _listener = listener
    }




    override fun getItemCount() = planets.size



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):TaskItemViewHolder{
        val layoutInflater =LayoutInflater.from(parent.context)
        val view = layoutInflater
            .inflate(R.layout.task_item, parent, false) as CardView

        return TaskItemViewHolder(view,_listener)
    }


    override fun onBindViewHolder(holder: TaskItemViewHolder, position: Int) {
        val planet = planets[position]
        holder.planetName.text = planet.planetNames
        holder.distance.text = planet.planetDistances
        holder.surface.text = planet.planetSurfaces
        holder.diamater.text = planet.planetDiameters
        holder.image.setImageDrawable(planet.planetImage.drawable)

    }

    inner class TaskItemViewHolder(View: View, listener: OnClickListener):RecyclerView.ViewHolder(View){
        var planetName: TextView
        var distance: TextView
        var surface: TextView
        var diamater: TextView
        var image: ImageView
        init {
            planetName = View.findViewById(R.id.planet_name)
            distance =  View.findViewById(R.id.distance_text)
            surface = View.findViewById(R.id.surface_text)
            diamater = View.findViewById(R.id.diameter_text)
            image = View.findViewById(R.id.image)


            image.setOnClickListener {
                listener.onClick(bindingAdapterPosition)
            }
        }
    }
}