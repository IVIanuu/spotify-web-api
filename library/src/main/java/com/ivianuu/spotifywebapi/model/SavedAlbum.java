/*
 * Copyright 2017 Manuel Wrage
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.ivianuu.spotifywebapi.model;

import android.os.Parcelable;

import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

@AutoValue
public abstract class SavedAlbum implements Parcelable {

    public abstract String added_at();
    public abstract Album album();

    public static Builder builder() {
        return new AutoValue_SavedAlbum.Builder();
    }

    public static TypeAdapter<SavedAlbum> typeAdapter(Gson gson) {
        return new AutoValue_SavedAlbum.GsonTypeAdapter(gson);
    }

    @AutoValue.Builder
    public abstract static class Builder {
        public abstract Builder added_at(String __);
        public abstract Builder album(Album __);
        public abstract SavedAlbum build();
    }
}