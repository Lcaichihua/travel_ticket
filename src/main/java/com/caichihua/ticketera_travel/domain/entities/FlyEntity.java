package com.caichihua.ticketera_travel.domain.entities;

import com.caichihua.ticketera_travel.util.AeroLine;
import jakarta.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity(name ="fly")
public class FlyEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double originLat;
    private Double originLng;
    private Double destinyLat;
    private Double destinyLng;
    private BigDecimal price ;
    @Column(length = 20)
    private String destinyName;
    @Column(length = 20)
    private String originName;
    @Enumerated(EnumType.STRING)
    private AeroLine aeroLine;


}
