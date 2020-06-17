package com.ibm.fsd.smc.ms.sector.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

/**
 * Sector Entity
 * Mapping with db table `t_sector`
 */
@Entity
@Table(name = "t_sector")
@Getter
@Setter
@ToString
public class SectorEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "sector_code")
    private String sectorCode;

    @Column(name = "sector_name")
    private String sectorName;

    @Column(name = "brief")
    private String brief;
}
