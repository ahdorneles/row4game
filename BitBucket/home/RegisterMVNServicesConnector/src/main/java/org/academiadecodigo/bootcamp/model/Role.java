package org.academiadecodigo.bootcamp.model;

import java.util.Set;

/**
 * Created by codecadet on 23/03/17.
 */
public class Role {
    private String role;
    private Integer id;
    private String roleDescription;

    public Role(){

    }

    public Role(String role, String roleDescription){
        this.role = role;
        this.roleDescription = roleDescription;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoleDescription() {
        return roleDescription;
    }

    public void setRoleDescription(String roleDescription) {
        this.roleDescription = roleDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Role role1 = (Role) o;

        if (role != null ? !role.equals(role1.role) : role1.role != null) return false;
        if (id != null ? !id.equals(role1.id) : role1.id != null) return false;
        return roleDescription != null ? roleDescription.equals(role1.roleDescription) : role1.roleDescription == null;

    }

    @Override
    public int hashCode() {
        int result = role != null ? role.hashCode() : 0;
        result = 31 * result + (id != null ? id.hashCode() : 0);
        result = 31 * result + (roleDescription != null ? roleDescription.hashCode() : 0);
        return result;
    }
}
