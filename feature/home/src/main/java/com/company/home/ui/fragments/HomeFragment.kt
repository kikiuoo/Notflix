package com.company.home.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.company.home.R
import com.company.home.databinding.FragmentHomeBinding
import com.vickikbt.notflix.util.OnClick
import com.vickikbt.notflix.util.StateListener
import com.vickikbt.notflix.util.log
import com.vickikbt.notflix.util.toast
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeFragment : Fragment(), StateListener, OnClick {

    private lateinit var binding: FragmentHomeBinding
    private val viewModel by viewModels<HomeViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false)
        viewModel.stateListener = this

        //initUI()

        return binding.root
    }

    /*private fun initUI() {

        //TODO: Loads up trending movies list to viewpager adapter
        viewModel.upcomingMovies.observe(viewLifecycleOwner, { result ->
            binding.viewPagerTrendingShows.adapter =
                HomeViewPagerAdapter(requireActivity(), result.movies!!)
            binding.dotsTrendingShows.setViewPager(binding.viewPagerTrendingShows)
        })

        //Loads up popular movies list to recyclerview adapter
        viewModel.popularMovies.observe(viewLifecycleOwner, { result ->
            binding.recyclerviewPopularMovies.adapter =
                PopularShowsRecyclerviewAdapter(result.movies!!, this)
        })

        //TODO: Loads up top rated movies list to recyclerview adapter
        viewModel.upcomingMovies.observe(viewLifecycleOwner, { result ->
            binding.recyclerviewTopRatedMovies.adapter =
                TopRatedShowsRecyclerviewAdapter(result.movies!!, this)
        })

        //Loads up popular tv shows list to recyclerview adapter
        viewModel.upcomingMovies.observe(viewLifecycleOwner, { result ->
            binding.recyclerviewPopularTvShows.adapter =
                PopularShowsRecyclerviewAdapter(result.movies!!, this)
        })

        //Loads up top rated tv shows list to recyclerview adapter
        *//*viewModel.popularMovies.observe(viewLifecycleOwner, { result ->
            binding.recyclerviewTopRatedTvShows.adapter =
                TopRatedShowsRecyclerviewAdapter(result.movies, this)
        })*//*


    }*/

    override fun onClick(movieId: Int) {
        //val action = HomeFragmentDirections.homeToMovieDetails(movieId)
        //findNavController().navigate(action)
    }


    override fun onLoading() {
        requireActivity().log("Loading...")
    }

    override fun onSuccess(message: String) {
        requireActivity().log(message)
    }

    override fun onError(message: String?) {
        requireActivity().toast(message!!)
        requireActivity().log(message)
    }

}