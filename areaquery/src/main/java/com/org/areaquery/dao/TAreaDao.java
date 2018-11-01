package com.org.areaquery.dao;

import com.org.areaquery.model.TArea;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

/**
 * 描述:
 * dao接口
 *
 * @author A poor talker
 * @create 2018-11-01 21:35
 */
public interface TAreaDao extends JpaRepository<TArea,Integer> {

    List<TArea> findByParentId(Integer parentId);
}
