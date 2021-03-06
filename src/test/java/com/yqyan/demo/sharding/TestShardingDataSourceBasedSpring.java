package com.yqyan.demo.sharding;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;

/**
 * @Author yanyaqiang
 * @Date 2019/4/15 16:46
 **/

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class TestShardingDataSourceBasedSpring extends TestShardingDataSource{

    @Autowired
    DataSource ds;

    @Override
    protected DataSource getDataSource() {
        return this.ds;
    }

    @Override
    public void delete() {
        super.delete();
    }

    @Override
    public void insert() {
        super.insert();
    }

    @Override
    public void select() {
        super.select();
    }

    @Override
    public void update() {
        super.update();
    }
}
