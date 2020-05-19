//package com.restApi.crime.db.CrimeDB.controllers;
//
//import com.restApi.crime.db.CrimeDB.domain.TheftCase;
//import com.restApi.crime.db.CrimeDB.service.TheftCaseService;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
////@RestController
////@RequestMapping(TheftCaseController.BASE_URL)
//public class TheftCaseController {
//    final static String BASE_URL = "/case";
////    @Autowired
//    private TheftCaseService mTheftCaseService;
//
//    public TheftCaseController(TheftCaseService service){
//        mTheftCaseService = service;
//    }
//
//    @GetMapping("/all")
//    public List<TheftCase> getAllCases(){
//        return mTheftCaseService.getAllCases();
//    }
//    @GetMapping("/{id}")
//    public TheftCase getCaseById(@PathVariable Long Id){
//        return mTheftCaseService.getCaseById(Id);
//    }
//    @PostMapping("/add")
//    public boolean addACase(@RequestBody TheftCase theftCase){
//        return mTheftCaseService.addCase(theftCase);
//    }
//    @DeleteMapping("/delete/{id}")
//    public boolean deleteACase(Long Id){
//        return mTheftCaseService.deleteCase(Id);
//    }
//    @PutMapping("/update/{id}")
//    public boolean UpdateACase(@PathVariable Long id , @RequestBody TheftCase theftCase){
//        return mTheftCaseService.updateCase(theftCase);
//    }
//}
