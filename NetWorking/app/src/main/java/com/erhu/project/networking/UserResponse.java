package com.erhu.project.networking;

import java.util.List;

public class UserResponse extends BaseResponse {
    List<User> users;

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
