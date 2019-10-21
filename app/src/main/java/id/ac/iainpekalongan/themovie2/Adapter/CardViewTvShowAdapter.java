package id.ac.iainpekalongan.themovie2.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

import id.ac.iainpekalongan.themovie2.R;
import id.ac.iainpekalongan.themovie2.Model.TVShow;
import id.ac.iainpekalongan.themovie2.TVShowDetailActivity;

public class CardViewTvShowAdapter extends RecyclerView.Adapter<CardViewTvShowAdapter.CardViewViewHolder> {

    private Context context;
    private ArrayList<TVShow> listTvShow;

    public CardViewTvShowAdapter(Context context) {
        this.context = context;
    }
    public ArrayList<TVShow> getListTvShow() {
        return listTvShow;
    }

    public void setListTvShow(ArrayList<TVShow> listTvShow) {
        this.listTvShow = listTvShow;
    }


    @NonNull
    @Override
    public CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_cardview_tv_show, viewGroup, false);
        return new CardViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewViewHolder cardViewViewHolder, int position) {
        TVShow tvShow = getListTvShow().get(position);
        Glide.with(context)
                .load(tvShow.getPhoto())
                .apply(new RequestOptions().override(350, 550))
                .into(cardViewViewHolder.imgPhoto);

        cardViewViewHolder.tvTitle.setText(tvShow.getTitle());
        cardViewViewHolder.tvDescription.setText(tvShow.getDescription());
    }

    @Override
    public int getItemCount() {
        return getListTvShow().size();
    }

    class CardViewViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        ImageView imgPhoto;
        TextView tvTitle, tvDescription;

        CardViewViewHolder(@NonNull final View itemView) {
            super(itemView);

            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvTitle = itemView.findViewById(R.id.tv_item_title);
            tvDescription = itemView.findViewById(R.id.tv_item_description);

            itemView.setOnClickListener(this);

        }

        @Override
        public void onClick(View v) {
            int position = getAdapterPosition();
            TVShow tvShow = getListTvShow().get(position);

            tvShow.setTitle(tvShow.getTitle());
            tvShow.setDescription(tvShow.getDescription());

            Intent moveWithObjectIntent = new Intent(itemView.getContext(), TVShowDetailActivity.class);
            moveWithObjectIntent.putExtra(TVShowDetailActivity.EXTRA_TV_SHOW, tvShow);
            context.startActivity(moveWithObjectIntent);
        }
    }
}
