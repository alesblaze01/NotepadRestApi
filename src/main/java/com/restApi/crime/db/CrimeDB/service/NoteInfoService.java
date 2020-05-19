package com.restApi.crime.db.CrimeDB.service;

import com.restApi.crime.db.CrimeDB.domain.DBNoteInfo;

import java.util.List;

public interface NoteInfoService {
    boolean saveAllNotes(List<DBNoteInfo> DBNoteInfoList);
    List<DBNoteInfo> getAllNotes(String email);
}
