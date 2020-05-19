package com.restApi.crime.db.CrimeDB.service;
import com.restApi.crime.db.CrimeDB.domain.DBNoteInfo;
import com.restApi.crime.db.CrimeDB.repositories.NotesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class NoteInfoServiceImpl implements NoteInfoService {
    @Autowired
    private NotesRepository mNotesRepository;
    public NoteInfoServiceImpl(NotesRepository notesRepository){
        mNotesRepository = notesRepository;
    }
    @Override
    public boolean saveAllNotes(List<DBNoteInfo> DBNoteInfoList) {
        List<DBNoteInfo> DBNoteInfos = (List<DBNoteInfo>) mNotesRepository.saveAll(DBNoteInfoList);
        if(DBNoteInfoList.size() != DBNoteInfos.size()) return false;
        for(int i = 0; i < DBNoteInfoList.size() ; i++){
            DBNoteInfo userSent = DBNoteInfoList.get(i);
            DBNoteInfo dbSaved = DBNoteInfos.get(i);
            if(userSent.courseTitle.equals(dbSaved.courseTitle)) {
                if (userSent.noteText.equals(dbSaved.noteText)) {
                    if(userSent.noteTitle.equals(dbSaved.noteTitle)) {
                        if(userSent.userEmail.equals(dbSaved.userEmail)) {
                            if(i == DBNoteInfoList.size()-1) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override
    public List<DBNoteInfo> getAllNotes(String email) {
        List<DBNoteInfo> userNotes = new LinkedList<>();
        Iterable<DBNoteInfo> all = mNotesRepository.findAll();

        all.forEach(dbNoteInfo -> {
            if ( dbNoteInfo.userEmail.equals(email) ) {
                userNotes.add(dbNoteInfo);
            }
        });

        return userNotes;
    }
}
