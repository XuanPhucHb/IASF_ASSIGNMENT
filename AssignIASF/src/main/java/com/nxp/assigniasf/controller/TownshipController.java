package com.nxp.assigniasf.controller;

import com.nxp.assigniasf.dto.RoadDto;
import com.nxp.assigniasf.dto.TownDto;
import com.nxp.assigniasf.service.RoadService;
import com.nxp.assigniasf.service.TownService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/nxp/v1/town")
public class TownshipController {

    @Autowired
    TownService townService;

    @RequestMapping(value = "/getAll")
    List<TownDto> getAll() {
        return townService.getAll();
    }

    @RequestMapping(value = "/getByName/{townName}")
    List<TownDto> getAllByName(@PathVariable String townName) {
        return townService.getByName(townName);
    }
}
