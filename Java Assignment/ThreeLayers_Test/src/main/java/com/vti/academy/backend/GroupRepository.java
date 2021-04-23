package com.vti.academy.backend;

import com.vti.academy.entity.Group;
import com.vti.academy.utils.DataConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class GroupRepository {
    private Connection conn;

    public GroupRepository() {
        DataConnection dataConnection = new DataConnection();
    }

    public List<Group> getListGroups() throws ClassNotFoundException,
            SQLException {

        List<Group> groups = new ArrayList<>();

        DataConnection dataConn = new DataConnection();
        conn = dataConn.getConn();

        String sql = "SELECT GroupID, GroupName FROM `Group`";
        Statement statement = conn.createStatement();

        ResultSet rs = statement.executeQuery(sql);

        while (rs.next()) {
            Group group = new Group(rs.getInt("id"),
                    rs.getString("name"));

            groups.add(group);
        }

        dataConn.closeConn();

        return groups;
    }

    public void getGroupById (int id) {

    }
}
