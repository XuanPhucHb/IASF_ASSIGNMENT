package com.nxp.assigniasf.dto;

import com.nxp.assigniasf.entity.Township;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TownDto {

    private String id;
    private String townName;

    public TownDto map2Dto(Township township) {
        this.setId(township.getId().toString());
        this.setTownName(township.getTownName());
        return this;
    }
}
