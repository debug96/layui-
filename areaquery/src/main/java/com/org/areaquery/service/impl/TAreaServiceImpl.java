package com.org.areaquery.service.impl;

import com.org.areaquery.dao.TAreaDao;
import com.org.areaquery.model.TArea;
import com.org.areaquery.service.TAreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 描述:
 *
 * @author A poor talker
 * @create 2018-11-02 0:48
 */
@Service
public class TAreaServiceImpl implements TAreaService {

    @Autowired
    private TAreaDao tAreaDao;

    @Override
    public List<TArea> findByParentId(Integer parentId) {
        List<TArea> tAreas = tAreaDao.findByParentId(parentId);
        return tAreas;
    }
}
