package com.devendrabrain.rds.SpringDataWithAWSRDS;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRespository extends JpaRepository<Person, Long> {
}
