package com.nxp.assigniasf.dto;

import com.nxp.assigniasf.Utils.RoadUtils;
import com.nxp.assigniasf.entity.Road;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RoadDto {

    private String id;
    private String roadName;
    private String buildingDate;
    private String status;
    private String townshipName;

    public RoadDto map2Dto(Road road) {
        this.setId(road.getId().toString());
        this.setRoadName(road.getRoadName());
        this.setBuildingDate(RoadUtils.convertMLS2String(road.getFoundingDate()));
        this.setStatus(RoadUtils.convertStatus(road.getStatus()));
        this.setTownshipName(road.getTownship().getTownName());
        return this;
    }
}
