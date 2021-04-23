package com.vti.academy.backend;

import com.vti.academy.entity.Group;

import java.sql.SQLException;
import java.util.List;

public interface IGroupService {
    public List<Group> getListGroups() throws ClassNotFoundException,
            SQLException;
}
