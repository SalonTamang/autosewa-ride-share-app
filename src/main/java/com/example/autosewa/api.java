package com.example.autosewa;

public class api {
    private static final String ROOT_URL = "http://192.168.1.194/registration/api.php?apicall=";

    public static final String URL_SIGNUP = ROOT_URL + "signUp";
    public static final String URL_READ_USER = ROOT_URL + "getUser";
    public static final String URL_READ_DRIVERS = ROOT_URL + "getRiders";
    public static final String URL_UPDATE_USER = ROOT_URL + "updateUser";
    public static final String URL_DELETE_USER = ROOT_URL + "deleteUser&id=";
}
