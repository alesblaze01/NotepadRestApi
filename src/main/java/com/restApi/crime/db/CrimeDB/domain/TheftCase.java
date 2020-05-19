//package com.restApi.crime.db.CrimeDB.domain;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//
//@Entity
//public class TheftCase {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private Long mId;
//    private String mSubject , mDescritpion;
//    private User mUser;
//    //save location of the crime
//    //save date of the crime
//    //save pictures of the crime
//
//    public TheftCase(TheftCase caseTheftCase){
//        this.mDescritpion = caseTheftCase.getDescritpion();
//        mSubject = caseTheftCase.getSubject();
//        mUser = caseTheftCase.getUser();
//        mId = caseTheftCase.getId();
//    }
//    public TheftCase(String subject, String descritpion) {
////        mId = id;
//        mSubject = subject;
//        mDescritpion = descritpion;
//    }
//
//    public User getUser() {
//        return mUser;
//    }
//
//    public void setUser(User user) {
//        mUser = user;
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
//    public String getSubject() {
//        return mSubject;
//    }
//
//    public void setSubject(String subject) {
//        mSubject = subject;
//    }
//
//    public String getDescritpion() {
//        return mDescritpion;
//    }
//
//    public void setDescritpion(String descritpion) {
//        mDescritpion = descritpion;
//    }
//}
