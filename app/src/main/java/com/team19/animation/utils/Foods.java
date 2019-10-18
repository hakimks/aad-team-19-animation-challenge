package com.team19.animation.utils;

import com.team19.animation.R;
import com.team19.animation.models.Food;

public class Foods {
    public Food[] foods = {
            //Main_dishes
            Mustard_stuffed_chicken, Spicy_root_and_lentil_casserole, Chicken_biryani, chicken_chasseur
            , Oven_baked_risotto, Veggie_shepherds_pie, Hearty_pasta_soup, Crispy_Greek_style_pie
            , paella, salmon_with_roast_asparagus, Parmesan_spring_chicken

            //Desserts
            ,Profiterolesalted_toffee_ice_cream_sandwiches,Ultimate_lemon_meringue_pie
            ,Matcha_mousse_cake,No_cook_chocolate_tart,Strawberry_cheesecake,Almond_and_apple_tart
            ,Lavender_poached_pear_with_Poire_Williams_pudding,Pear_and_hazelnut_dartois
            ,Ultimate_crème_brûlée,Champagne_raspberry_possets,Chocolate_hazelnut_ice_cream_cheesecake
            ,Strawberry_and_elderflower_trifle,Luscious_lemon_baked_cheesecake

            //Drinks
            ,Old_Fashioned,Margarita,Cosmopolitan,Negroni,Moscow_Mule,Mojito,Whiskey_sour,Manhattan
            ,Mimosa,Gimlet
    };

    public static Food Mustard_stuffed_chicken = new Food("Mustard-stuffed chicken",getString(R.string.mustard_description),3340,"Main Meal", R.drawable.mustard);
    public static Food Spicy_root_and_lentil_casserole = new Food("Spicy root & lentil casserole",getString(R.string.spicy_description),4675,"Main Meal", R.drawable.spicyroot);
    public static Food Chicken_biryani = new Food("Chicken biryani",getString(R.string.biryani_description),3380,"Main Meal", R.drawable.chickenbiryani);
    public static Food chicken_chasseur = new Food("One-pot chicken chasseur",getString(R.string.chicken_chasseur_description),2098,"Main Meal", R.drawable.onepot);

}
