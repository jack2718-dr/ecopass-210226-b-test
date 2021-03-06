package com.apsol.ecopass.service;

import com.apsol.ecopass.entity.area.Addr;
import com.apsol.ecopass.entity.area.District;
import com.querydsl.core.Tuple;

import java.util.List;

public interface AddrService {

    List<String> getAddrHemds(String jusoBemd, String jusoHemd);

    void updateAddrs(List<Addr> addrs, District district);

    Addr findByEmds(String bemd, String hemd);

}
