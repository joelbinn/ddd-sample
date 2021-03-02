package se.joelabs.dddsample.domain.usermanagement;

import se.joelabs.dddsample.domain.common.Entity;

import java.util.ArrayList;
import java.util.List;

/**
 * A user in the system.
 */
public class User extends Entity {
    private List<Role> roles = new ArrayList<>();

    /**
     * Gets all roles that a user has.
     * @return the roles
     */
    public Iterable<Role> getRoles() {
        return roles;
    }

    public void addRole(Role role) {
        if (!this.roles.contains(role)) {
            this.roles.add(role);
        }
    }
}
