package com.platform.idleplatform.sort.entity;

import java.util.List;

public class SortInfo {
    public String sortId;
    public String name;
    public String parentId;
    public List<GoodsListInfo> goodsList;
    public String getSortId() {
        return sortId;
    }

    public void setSortId(String sortId) {
        this.sortId = sortId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public List<GoodsListInfo> getGoodsList() {
        return goodsList;
    }

    public void setGoodsList(List<GoodsListInfo> goodsList) {
        this.goodsList = goodsList;
    }
}
