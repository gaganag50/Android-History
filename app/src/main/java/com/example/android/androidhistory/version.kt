package com.example.android.androidhistory

import android.content.res.Resources

data class version(
        val imageResId: Int,
        val versionName: String,
        val versionNumber: String,
        val APILevel: String
)


fun populateList(): ArrayList<version> {
    val androidVersions = ArrayList<version>(13)

    androidVersions.add(version(
            R.drawable.cupcake,
            "Cupcake",
            "1.5",
            "3"
    ))



    androidVersions.add(version(
            R.drawable.donut,
            "Donut",
            "1.6",
            "4"
    ))






    androidVersions.add(version(
            R.drawable.eclair,
            "Eclair",
            "2.0 - 2.1",
            "5 – 7"
    ))






    androidVersions.add(version(
            R.drawable.froyo,
            "Froyo",
            "2.2 - 2.2.3",
            "8"
    ))






    androidVersions.add(version(
            R.drawable.gingerbread,
            "GingerBread",
            "2.3 - 2.3.7",
            "9 – 10"
    ))







    androidVersions.add(version(
            R.drawable.honeycomb,
            "HoneyComb",
            "3.0 - 3.2.6",
            "11 – 13"
    ))





    androidVersions.add(version(
            R.drawable.icecream,
            "IceCreamSandwich",
            "4.0 - 4.0.4",
            "14 – 15"
    ))






    androidVersions.add(version(
            R.drawable.jellybeans,
            "JellyBean",
            "4.1 - 4.3.1",
            "16 – 18"
    ))





    androidVersions.add(version(
            R.drawable.kitkat,
            "Kitkat",
            "4.4 – 4.4.4",
            "19 – 20"
    ))







    androidVersions.add(version(
            R.drawable.lollipop,
            "Lollipop",
            "5.0 – 5.1.1",
            "21 – 22"
    ))






    androidVersions.add(version(
            R.drawable.marshmallow,
            "Marshmallow",
            "6.0 – 6.0.1",
            "23"
    ))






    androidVersions.add(version(
            R.drawable.nougat,
            "Nougat",
            "7.0 – 7.1.2",
            "24 – 25"
    ))


    androidVersions.add(version(
            R.drawable.oreo,
            "Oreo",
            "8.0 – 8.1",
            "26 – 27"
    ))


    return androidVersions
}
