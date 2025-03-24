package com.example.app5

import android.os.Parcel
import android.os.Parcelable

data class Person(
    val lastName: String,
    val firstName: String,
    val patronymic: String?
):Parcelable {
    constructor(parcel: Parcel): this(
        parcel.readString()?:"",
        parcel.readString()?:"",
        parcel.readString(),

    )

    override fun describeContents(): Int = 0

    override fun writeToParcel(parcel: Parcel, p1: Int) {
        parcel.writeString(lastName)
        parcel.writeString(firstName)
        parcel.writeString(patronymic)
    }

    companion object CREATOR : Parcelable.Creator<Person> {
        override fun createFromParcel(parcel: Parcel): Person {
            return Person(parcel)
        }

        override fun newArray(size: Int): Array<Person?> {
            return arrayOfNulls(size)
        }
    }


}