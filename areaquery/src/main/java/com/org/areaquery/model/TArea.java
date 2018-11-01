package com.org.areaquery.model;

import javax.persistence.*;


/**
 * 描述:
 * 地区类
 *
 * @author A poor talker
 * @create 2018-11-01 21:27
 */
@Entity
@Table(name = "t_area")
public class TArea {


    @Id
    /**
     * 自增主键
     */
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "areaId",length = 20)
    private Integer areaId;

    @Column(name = "areaCode",length = 50)

    private String areaCode;
    @Column(name = "areaName",length = 20)
    private String areaName;
    @Column(name = "level",length = 4)
    private Byte level;
    @Column(name = "cityCode",length = 50)
    private String cityCode;
    @Column(name = "center",length = 50)
    private String center;
    @Column(name = "parentId",length = 20)
    private Integer parentId;

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public Byte getLevel() {
        return level;
    }

    public void setLevel(Byte level) {
        this.level = level;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getCenter() {
        return center;
    }

    public void setCenter(String center) {
        this.center = center;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }
}
