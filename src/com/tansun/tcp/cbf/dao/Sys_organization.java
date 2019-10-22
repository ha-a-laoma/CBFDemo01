//// BEGIN OF MODIFIABLE SEGMENT - package
package com.tansun.tcp.cbf.dao;
//// END OF MODIFIABLE SEGMENT

import java.math.*;
import java.util.*;

//// BEGIN OF MODIFIABLE SEGMENT - import
//// END OF MODIFIABLE SEGMENT

public class Sys_organization
{
    private java.lang.String[] m_strMappingFieldName;
    private java.lang.String[] m_strIndexedFieldName;
    private java.lang.String[] m_strOrderFieldName;
    private boolean m_bExcludeBoundaryValue;
    private boolean m_bInsertShardingKeyAutomatically;
    private boolean m_bNeedOrder;
    private boolean m_bIsDescendingOrder;

    private java.lang.String m_stringTypeName;
    private java.lang.Integer m_integerReferenceCount;
    private Integer m_integerId;
    private java.lang.String m_stringOrg_code;
    private java.lang.String m_stringOrg_name;
    private java.lang.String m_stringParent_org_code;
    private java.lang.String m_stringOrg_level_cd;
    private java.lang.Integer m_integerSort;
    private java.lang.String m_stringStatus_cd;
    private java.lang.String m_stringRemark;
    private java.lang.String m_stringDel_ind;
    private java.lang.String m_stringCreate_user;
    private java.lang.String m_stringCreate_time;
    private java.lang.String m_stringUpdate_user;
    private java.lang.String m_stringUpdate_time;
    private java.lang.Integer m_integerVersion;
    private java.lang.String m_stringTenant_id;
    private java.lang.String m_stringClntend_id;

    public java.lang.String getPersistentComponentTypeName()
    {
        return getTypeName();
    }
    public boolean getIsStatic()
    {
        return false;
    }
    public java.lang.String getReferenceCountLocation()
    {
        return "Sys_organization.ReferenceCount";
    }
    public java.lang.String getTypeName()
    {
        return m_stringTypeName;
    }
    public int getReferenceCount()
    {
        return m_integerReferenceCount;
    }
    public java.lang.String[] getIdentifyingFieldName()
    {
        return new java.lang.String[]{ "Id"};
    }
    public java.lang.String[] getMappingFieldName()
    {
        return m_strMappingFieldName;
    }
    public void setMappingFieldName(java.lang.String[] strMappingFieldName)
    {
        m_strMappingFieldName = strMappingFieldName;
    }
    public java.lang.String[] getIndexedFieldName()
    {
        return m_strIndexedFieldName;
    }
    public void setIndexedFieldName(java.lang.String[] strIndexedFieldName)
    {
        m_strIndexedFieldName = strIndexedFieldName;
    }
    public boolean getExcludeBoundaryValue()
    {
        return m_bExcludeBoundaryValue;
    }
    public void setExcludeBoundaryValue(boolean bExcludeBoundaryValue)
    {
        m_bExcludeBoundaryValue = bExcludeBoundaryValue;
    }
    public boolean getInsertShardingKeyAutomatically()
    {
        return m_bInsertShardingKeyAutomatically;
    }
    public void setInsertShardingKeyAutomatically(boolean bInsertShardingKeyAutomatically)
    {
        m_bInsertShardingKeyAutomatically = bInsertShardingKeyAutomatically;
    }
    public boolean getNeedOrder()
    {
        return m_bNeedOrder;
    }
    public void setNeedOrder(boolean bNeedOrder)
    {
        m_bNeedOrder = bNeedOrder;
    }
    public boolean getIsDescendingOrder()
    {
        return m_bIsDescendingOrder;
    }
    public void setIsDescendingOrder(boolean bIsDescendingOrder)
    {
        m_bIsDescendingOrder = bIsDescendingOrder;
    }
    public java.lang.String[] getOrderFieldName()
    {
        return m_strOrderFieldName;
    }
    public void setOrderFieldName(java.lang.String[] strOrderFieldName)
    {
        m_strOrderFieldName = strOrderFieldName;
    }
    /**获取-主键(主键)*/
    public int getId()
    {
        return m_integerId;
    }
    /**设置-主键(主键)*/
    public void setId(int nValue) throws Exception
    {
        m_integerId = nValue;
    }
    /**获取-机构代码(机构代码)*/
    public java.lang.String getOrg_code()
    {
        return m_stringOrg_code;
    }
    /**设置-机构代码(机构代码)*/
    public void setOrg_code(java.lang.String strValue) throws Exception
    {
        m_stringOrg_code = strValue;
    }
    /**获取-机构名称(机构名称)*/
    public java.lang.String getOrg_name()
    {
        return m_stringOrg_name;
    }
    /**设置-机构名称(机构名称)*/
    public void setOrg_name(java.lang.String strValue) throws Exception
    {
        m_stringOrg_name = strValue;
    }
    /**获取-父节点机构代码(父节点机构代码)*/
    public java.lang.String getParent_org_code()
    {
        return m_stringParent_org_code;
    }
    /**设置-父节点机构代码(父节点机构代码)*/
    public void setParent_org_code(java.lang.String strValue) throws Exception
    {
        m_stringParent_org_code = strValue;
    }
    /**获取-机构等级(机构等级)*/
    public java.lang.String getOrg_level_cd()
    {
        return m_stringOrg_level_cd;
    }
    /**设置-机构等级(机构等级)*/
    public void setOrg_level_cd(java.lang.String strValue) throws Exception
    {
        m_stringOrg_level_cd = strValue;
    }
    /**获取-排序(排序)*/
    public int getSort()
    {
        return m_integerSort;
    }
    /**设置-排序(排序)*/
    public void setSort(int nValue) throws Exception
    {
        m_integerSort = nValue;
    }
    /**获取-状态(状态)*/
    public java.lang.String getStatus_cd()
    {
        return m_stringStatus_cd;
    }
    /**设置-状态(状态)*/
    public void setStatus_cd(java.lang.String strValue) throws Exception
    {
        m_stringStatus_cd = (strValue);
    }
    /**获取-备注(备注)*/
    public java.lang.String getRemark()
    {
        return m_stringRemark;
    }
    /**设置-备注(备注)*/
    public void setRemark(java.lang.String strValue) throws Exception
    {
        m_stringRemark = (strValue);
    }
    /**获取-删除标志(删除标志)*/
    public java.lang.String getDel_ind()
    {
        return m_stringDel_ind;
    }
    /**设置-删除标志(删除标志)*/
    public void setDel_ind(java.lang.String strValue) throws Exception
    {
        m_stringDel_ind = (strValue);
    }
    /**获取-创建者(创建者)*/
    public java.lang.String getCreate_user()
    {
        return m_stringCreate_user;
    }
    /**设置-创建者(创建者)*/
    public void setCreate_user(java.lang.String strValue) throws Exception
    {
        m_stringCreate_user = (strValue);
    }
    /**获取-创建时间(创建时间)*/
    public java.lang.String getCreate_time()
    {
        return m_stringCreate_time;
    }
    /**设置-创建时间(创建时间)*/
    public void setCreate_time(java.lang.String strValue) throws Exception
    {
        m_stringCreate_time = (strValue);
    }
    /**获取-更新者(更新者)*/
    public java.lang.String getUpdate_user()
    {
        return m_stringUpdate_user;
    }
    /**设置-更新者(更新者)*/
    public void setUpdate_user(java.lang.String strValue) throws Exception
    {
        m_stringUpdate_user = (strValue);
    }
    /**获取-更新时间(更新时间)*/
    public java.lang.String getUpdate_time()
    {
        return m_stringUpdate_time;
    }
    /**设置-更新时间(更新时间)*/
    public void setUpdate_time(java.lang.String strValue) throws Exception
    {
        m_stringUpdate_time = (strValue);
    }
    /**获取-版本号(版本号)*/
    public int getVersion()
    {
        return m_integerVersion;
    }
    /**设置-版本号(版本号)*/
    public void setVersion(int nValue) throws Exception
    {
        m_integerVersion = (nValue);
    }
    /**获取-租户编号(租户编号)*/
    public java.lang.String getTenant_id()
    {
        return m_stringTenant_id;
    }
    /**设置-租户编号(租户编号)*/
    public void setTenant_id(java.lang.String strValue) throws Exception
    {
        m_stringTenant_id = (strValue);
    }
    /**获取-客户端编号(客户端编号)*/
    public java.lang.String getClntend_id()
    {
        return m_stringClntend_id;
    }
    /**设置-客户端编号(客户端编号)*/
    public void setClntend_id(java.lang.String strValue) throws Exception
    {
        m_stringClntend_id = (strValue);
    }

    @Override
    public String toString() {
        return "Sys_organization{" +
                ", m_stringOrg_name='" + m_stringOrg_name + '\'' +
                ", m_stringParent_org_code='" + m_stringParent_org_code + '\'' +
                '}';
    }
//// BEGIN OF MODIFIABLE SEGMENT - class members
//// END OF MODIFIABLE SEGMENT
}
