package com.tansun.tcp.cbf.dao;

import org.springframework.util.StringUtils;

import java.util.*;

public class Main {

    public static Integer level = 1;
    public static Integer nextLevel = 0;

    public static List<Map<String, Object>> recursive(List allList,
                                                      List<Map<String, Object>> parentList) throws Exception {

        nextLevel = level + 1;

        for (int j = 0; j < parentList.size(); j++) {

//            level = 1;

            List<Map<String, Object>> temList = new ArrayList<>();

            for (int k = 0; k < allList.size(); k++) {

                Sys_organization kid = (Sys_organization) allList.get(k);
                Map<String, Object> map = (Map<String, Object>) parentList.get(j);
                Sys_organization par = (Sys_organization) map.get(String.valueOf(level));

                if (par != null) {
                    if (kid.getParent_org_code().equals(par.getOrg_code())) {

                        HashMap<String, Object> child = new HashMap<>();
                        child.put(String.valueOf(nextLevel), kid);

                        temList.add(child);
                        allList.remove(k);
                        k--;
                    }
                }

            }

            if (temList.size() > 0) {
                parentList.get(j).put("children", temList);
                level++;
                recursive(allList, temList);
            } else {
                level = 1;
                nextLevel = level + 1;
            }
        }

        return parentList;
    }

    //// BEGIN OF MODIFIABLE SEGMENT - class members
//// END OF MODIFIABLE SEGMENT
    public static List<Map<String, Object>> getParentList(List list) throws Exception {
        ArrayList<Map<String, Object>> tempList = new ArrayList<Map<String, Object>>();
//        ArrayList<java.lang.Object> tempList = new ArrayList<Object>();

        for (int i = 0; i < list.size(); i++) {

            Sys_organization org = (Sys_organization) list.get(i);

            if (StringUtils.isEmpty(org.getParent_org_code())) {

                Map<String, Object> map = new HashMap<>();
                map.put("1", org);

                tempList.add(map);

                list.remove(i);
            }
        }

        return tempList;

    }

    public static void main(String[] args) throws Exception {
        Sys_organization org1 = new Sys_organization();
        Sys_organization org2 = new Sys_organization();
        Sys_organization org3 = new Sys_organization();
        Sys_organization org4 = new Sys_organization();
        Sys_organization org5 = new Sys_organization();
        Sys_organization org6 = new Sys_organization();
        Sys_organization org7 = new Sys_organization();

        org1.setId(0);
        org1.setOrg_name("aaaa");
        org1.setParent_org_code("");
        org1.setOrg_code("001");

        org2.setId(1);
        org2.setOrg_name("bbb");
        org2.setParent_org_code("001");
        org2.setOrg_code("00101");

        org3.setId(2);
        org3.setOrg_name("ccc");
        org3.setParent_org_code("00101");
        org3.setOrg_code("0010101");

        org4.setId(3);
        org4.setOrg_name("ddd");
        org4.setParent_org_code("0010101");
        org4.setOrg_code("001010101");

        org5.setId(4);
        org5.setOrg_name("eee");
        org5.setParent_org_code("");
        org5.setOrg_code("002");

        org6.setId(5);
        org6.setOrg_name("fff");
        org6.setParent_org_code("002");
        org6.setOrg_code("00102");

        org7.setId(6);
        org7.setOrg_name("ggg");
        org7.setParent_org_code("002");
        org7.setOrg_code("00103");

        List allList = new ArrayList<Object>();

        allList.add(0, org1);
        allList.add(1, org2);
        allList.add(2, org3);
        allList.add(3, org4);
        allList.add(4, org5);
        allList.add(5, org6);
        allList.add(6, org7);

        List<Map<String, Object>> parentList = Main.getParentList(allList);
        List<Map<String, Object>> retList = Main.recursive(allList, parentList);

        System.err.println(retList);
    }
}