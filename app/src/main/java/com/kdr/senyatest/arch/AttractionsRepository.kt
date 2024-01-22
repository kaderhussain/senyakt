package com.kdr.senyatest.arch

import android.content.Context
import com.kdr.senyatest.R
import com.kdr.senyatest.data.Attraction
import com.kdr.senyatest.data.AttractionsResponse
import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory

class AttractionsRepository {

    private val moshi = Moshi.Builder().addLast(KotlinJsonAdapterFactory()).build()

    fun parseAttractions(context: Context): ArrayList<Attraction> {

        val textFromFile =
            context.resources.openRawResource(R.raw.croatia).bufferedReader().use { it.readText() }
        val adapter: JsonAdapter<AttractionsResponse> =
            moshi.adapter(AttractionsResponse::class.java)

        return adapter.fromJson(textFromFile)!!.attractions as ArrayList<Attraction>
    }
}