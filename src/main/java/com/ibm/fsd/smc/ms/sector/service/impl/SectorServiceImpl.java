package com.ibm.fsd.smc.ms.sector.service.impl;

import com.ibm.fsd.smc.ms.sector.domain.SectorEntity;
import com.ibm.fsd.smc.ms.sector.repository.SectorRepository;
import com.ibm.fsd.smc.ms.sector.service.SectorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Sector Service Implement Class
 */
@Service
public class SectorServiceImpl implements SectorService {

    @Autowired
    private SectorRepository sectorRepo;

    @Override
    public List<SectorEntity> findAll() {
        return sectorRepo.findAll();
    }

    @Override
    public void save(SectorEntity stockExchange) {
        sectorRepo.save(stockExchange);
    }

    @Override
    public SectorEntity findBySectorCode(String stockExchange) {
        return sectorRepo.findBySectorCode(stockExchange);
    }

    @Override
    public Long deleteBySectorCode(String stockExchange) {
        return sectorRepo.deleteBySectorCode(stockExchange);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void save(List<SectorEntity> list) {
        if (list != null && list.size() > 0) {
            for (int i = 0; i < list.size(); i++) {
                /*if (i % 2 == 1) {
                    throw new RuntimeException();
                }*/
                sectorRepo.save(list.get(i));
            }
        }
    }
}
