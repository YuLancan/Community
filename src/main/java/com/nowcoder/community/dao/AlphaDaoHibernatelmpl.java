package com.nowcoder.community.dao;

import org.springframework.stereotype.Repository;

@Repository("alphaHibernate")
public class AlphaDaoHibernatelmpl implements Alphadao{
    @Override
    public String select() {
        return "Hibernate";
    }
}
