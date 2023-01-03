package com.kaankarakas.planetapplication

import android.os.Bundle
import android.util.SparseBooleanArray
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import androidx.core.util.forEach
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class PlanetListFragment : Fragment() {

    private var layoutManager : RecyclerView.LayoutManager? = null
    private var adapter :RecyclerView.Adapter<TaskItemAdapter.TaskItemViewHolder>? =null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_planet_list, container, false)

        val rycler = view.findViewById<RecyclerView>(R.id.tasks_list)

        layoutManager = LinearLayoutManager(context)
        rycler.layoutManager = layoutManager

        val earthImageView = ImageView(context)
        earthImageView.setImageResource(R.drawable.earth)

        val plutoImageView = ImageView(context)
        plutoImageView.setImageResource(R.drawable.pluto)

        val jupiterImageView = ImageView(context)
        jupiterImageView.setImageResource(R.drawable.jupiter)

        val marsImageView = ImageView(context)
        marsImageView.setImageResource(R.drawable.mars)

        val planets = arrayOf(
            PlanetData("Earth", "150 Million KM", "10 N/kg", "12750 KM",earthImageView),
            PlanetData("Jupiter", "778 Million KM", "26 N/kg", "143000 KM",jupiterImageView),
            PlanetData("Mars", "228 Million KM", "4 N/kg", "6800 KM",marsImageView),
            PlanetData("Pluto", "5900 Million KM", "1 N/kg", "2320 KM",plutoImageView)
        )
        var checkedId:Int

        adapter = TaskItemAdapter(planets)
        rycler.adapter = adapter

        (adapter as TaskItemAdapter).setOnItemClickListener(object : TaskItemAdapter.OnClickListener {
            override fun onClick(position: Int) {
                checkedId = position
                val action = PlanetListFragmentDirections
                    .actionPlanetListFragmentToClickedPlanet(planets[checkedId].planetNames,checkedId)
                findNavController().navigate(action)
            }
        })
        return view
    }

}
