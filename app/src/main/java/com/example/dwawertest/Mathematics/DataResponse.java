package com.example.dwawertest.Mathematics;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by SEBASTIAN on 6/29/2018.
 */
public class DataResponse{
    @SerializedName("status")
    private String status;
    @SerializedName("images")
    List<Images>Images;

    public List<com.example.dwawertest.Mathematics.Images> getImages() {
        return Images;
    }

    public String getStatus() {
        return status;
    }
}
class Images{
    @SerializedName("id")
    private String Imageid;
    @SerializedName("image_path")
    private  String Imagepath;
    @SerializedName("image_path")
    private  String details;

    public String getDetails() {
        return details;
    }

    public String getImageid() {
        return Imageid;
    }

    public String getImagepath() {
        return Imagepath;
    }
}

