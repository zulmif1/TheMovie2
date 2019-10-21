package id.ac.iainpekalongan.themovie2.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



import java.util.ArrayList;

import id.ac.iainpekalongan.themovie2.Adapter.CardViewMoviesAdapter;
import id.ac.iainpekalongan.themovie2.Model.Movies;
import id.ac.iainpekalongan.themovie2.MovieData;
import id.ac.iainpekalongan.themovie2.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class MoviesFragment extends Fragment {

    private RecyclerView rvMovie;
    private ArrayList<Movies> list = new ArrayList<>();

    public MoviesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_movies,container,false);
        rvMovie = view.findViewById(R.id.rv_movie);
        rvMovie.setHasFixedSize(true);

        list.addAll(MovieData.getListData());
        showRecyclerMovie();

        return view;

    }

    private void showRecyclerMovie(){
        rvMovie.setLayoutManager(new LinearLayoutManager(this.getContext()));
        CardViewMoviesAdapter cardViewMoviesAdapter = new CardViewMoviesAdapter(this.getContext());
        cardViewMoviesAdapter.setListMovies(list);
        rvMovie.setAdapter(cardViewMoviesAdapter);
    }
}
