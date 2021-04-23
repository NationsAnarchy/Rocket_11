package com.vti.academy.backend;

import com.vti.academy.entity.Group;

import java.sql.SQLException;
import java.util.List;

public class GroupController {
    private IGroupService groupService;

    public GroupController() {
        groupService = new GroupService();
    }

    public List<Group> getListGroups() throws ClassNotFoundException,
            SQLException {

        return groupService.getListGroups();
    }
}
