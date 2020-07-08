package com.zzh1ad.dao;

import com.zzh1ad.entity.TableData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface TableDataDAO extends JpaRepository<TableData,Long>, JpaSpecificationExecutor<TableData> {
}
