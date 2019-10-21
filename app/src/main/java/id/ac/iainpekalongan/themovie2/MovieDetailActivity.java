package id.ac.iainpekalongan.themovie2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import id.ac.iainpekalongan.themovie2.Model.Movies;

public class MovieDetailActivity extends AppCompatActivity {
    public static final String EXTRA_MOVIE = "extra_movie";
    TextView tvTitle, tvDescription;

    ImageView imagePoster;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        tvTitle = findViewById(R.id.tv_item_title);
        tvDescription = findViewById(R.id.tv_item_description);
        imagePoster = findViewById(R.id.poster);

        Movies movie = getIntent().getParcelableExtra(EXTRA_MOVIE);

        tvTitle.setText(movie.getTitle());
        tvDescription.setText(movie.getDescription());


        Glide.with(this)
                .load(movie.getPhoto())
                .apply(new RequestOptions().override(350, 550))
                .into(imagePoster);

    }

}
