package com.kaankarakas.planetapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.lifecycle.ViewModelProvider
import com.kaankarakas.planetapplication.databinding.FragmentClickedPlanetBinding

class ClickedPlanet : Fragment() {
    private var _binding: FragmentClickedPlanetBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding=FragmentClickedPlanetBinding.inflate(inflater, container, false)
        val view = binding.root

        val name =ClickedPlanetArgs.fromBundle(requireArguments()).planetName
        val Id =ClickedPlanetArgs.fromBundle(requireArguments()).planetId
        val image = ImageView(context)
        image.setImageResource(R.drawable.earth)
        when{
            Id == 0 ->image.setImageResource(R.drawable.earth)
            Id == 1 ->image.setImageResource(R.drawable.jupiter)
            Id == 2 ->image.setImageResource(R.drawable.mars)
            Id == 3 ->image.setImageResource(R.drawable.pluto)
        }

        var imageView = view.findViewById<ImageView>(R.id.imageView)
        imageView.setImageDrawable(image.drawable)

        val viewModelFactory = ClickedPlanetViewModelFactory(Id,name)
        val viewModel = ViewModelProvider(this, viewModelFactory)
            .get(ClickedPlanetViewModel::class.java)

        binding.viewModel = viewModel
        binding.lifecycleOwner = viewLifecycleOwner

        return view
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}