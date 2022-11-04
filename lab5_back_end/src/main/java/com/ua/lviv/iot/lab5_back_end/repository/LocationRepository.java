package com.ua.lviv.iot.lab5_back_end.repository;

import com.ua.lviv.iot.lab5_back_end.domain.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationRepository extends JpaRepository<Location, Integer> {
}
