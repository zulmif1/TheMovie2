package id.ac.iainpekalongan.themovie2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import id.ac.iainpekalongan.themovie2.Model.TVShow;

public class TVShowDetailActivity extends AppCompatActivity {
    public static final String EXTRA_TV_SHOW = "extra_tvShow";
    TextView tvTitle,tvDesctiption;

    ImageView imagePoster;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        tvTitle = findViewById(R.id.tv_item_title);
        tvDesctiption = findViewById(R.id.tv_item_description);

        imagePoster = findViewById(R.id.poster);

        TVShow tvShow = getIntent().getParcelableExtra(EXTRA_TV_SHOW);

        tvTitle.setText(tvShow.getTitle());
        tvDesctiption.setText(tvShow.getDescription());


        Glide.with(this)
                .load(tvShow.getPhoto())
                .apply(new RequestOptions().override(350, 550))
                .into(imagePoster);
    }
}
