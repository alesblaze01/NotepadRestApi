package com.restApi.crime.db.CrimeDB.controllers;

import com.restApi.crime.db.CrimeDB.domain.DBNoteInfo;
import com.restApi.crime.db.CrimeDB.service.NoteInfoService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(NoteInfoController.BASE_URL)
public class NoteInfoController {
    public static final String BASE_URL = "/noteinfo";
    private final NoteInfoService mNoteInfoService;

    NoteInfoController(NoteInfoService noteInfoService){
        mNoteInfoService = noteInfoService;
    }
    @PostMapping(path = "/save")
    @ResponseStatus(HttpStatus.OK)
    boolean saveAllNotes(@RequestBody List<DBNoteInfo> DBNoteInfoList){
        return mNoteInfoService.saveAllNotes(DBNoteInfoList);
    }

    @GetMapping(consumes = "application/json" , produces = "application/json")
    List<DBNoteInfo> getAllNotes(@RequestParam(value = "email",defaultValue = "null") String email){
        return mNoteInfoService.getAllNotes(email);
    }
}
