//package com.restApi.crime.db.CrimeDB.domain;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//
//@Entity
//public class User {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private Long mId;
//    private String mName;
//    private String mEmailAddress;
//    private String mPassword;
//    private String mPhoneNumber;
//    private byte gender;
//    private String mDateOfBirth;
//
//    public String getDateOfBirth() {
//        return mDateOfBirth;
//    }
//
//    public void setDateOfBirth(String dateOfBirth) {
//        mDateOfBirth = dateOfBirth;
//    }
//
//    public User(){
//        super();
//    }
//
//    public byte getGender() {
//        return gender;
//    }
//
//    public void setGender(byte gender) {
//        this.gender = gender;
//    }
//
//    @Override
//    public String toString() {
//        return "User{" +
//                "mId=" + mId +
//                ", mName='" + mName + '\'' +
//                ", mEmailAddress='" + mEmailAddress + '\'' +
//                ", mPassword='" + mPassword + '\'' +
//                ", mPhoneNumber='" + mPhoneNumber + '\'' +
//                ", gender=" + gender +
//                ", mDateOfBirth='" + mDateOfBirth + '\'' +
//                '}';
//    }
//
//    public User(String name, String emailAddress, String password, String phoneNumber, byte gender, String dateOfBirth) {
//        mName = name;
//        mEmailAddress = emailAddress;
//        mPassword = password;
//        mPhoneNumber = phoneNumber;
//        this.gender = gender;
//        mDateOfBirth = dateOfBirth;
//    }
//
//    public Long getId() {
//        return mId;
//    }
//
//    public void setId(Long id) {
//        mId = id;
//    }
//
//    public String getName() {
//        return mName;
//    }
//
//    public void setName(String name) {
//        mName = name;
//    }
//
//    public String getEmailAddress() {
//        return mEmailAddress;
//    }
//
//    public void setEmailAddress(String emailAddress) {
//        mEmailAddress = emailAddress;
//    }
//
//    public String getPassword() {
//        return mPassword;
//    }
//
//    public void setPassword(String password) {
//        mPassword = password;
//    }
//
//    public String getPhoneNumber() {
//        return mPhoneNumber;
//    }
//
//    public void setPhoneNumber(String phoneNumber) {
//        mPhoneNumber = phoneNumber;
//    }
//}
