package com.test.repository.mcqrepository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.test.model.mcqmodel.MCQModel;

@Repository
public interface MCQRepository extends CrudRepository<MCQModel, Long>{
}
