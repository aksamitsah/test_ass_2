package me.aksamitsah.test_asc;


import android.os.Parcel;
import android.os.Parcelable;

public class Student implements Parcelable {
    public static final Creator<Student> CREATOR = new Creator<Student>() {
        @Override
        public Student createFromParcel(Parcel in) {
            return new Student(in);
        }

        @Override
        public Student[] newArray(int size) {
            return new Student[size];
        }
    };
    String firstname;
    String lastname;
    String contact;
    String address;

    public Student(String firstname, String lastname, String contact, String address) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.contact = contact;
        this.address = address;
    }

    protected Student(Parcel in) {
        firstname = in.readString();
        lastname = in.readString();
        contact = in.readString();
        address = in.readString();
    }

    public String getFirstname() {
        return firstname;
    }


    public String getLastname() {
        return lastname;
    }


    public String getContact() {
        return contact;
    }


    public String getAddress() {
        return address;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(firstname);
        dest.writeString(lastname);
        dest.writeString(contact);
        dest.writeString(address);
    }
}
