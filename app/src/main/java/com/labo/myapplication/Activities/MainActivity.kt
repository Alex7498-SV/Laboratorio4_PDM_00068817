package com.labo.myapplication.Activities

import android.graphics.Movie
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.labo.myapplication.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var movieAdapter: MovieAdapter
    private lateinit var viewManager: RecyclerView.LayoutManager

    private var movieList: ArrayList<Movie> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        initRecyclerView()




    }

    fun initRecyclerView(){
        viewManager = LinearLayoutManager(this)

        movieAdapter = MovieAdapter(movieList, {movieItem: Movie -> movieItemClicked(movieItem)})

        movie_list_rv.apply{
            setHasFixedSize(true)
            layoutManager = viewManager
            adapter = movieAdapter
        }
    }
}
