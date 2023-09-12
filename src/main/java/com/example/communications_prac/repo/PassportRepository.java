package com.example.communications_prac.repo;

import com.example.communications_prac.models.Passport;
import org.springframework.data.repository.CrudRepository;

public interface PassportRepository extends CrudRepository<Passport, Long> {
    Passport findByNumber(String number);
}
