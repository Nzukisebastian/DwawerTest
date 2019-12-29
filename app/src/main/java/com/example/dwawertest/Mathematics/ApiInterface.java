package com.example.dwawertest.Mathematics;

import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by SEBASTIAN on 6/29/2018.
 */
public interface ApiInterface {
    @GET("getimagetest.php")
    Call<List<DataResponse>> getImages(@Query("page_number")int page,@Query("item_count")int items);
}

