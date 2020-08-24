package com.wanke.springcloud.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @author Administrator
 */
@NoArgsConstructor
@Data
@Accessors(chain = true)
public class Dept {

    /**
     * 部门编号(主键)
     */
    private Long deptNo;
    /**
     * 部门名称
     */
    private String dName;
    /**
     * 来自于哪个数据库,数据库编号
     */
    private String db_source;

    public Dept(String dName){
        super();
        this.dName = dName;
    }


    public static void main(String[] args) {
        Dept dept = new Dept();
        dept.setDeptNo(10010L).setDName("技术研发部").setDb_source("001");
        System.out.println(dept.toString());
    }

}
