package com.jpa.entity.twoway;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Dept")
public class Dept {
    @Id
    @GeneratedValue
    private Integer id;
    
    @Column
    private String name;
    
    //Dept加入員工是根據 Emp的 dept 屬性的資料變動
    //所以 Dept 不用維護對於 emp 的關聯設定
    @OneToMany(mappedBy = "dept")
    private List<Emp> emps = new ArrayList<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Emp> getEmps() {
        return emps;
    }

    public void setEmps(List<Emp> emps) {
        this.emps = emps;
    }
    
    
}