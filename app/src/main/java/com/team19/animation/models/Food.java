package com.team19.animation.models;

import android.os.Parcel;
import android.os.Parcelable;

import java.net.URL;

public class Food implements Parcelable {
    private String name;
    private String description;
    private int price;
    private String category;
    private int foodImage;

    public Food() {
    }

    public Food(String name, String description, int price, String category,int  foodImage) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.foodImage = foodImage;
        this.category = category;
    }

    protected Food(Parcel in) {
        name = in.readString();
        description = in.readString();
        price = in.readInt();
        category = in.readString();
        foodImage = in.readInt();
    }

    public static final Creator<Food> CREATOR = new Creator<Food>() {
        @Override
        public Food createFromParcel(Parcel in) {
            return new Food(in);
        }

        @Override
        public Food[] newArray(int size) {
            return new Food[size];
        }
    };

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getPrice() {
        return price;
    }

    public String getCategory(){
        return category;
    }



    public int getFoodImage() {
        return foodImage;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setCategory(String category){
        this.category = category;
    }

    public void setFoodImage(int foodImage) {
        this.foodImage = foodImage;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(description);
        dest.writeInt(price);
        dest.writeString(category);
        dest.writeInt(foodImage);
    }
}
