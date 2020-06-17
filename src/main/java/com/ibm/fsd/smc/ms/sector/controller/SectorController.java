package com.ibm.fsd.smc.ms.sector.controller;

import com.ibm.fsd.smc.ms.sector.domain.SectorEntity;
import com.ibm.fsd.smc.ms.sector.service.SectorService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Stock Sector Controller
 */
@CrossOrigin
@RestController
//@RequestMapping("/sector")
@Slf4j
public class SectorController {

    @Autowired
    private SectorService sectorSvc;

    @GetMapping("/sectors")
    public List<SectorEntity> findAll() {
        return sectorSvc.findAll();
    }

    @GetMapping("/{sector_code}")
    public SectorEntity findSector(@PathVariable("sector_code") String sectorCode) {
        return sectorSvc.findBySectorCode(sectorCode);
    }

    @PostMapping("/addition")
    public ResponseEntity<Boolean> addSector(@RequestBody SectorEntity sector){
        Boolean result = Boolean.FALSE;
        sectorSvc.save(sector);
        result = Boolean.TRUE;
        return new ResponseEntity(result, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Boolean> updateSector(@RequestBody SectorEntity sector){
        Boolean result = Boolean.FALSE;
        sectorSvc.save(sector);
        result = Boolean.TRUE;
        return new ResponseEntity(result, HttpStatus.OK);
    }

    @DeleteMapping("/{sector_code}")
    public ResponseEntity<Boolean> deleteSector(@PathVariable("sector_code") String sectorCode){
        Boolean result = Boolean.FALSE;
        sectorSvc.deleteBySectorCode(sectorCode);
        return new ResponseEntity(result, HttpStatus.OK);
    }

/*    @PostMapping("/update")
    public ResponseEntity<Boolean> updateSector(@RequestBody SectorEntity sector){
        Boolean result = Boolean.FALSE;
        SectorEntity dbSector = sectorSvc.findBySectorCode(sector.getSectorCode());
        if(!ObjectUtils.isEmpty(dbSector)){
            sector.setId(dbSector.getId());
            sectorSvc.save(sector);
            result = Boolean.TRUE;
        }
        return new ResponseEntity(result, HttpStatus.OK);
    }*/


}
