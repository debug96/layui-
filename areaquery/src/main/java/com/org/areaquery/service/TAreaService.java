package com.org.areaquery.service;

import com.org.areaquery.model.TArea;

import java.util.List;

/**
 * 描述:
 *
 * @author A poor talker
 * @create 2018-11-02 0:22
 */

public interface TAreaService {

     List<TArea> findByParentId(Integer parentId);
}
