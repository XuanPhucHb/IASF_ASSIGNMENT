package com.nxp.assigniasf.repo;

import com.nxp.assigniasf.entity.Road;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface RoadRepository extends JpaRepository<Road, Long> {

    @Query("SELECT a FROM Road a WHERE a.roadName LIKE %:roadName% AND a.township.townName LIKE %:townName%")
    List<Road> filterRoad(@Param("roadName") String roadName, @Param("townName") String townName);

}
