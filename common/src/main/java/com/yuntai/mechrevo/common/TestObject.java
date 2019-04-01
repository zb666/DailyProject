package com.yuntai.mechrevo.common;

import android.os.Parcel;
import android.os.Parcelable;

public class TestObject implements Parcelable {
    public String name;
    public int age;

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeInt(this.age);
    }

    public TestObject() {
    }

    protected TestObject(Parcel in) {
        this.name = in.readString();
        this.age = in.readInt();
    }

    public static final Parcelable.Creator<TestObject> CREATOR = new Parcelable.Creator<TestObject>() {
        @Override
        public TestObject createFromParcel(Parcel source) {
            return new TestObject(source);
        }

        @Override
        public TestObject[] newArray(int size) {
            return new TestObject[size];
        }
    };

    @Override
    public String toString() {
        return "TestObject{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
