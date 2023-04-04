package com.example.myapplication;

public class Places {
    private String name;
    private int imageID;

    public static final Places[] place = {
            new Places("DryClean", R.drawable.dry),
            new Places("Dorms(سكنات)", R.drawable.dorms),
            new Places("resturant", R.drawable.resturant),
            new Places("beaytyCenter", R.drawable.salon),
            new Places("SuperMarket", R.drawable.market),

    };
    private Places(String name, int imageID){
        this.name = name;
        this.imageID = imageID;
    }



    public String getName(){return name;}
    public int getImageID(){return imageID;}
}
