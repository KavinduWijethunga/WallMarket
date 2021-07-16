package com.example.wallmarket;

public class Model {

    private String imageUri;
   // private String category;
    private String description;

    public Model(String imageUri, String description) {
        this.imageUri = imageUri;
        //this.category = category;
        this.description = description;
    }

    public void setImageUri(String imageUri) {
        this.imageUri = imageUri;
    }



    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageUri() {
        return imageUri;
    }



    public String getDescription() {
        return description;
    }
}
