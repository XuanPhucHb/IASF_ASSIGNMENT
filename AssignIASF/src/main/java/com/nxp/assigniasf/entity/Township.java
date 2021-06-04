package com.nxp.assigniasf.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Township {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String townName;

    @OneToMany(mappedBy = "township", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Road> roads;
}
