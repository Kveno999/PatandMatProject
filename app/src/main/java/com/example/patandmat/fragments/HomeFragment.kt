package com.example.patandmat.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.models.SlideModel
import com.example.patandmat.MainActivity
import com.example.patandmat.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val view = binding.root

        val activity = requireActivity() as? MainActivity
        activity?.showToolBar()
        activity?.supportActionBar?.show()
        activity?.supportActionBar?.setDisplayHomeAsUpEnabled(true)

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        imageSlider()

    }
    fun imageSlider() {
        val imageSlider = binding.ImageSlider
        val imageList = ArrayList<SlideModel>()

        imageList.add(SlideModel("https://lh3.googleusercontent.com/9i6tsD11CciEr9GCzrO7kfXsjSGdsCBDkssPQ1F0LxQeETyyaFBZcfe9nT5ud18dzIoK7zG8pjv9-7OAqNjISthQ6LXY3zClcvvF=w600" ,"Silver Boy"))
        imageList.add(SlideModel("https://lh3.googleusercontent.com/9mUO6gjP-NLm5ShOul-c6NkOR3-YwgBaCBfvuBnVqiFXy4SaFPT-Okdty6Rm3gz8EiqYY0TmO9p29F3VeNzSSDazzxeHptKd444DNA=w600", "Pirate"))
        imageList.add(SlideModel("https://lh3.googleusercontent.com/NgxLtBISmHl0VpuQuzWjBq588R4g10rvIhAD8TyEh7hXhHjB22xdTp8x17Op5Gcqw_da-Y1VKThVOcYRjyLoOCcv-YzNinmUzR5K=w600","Saitama"))
        imageList.add(SlideModel("https://lh3.googleusercontent.com/oRXzNzgzyuQ7hdIpdNOJQ4UFyWZNM-gdyTH6OWOusRA5Jw-4HmiIRYgFUOWbloSQ1Lyugnx4oZs6FjM-gqCTKDpSWW6HZprgb3afdw=w600","Strawberry Lover"))
        imageList.add(SlideModel("https://lh3.googleusercontent.com/XvDab05JYBUS39twn-0kAZYGkOaR5Oc1YOQp9xUw6MvEEfvHvQTqcd6ShRSUYGdt_iRX2cbJSmsra8LdqSfYu2hRLwkJIk1kzaIt=w600","Samurai"))



        imageSlider.setImageList(imageList, ScaleTypes.FIT)

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}