package com.nxp.assigniasf.service;

import com.nxp.assigniasf.dto.RoadDto;
import com.nxp.assigniasf.entity.Road;
import com.nxp.assigniasf.entity.Township;
import com.nxp.assigniasf.repo.RoadRepository;
import com.nxp.assigniasf.repo.TownRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class RoadService {

    @Autowired
    RoadRepository roadRepository;

    @Autowired
    TownRepository townRepository;

    public RoadDto create(Road road){
        Township town = townRepository.getOne(road.getTownshipId());
        if (town != null) {
            road.setFoundingDate(System.currentTimeMillis());
            road.setTownship(town);
            Road result = roadRepository.save(road);
            return new RoadDto().map2Dto(result);
        }
        return null;
    }


    public List<RoadDto> filterRoad(String roadName, String townshipName) {
        List<RoadDto> roadDtos = new ArrayList<>();
        try {
            List<Road> resultList = roadRepository.filterRoad(roadName, townshipName);
            resultList.forEach(t -> {
                roadDtos.add(new RoadDto().map2Dto(t));
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
        return roadDtos;
    }

    public List<RoadDto> getAll() {
        List<RoadDto> roadDtos = new ArrayList<>();
        List<Road> roadResult = roadRepository.findAll();
        roadResult.forEach(t -> {
            roadDtos.add(new RoadDto().map2Dto(t));
        });
        return roadDtos;
    }
}
