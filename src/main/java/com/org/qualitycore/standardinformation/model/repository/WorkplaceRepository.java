package com.org.qualitycore.standardinformation.model.repository;

import com.org.qualitycore.standardinformation.model.entity.LineInformation;
import com.org.qualitycore.standardinformation.model.entity.Workplace;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface WorkplaceRepository extends JpaRepository<Workplace , String > {
    Optional<Workplace> findById(String id);

    @Query("SELECT MAX(CAST(SUBSTRING(w.workplaceId, 3) AS int)) FROM Workplace w")
    Integer findMaxWorkplaceId();
}