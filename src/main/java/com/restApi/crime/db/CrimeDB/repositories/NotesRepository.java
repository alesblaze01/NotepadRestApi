package com.restApi.crime.db.CrimeDB.repositories;

import com.restApi.crime.db.CrimeDB.domain.DBNoteInfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotesRepository extends CrudRepository<DBNoteInfo,Long> {
}
