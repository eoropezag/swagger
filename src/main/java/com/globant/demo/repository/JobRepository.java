package com.globant.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.globant.demo.model.Job;

public interface JobRepository extends JpaRepository<Job, Long> {

}