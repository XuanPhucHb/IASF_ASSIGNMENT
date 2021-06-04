package com.nxp.assigniasf.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
public class Road {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String roadName;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "townshipId")
    private Township township;

    @Column(insertable = false, updatable = false)
    private Long townshipId;

    private Long foundingDate;

    private String description;

    private int status;
}
