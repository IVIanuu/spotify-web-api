package com.ivianuu.spotifywebapi.model;

import android.os.Parcel;
import android.os.Parcelable;

public class Cursor implements Parcelable {
    public static final Creator<Cursor> CREATOR = new Creator<Cursor>() {
        public Cursor createFromParcel(Parcel source) {
            return new Cursor(source);
        }

        public Cursor[] newArray(int size) {
            return new Cursor[size];
        }
    };
    public String after;

    public Cursor() {
    }

    protected Cursor(Parcel in) {
        this.after = in.readString();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.after);
    }
}
