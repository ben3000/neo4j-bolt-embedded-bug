package com.example.repository;

import com.example.domain.Name;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface NameRepository extends Neo4jRepository<Name, Long> {
	Name findByName(String name);
}
