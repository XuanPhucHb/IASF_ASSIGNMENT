package com.nxp.assigniasf.controller;

import com.nxp.assigniasf.dto.RoadDto;
import com.nxp.assigniasf.entity.Road;
import com.nxp.assigniasf.service.RoadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/nxp/v1/road")
public class RoadController {

    @Autowired
    RoadService roadService;

    @RequestMapping(value = "/getAll")
    List<RoadDto> getAll() {
        return roadService.getAll();
    }

    @RequestMapping(value = "/filter/{roadName}/{townshipName}")
    List<RoadDto> searchStudent(@PathVariable String roadName,
                                @PathVariable String townshipName) {
        return roadService.filterRoad(roadName, townshipName);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    RoadDto create(@RequestBody Road road) {
        RoadDto roadResult = roadService.create(road);
        return roadResult;
    }
}
