package com.example.demo.Repository;

import com.example.demo.Entity.UserRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRecordRepository extends JpaRepository<UserRecord, Integer> {
}
