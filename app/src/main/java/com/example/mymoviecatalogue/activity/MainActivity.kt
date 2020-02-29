package com.example.mymoviecatalogue.activity

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView

import com.example.mymoviecatalogue.R
import com.example.mymoviecatalogue.adapter.ListMovieAdapter
import com.example.mymoviecatalogue.model.Movie
import com.example.mymoviecatalogue.model.MoviesData
import kotlinx.android.synthetic.main.activity_main.*

import java.util.ArrayList

class MainActivity : AppCompatActivity() {


    private var movies: ArrayList<Movie>? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (supportActionBar != null) {
            supportActionBar!!.title = "Movie Catalogue"
        }

        val adapter = ListMovieAdapter(this)
        val movies = MoviesData.getListData()

        lv_movies.adapter = adapter

        adapter.setMovies(movies)
        lv_movies.onItemClickListener = AdapterView.OnItemClickListener { _, _, position, id ->
            val intent = Intent(applicationContext, DetailMovieActivity::class.java)
            intent.putExtra(DetailMovieActivity.EXTRA_MOVIE, movies!![position])
            startActivity(intent)
        }
    }
}
