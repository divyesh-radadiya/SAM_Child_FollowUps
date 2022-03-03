package com.example.samprojectdb.repository;
import com.example.samprojectdb.entity.DischargeSummary;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DischargeSummaryRepo extends JpaRepository<DischargeSummary,Integer> {

    //List<DischargeSummary> findByAww_id(int AWW_id);

}
