package com.zzh1ad.service.impl;

import com.zzh1ad.dao.TableDataDAO;
import com.zzh1ad.entity.TableData;
import com.zzh1ad.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TableDataDAO dataDAO;

    @Override
    public void insert() {
        for (int i = 1; i < 20; i++) {
            TableData tableData = new TableData();
            tableData.setId((long)i);
            tableData.setName("第"+i+"个");
            dataDAO.save(tableData);
        }
    }

    @Override
    public List<TableData> getPage() {
        return dataDAO.findAll(new Specification<TableData>() {
            @Override
            public Predicate toPredicate(Root<TableData> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                List<Predicate> list = new ArrayList<>();

                list.add(criteriaBuilder.like(root.get("name"),"%1%"));

                return criteriaBuilder.and(list.toArray(new Predicate[0]));
            }
        }, PageRequest.of(1,2)).getContent();
    }
}
