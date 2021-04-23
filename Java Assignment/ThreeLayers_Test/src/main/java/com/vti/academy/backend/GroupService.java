package com.vti.academy.backend;

import com.vti.academy.entity.Group;

import java.sql.SQLException;
import java.util.List;

public class GroupService implements IGroupService {
    private GroupRepository repository;

    public GroupService() {
        repository = new GroupRepository();
    }

    public List<Group> getListGroups() throws ClassNotFoundException,
            SQLException, SQLException {
        return repository.getListGroups();
    }
}
