package com.ibm.fsd.smc.ms.sector.repository;

import com.ibm.fsd.smc.ms.sector.domain.SectorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Sector Repository
 */
public interface SectorRepository extends JpaRepository<SectorEntity, Integer> {
    SectorEntity findBySectorCode(String sectorCode);
    Long deleteBySectorCode(String sectorCode);
}
