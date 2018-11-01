package com.org.areaquery.controller;

import com.org.areaquery.model.TArea;
import com.org.areaquery.service.TAreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 描述:
 *
 * @author A poor talker
 * @create 2018-11-02 0:33
 */
@RestController
public class TAreaController {

    @Autowired
    private TAreaService tAreaService;

    @GetMapping("/findByParentId/{parentId}")
    public List<TArea> findByParentId(@PathVariable("parentId")Integer parentId){
        List<TArea> tAreaList = tAreaService.findByParentId(parentId);
        return tAreaList;
    }
}
