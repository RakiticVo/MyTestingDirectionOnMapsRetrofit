package com.example.mytestingdirectiononmaps;

import com.google.android.gms.maps.model.LatLng;

import io.reactivex.Single;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {
    @GET("maps/api/direction/json")
    Single<Result> getDirection(@Query("mode") String mode,
                                @Query("transit_routing_preference") String preference,
                                @Query("star") LatLng star,
                                @Query("end") LatLng end,
                                @Query("key") String key);
}
