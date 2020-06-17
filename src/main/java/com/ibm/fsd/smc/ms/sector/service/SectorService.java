package com.ibm.fsd.smc.ms.sector.service;

import com.ibm.fsd.smc.ms.sector.domain.SectorEntity;

import java.util.List;

/**
 * Sector Service
 */
public interface SectorService {

    List<SectorEntity> findAll();

    void save(SectorEntity user);

    void save(List<SectorEntity> list);

    SectorEntity findBySectorCode(String sectorCode);

    Long deleteBySectorCode(String sectorCode);
}
