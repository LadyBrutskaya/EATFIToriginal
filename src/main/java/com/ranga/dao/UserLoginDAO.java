package com.ranga.dao;

public interface UserLoginDAO {
    boolean registrationUser(String login, String password);
    boolean authorizationUser(String login, String password);
}
