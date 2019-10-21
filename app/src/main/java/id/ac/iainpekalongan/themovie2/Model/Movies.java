package id.ac.iainpekalongan.themovie2.Model;

import android.os.Parcel;
import android.os.Parcelable;

import org.json.JSONObject;

public class Movies implements Parcelable {


    private String title;
    private String description;
    private String photo;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.title);
        dest.writeString(this.description);
        dest.writeString(this.photo);
    }

    public Movies() {
    }

    protected Movies(Parcel in) {
        this.title = in.readString();
        this.description = in.readString();
        this.photo = in.readString();
    }

    public static final Creator<Movies> CREATOR = new Creator<Movies>() {
        @Override
        public Movies createFromParcel(Parcel source) {
            return new Movies(source);
        }

        @Override
        public Movies[] newArray(int size) {
            return new Movies[size];
        }
    };
}
