package com.pa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AadhaarRepo extends JpaRepository<Aadhaar, Integer> {

}
