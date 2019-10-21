package id.ac.iainpekalongan.themovie2.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



import java.util.ArrayList;

import id.ac.iainpekalongan.themovie2.Adapter.CardViewTvShowAdapter;
import id.ac.iainpekalongan.themovie2.R;
import id.ac.iainpekalongan.themovie2.Model.TVShow;
import id.ac.iainpekalongan.themovie2.TVShowData;

/**
 * A simple {@link Fragment} subclass.
 */
public class TVShowFragment extends Fragment {
    private RecyclerView rvTvShow;
    private ArrayList<TVShow> list = new ArrayList<>();


    public TVShowFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tvshow,container,false);
        rvTvShow = view.findViewById(R.id.rv_tvShow);
        rvTvShow.setHasFixedSize(true);

        list.addAll(TVShowData.getListData());
        showRecyclerTvShow();

        return view;
    }

    private void showRecyclerTvShow(){
        rvTvShow.setLayoutManager(new LinearLayoutManager(this.getContext()));
        CardViewTvShowAdapter cardViewTvShowAdapter = new CardViewTvShowAdapter(this.getContext());
        cardViewTvShowAdapter.setListTvShow(list);
        rvTvShow.setAdapter(cardViewTvShowAdapter);
    }
}
