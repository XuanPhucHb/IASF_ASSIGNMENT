package com.nxp.assigniasf.repo;

import com.nxp.assigniasf.entity.Township;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface TownRepository extends JpaRepository<Township, Long> {

    List<Township> findByTownNameContains(String name);
}
