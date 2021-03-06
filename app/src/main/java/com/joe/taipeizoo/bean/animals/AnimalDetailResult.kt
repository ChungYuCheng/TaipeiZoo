package com.joe.taipeizoo.bean.animals

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class AnimalDetailResult(
    val A_Behavior: String,
    val A_Distribution: String,
    val A_Voice03_URL: String,
    val A_POIGroup: String,
    val A_Code: String,
    val A_Pic04_ALT: String,
    val A_Voice03_ALT: String,
    val A_Theme_URL: String,
    val A_Summary: String,
    val A_Update: String,
    val A_Pic02_URL: String,
    val A_pdf01_ALT: String,

    @SerializedName("\uFEFFA_Name_Ch")
    val A_Name_Ch: String,

    val A_Theme_Name: String,
    val A_pdf02_ALT: String,
    val A_Family: String,
    val A_Adopt: String,
    val A_Voice01_ALT: String,
    val A_Pic02_ALT: String,
    val A_Vedio_URL: String,
    val A_Pic04_URL: String,
    val A_Order: String,
    val A_pdf01_URL: String,
    val A_Voice02_ALT: String,
    val A_Diet: String,
    val A_Name_Latin: String,
    val A_Feature: String,
    val A_Habitat: String,
    val A_Phylum: String,
    val A_Class: String,
    val A_Pic03_ALT: String,
    val A_AlsoKnown: String,
    val A_Voice02_URL: String,
    val A_Name_En: String,
    val A_Pic03_URL: String,
    val A_Interpretation: String,
    val A_Location: String,
    val A_Voice01_URL: String,
    val A_pdf02_URL: String,
    val A_CID: String,
    val A_Keywords: String,
    val A_Pic01_URL: String,
    val A_Conservation: String,
    val A_Pic01_ALT: String,
    val _id: Int,
    val A_Geo: String,
    val A_Crisis: String
) : Parcelable