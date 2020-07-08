package com.zzh1ad.service;

import com.zzh1ad.entity.TableData;

import java.util.List;

public interface TestService {
    void insert();

    List<TableData> getPage();
}
