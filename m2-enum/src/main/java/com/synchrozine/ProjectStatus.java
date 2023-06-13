package com.synchrozine;

public enum ProjectStatus {
    OPEN,CLOSED,PROGRESS("In Progress");

    ProjectStatus(String s) {

    }

    ProjectStatus() {

    }
}
