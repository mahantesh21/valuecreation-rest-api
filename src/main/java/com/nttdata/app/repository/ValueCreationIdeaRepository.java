package com.nttdata.app.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.nttdata.app.model.Idea;

@RepositoryRestResource(collectionResourceRel = "idea", path = "idea")
public interface ValueCreationIdeaRepository extends PagingAndSortingRepository<Idea, Long> {
	List<Idea> findByUserId(@Param("userId") String userId);
}
