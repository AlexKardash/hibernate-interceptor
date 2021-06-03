package com.alexcorp.example.hibernateinterceptor.repository;

import com.alexcorp.example.hibernateinterceptor.domain.Watch;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WatchRepository extends JpaRepository<Watch, Long> {
}
