package se.joelabs.dddsample.domain.usermanagement;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class UserTest {

    private User user;

    @BeforeEach
    void setUp() {
        user = new User();
    }

    @Test
    void getRolesShouldReturnEmptyInitially() {
        assertThat(new User().getRoles()).isEmpty();
    }

    @Test
    void ItIsPossibleToAddRolesButNoDuplicatesAreAllowed() {
        // given:
        Role role = new Role();

        // when:
        user.addRole(role);
        user.addRole(role);

        // then:
        assertThat(user.getRoles()).containsExactly(role);
    }
}