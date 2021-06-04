package com.nxp.assigniasf.service;

import com.nxp.assigniasf.dto.RoadDto;
import com.nxp.assigniasf.dto.TownDto;
import com.nxp.assigniasf.entity.Road;
import com.nxp.assigniasf.entity.Township;
import com.nxp.assigniasf.repo.TownRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TownService {

    @Autowired
    TownRepository townRepository;

    public List<TownDto> getAll() {
        List<TownDto> townDtos = new ArrayList<>();
        List<Township> townResult = townRepository.findAll();
        townResult.forEach(t -> {
            townDtos.add(new TownDto().map2Dto(t));
        });
        return townDtos;
    }

    public List<TownDto> getByName(String name) {
        List<TownDto> townDtos = new ArrayList<>();
        List<Township> townResult = townRepository.findByTownNameContains(name);
        townResult.forEach(t -> {
            townDtos.add(new TownDto().map2Dto(t));
        });
        return townDtos;
    }
}
