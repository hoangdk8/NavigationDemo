package com.example.navigationdemo

import android.os.Parcel
import android.os.Parcelable

data class DataObject(val name: String, val age: Int) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString() ?: "",
        parcel.readInt()
    )

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(name)
        parcel.writeInt(age)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<DataObject> {
        override fun createFromParcel(parcel: Parcel): DataObject {
            return DataObject(parcel)
        }

        override fun newArray(size: Int): Array<DataObject?> {
            return arrayOfNulls(size)
        }
    }
}