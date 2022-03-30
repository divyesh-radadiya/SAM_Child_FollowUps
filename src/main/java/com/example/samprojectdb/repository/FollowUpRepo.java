package com.example.samprojectdb.repository;
import com.example.samprojectdb.entity.FollowUp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface FollowUpRepo extends JpaRepository<FollowUp,Integer> {
    @Query("select f.dischargeSummary.admission.child.gender from FollowUp f where f.followUpId=?1")
    char findGenderByFollowUpId(int followUpId);
}
