package com.nxp.assigniasf.Utils;

import com.nxp.assigniasf.entity.Road;
import com.nxp.assigniasf.entity.Township;
import com.nxp.assigniasf.repo.RoadRepository;
import com.nxp.assigniasf.repo.TownRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Component
public class Migrate {

    @Autowired
    TownRepository townRepository;

    @Autowired
    RoadRepository roadRepository;

    public void dataSeeding(){
        if(roadRepository.findAll().size() == 0){
            List<Road> roadList = new ArrayList<>();

            Township township1 = new Township();
            township1.setTownName("Cầu Giấy");

            Township township2 = new Township();
            township2.setTownName("Hà Đông");

            Township township3 = new Township();
            township3.setTownName("Ba Đình");

            Road road1 = new Road();
            road1.setRoadName("Hồ Tùng Mậu");
            road1.setStatus(1);
            road1.setDescription("Ho Tung Mau");
            road1.setFoundingDate(new Date("30/04/1976").getTime());
            road1.setTownship(township1);

            Road road2 = new Road();
            road2.setRoadName("Trần Đăng Ninh");
            road2.setStatus(2);
            road2.setDescription("Tran Dang Ninh");
            road2.setFoundingDate(new Date("12/06/1988").getTime());
            road2.setTownship(township1);

            Road road3 = new Road();
            road3.setRoadName("Nguyễn Đang Xây");
            road3.setStatus(0);
            road3.setDescription("Nguyễn Đang xây");
            road3.setFoundingDate(new Date("12/03/2021").getTime());
            road3.setTownship(township2);

            Road road4 = new Road();
            road4.setRoadName("Nguyễn Trãi");
            road4.setStatus(1);
            road4.setDescription("Nguyen Trai");
            road4.setFoundingDate(new Date("29/12/2008").getTime());
            road4.setTownship(township2);

            Road road5 = new Road();
            road5.setRoadName("Ngô Đang Sửa");
            road5.setStatus(2);
            road5.setDescription("Ngo Dang Sua");
            road5.setFoundingDate(new Date("23/06/1999").getTime());
            road5.setTownship(township3);

            Road road6 = new Road();
            road6.setRoadName("Trần Chưa Sử Dụng Được");
            road6.setStatus(0);
            road6.setDescription("Tran Chua Su Dung Duoc");
            road6.setFoundingDate(new Date("14/08/2020").getTime());
            road6.setTownship(township3);

            roadList.add(road1);
            roadList.add(road2);
            roadList.add(road3);
            roadList.add(road4);
            roadList.add(road5);
            roadList.add(road6);

            roadRepository.saveAll(roadList);
        }
    }
}
