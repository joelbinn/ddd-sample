package se.joelabs.dddsample.domain.usermanagement;

import se.joelabs.dddsample.domain.common.Entity;

import java.util.List;

public class Group extends Entity {
    public List<User> getUsers() {
        return List.of();
    }
}
