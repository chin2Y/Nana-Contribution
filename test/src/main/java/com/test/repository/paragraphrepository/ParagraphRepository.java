package com.test.repository.paragraphrepository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.test.model.paragraphmodel.ParagraphModel;

@Repository
public interface ParagraphRepository extends CrudRepository<ParagraphModel, Long>{
}
