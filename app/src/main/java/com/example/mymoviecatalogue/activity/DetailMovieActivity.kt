package com.example.mymoviecatalogue.activity

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

import com.example.mymoviecatalogue.R
import com.example.mymoviecatalogue.model.Movie
import kotlinx.android.synthetic.main.activity_detail_movie.*

class DetailMovieActivity : AppCompatActivity(), View.OnClickListener {

    private var movie: Movie? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_movie)
        back_button.setOnClickListener(this)

        movie = intent.getParcelableExtra(EXTRA_MOVIE)

        val splitDate = movie!!.date.split(", ".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
        val year = " (" + splitDate[1] + ")"
        val appendTitle = movie!!.title + year
        tv_details_title.text = appendTitle
        tv_details_date.text = movie!!.date
        tv_details_genre.text = movie!!.genre
        tv_details_rating.text = movie!!.rating
        tv_details_director.text = movie!!.director
        tv_details_cast.text = movie!!.cast
        tv_details_synopsis.text = movie!!.synopsis
        img_details_photo.setImageResource(resources.getIdentifier(movie!!.drawable, null, packageName))
        tv_details_imdburl.text = movie!!.imdb_url
        tv_details_tmdburl.text = movie!!.moviedb_url

        tv_details_imdburl.setOnClickListener(this)
        tv_details_tmdburl.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.tv_details_imdburl -> {
                val imdbLink = movie!!.imdb_url
                startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(imdbLink)))
            }
            R.id.tv_details_tmdburl -> {
                val tmdbLink = movie!!.moviedb_url
                startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(tmdbLink)))
            }
            R.id.back_button -> onBackPressed()
        }
    }
    companion object {
        var EXTRA_MOVIE = "EXTRA_MOVIE"
    }
}
