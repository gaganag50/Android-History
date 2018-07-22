package com.example.android.androidhistory

data class version(
        val imageResId: Int,
        val versionName: String,
        val versionNumber: String,
        val APILevel: String
)


fun populateList(context: MainActivity): ArrayList<version> {
    val androidVersions = ArrayList<version>(13)

    androidVersions.add(version(
            R.drawable.cupcake,
            context.getString(R.string.cupcake),
            context.getString(R.string.cupcakeVersionNumber),
            context.getString(R.string.cupcakeAPILevel)
    ))



    androidVersions.add(version(
            R.drawable.donut,
            context.getString(R.string.donut),
            context.getString(R.string.donutVersionNumber),
            context.getString(R.string.donutAPILevel)
    ))






    androidVersions.add(version(
            R.drawable.eclair,
            context.getString(R.string.eclair),
            context.getString(R.string.eclairVersionNumber),
            context.getString(R.string.eclairAPILevel)
    ))






    androidVersions.add(version(
            R.drawable.froyo,
            context.getString(R.string.froyo),
            context.getString(R.string.froyoVersionNumber),
            context.getString(R.string.froyoAPILevel)
    ))






    androidVersions.add(version(
            R.drawable.gingerbread,
            context.getString(R.string.gingerbread),
            context.getString(R.string.gingerbreadVersionNumber),
            context.getString(R.string.gingerbreadAPILevel)
    ))







    androidVersions.add(version(
            R.drawable.honeycomb,
            context.getString(R.string.honeycomb),
            context.getString(R.string.honeycombVersionNumber),
            context.getString(R.string.honeycombAPILevel)
    ))





    androidVersions.add(version(
            R.drawable.icecream,
            context.getString(R.string.icecreamsandwich),
            context.getString(R.string.icecreamsandwichVersionNumber),
            context.getString(R.string.icecreamAPILevel)
    ))






    androidVersions.add(version(
            R.drawable.jellybeans,
            context.getString(R.string.jellybean),
            context.getString(R.string.jellybeanVersionNumber),
            context.getString(R.string.jellybeansAPILevel)
    ))





    androidVersions.add(version(
            R.drawable.kitkat,
            context.getString(R.string.kitkat),
            context.getString(R.string.kitkatVersionNumber),
            context.getString(R.string.kitkatAPILevel)
    ))







    androidVersions.add(version(
            R.drawable.lollipop,
            context.getString(R.string.lollipop),
            context.getString(R.string.lollipopVersionNumber),
            context.getString(R.string.lollipopAPILevel)
    ))






    androidVersions.add(version(
            R.drawable.marshmallow,
            context.getString(R.string.marshmallow),
            context.getString(R.string.marshmallowVersionNumber),
            context.getString(R.string.marshmallowAPILevel)
    ))






    androidVersions.add(version(
            R.drawable.nougat,
            context.getString(R.string.nougat),
            context.getString(R.string.nougatVersionNumber),
            context.getString(R.string.nougatAPILevel)
    ))


    androidVersions.add(version(
            R.drawable.oreo,
            context.getString(R.string.oreo),
            context.getString(R.string.oreoVersionNumber),
            context.getString(R.string.oreoAPILevel)
    ))


    return androidVersions
}
