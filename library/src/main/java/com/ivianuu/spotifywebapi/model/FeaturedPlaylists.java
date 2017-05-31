package com.ivianuu.spotifywebapi.model;

import android.os.Parcel;
import android.os.Parcelable;

public class FeaturedPlaylists implements Parcelable {
    public static final Parcelable.Creator<FeaturedPlaylists> CREATOR = new Parcelable.Creator<FeaturedPlaylists>() {
        public FeaturedPlaylists createFromParcel(Parcel source) {
            return new FeaturedPlaylists(source);
        }

        public FeaturedPlaylists[] newArray(int size) {
            return new FeaturedPlaylists[size];
        }
    };
    public String message;
    public Pager<PlaylistSimple> playlists;

    public FeaturedPlaylists() {
    }

    protected FeaturedPlaylists(Parcel in) {
        this.message = in.readString();
        this.playlists = in.readParcelable(Pager.class.getClassLoader());
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.message);
        dest.writeParcelable(this.playlists, 0);
    }
}
