package com.ivianuu.spotifywebapi.model;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.List;

public class TracksToRemoveByPosition implements Parcelable {

    public static final Parcelable.Creator<TracksToRemoveByPosition> CREATOR = new Parcelable.Creator<TracksToRemoveByPosition>() {

        @Override
        public TracksToRemoveByPosition createFromParcel(Parcel parcel) {
            return new TracksToRemoveByPosition(parcel);
        }

        @Override
        public TracksToRemoveByPosition[] newArray(int i) {
            return new TracksToRemoveByPosition[i];
        }
    };

    public List<Integer> positions;
    public String snapshot_id;

    public TracksToRemoveByPosition() {
    }

    public TracksToRemoveByPosition(Parcel in) {
        this.positions = new ArrayList<>();
        in.readList(this.positions, List.class.getClassLoader());
        this.snapshot_id = in.readString();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(positions);
        parcel.writeString(snapshot_id);
    }
}