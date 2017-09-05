package com.example.domain;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class Name {

	@GraphId
	Long id;
	String name;
	String author;
}
