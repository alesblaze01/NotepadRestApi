//package com.restApi.crime.db.CrimeDB.service;
//
//import com.restApi.crime.db.CrimeDB.domain.TheftCase;
//import com.restApi.crime.db.CrimeDB.repositories.TheftCaseRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class TheftCaseServiceImpl implements TheftCaseService {
//    private TheftCaseRepository mTheftCaseRepository;
//
//    public TheftCaseServiceImpl(TheftCaseRepository repository){
//        mTheftCaseRepository = repository;
//    }
//
//    @Override
//    public List<TheftCase> getAllCases() {
//        return mTheftCaseRepository.findAll();
//    }
//
//    @Override
//    public TheftCase getCaseById(Long id) {
//        return mTheftCaseRepository.findById(id).get();
//    }
//
//    @Override
//    public List<TheftCase> getCaseByState() {
//        return null;
//    }
//
//    @Override
//    public boolean addCase(TheftCase theftCase) {
//        TheftCase tCase = mTheftCaseRepository.save(theftCase);
//        if (tCase != null) return true;
//        return false;
//    }
//
//    @Override
//    public boolean deleteCase(Long id) {
//        mTheftCaseRepository.deleteById(id);
//        return true;
//    }
//
//    @Override
//    public boolean updateCase(TheftCase theftCase) {
////        TheftCase theftCase1 = new TheftCase(theftCase);
////        will implement later
//        return false;
//    }
//}
