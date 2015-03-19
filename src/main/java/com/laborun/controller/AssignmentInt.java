package com.laborun.controller;

/**
 * Created by Rainfall on 3/19/2015.
 */
public interface AssignmentInt {
    public void uploadAssignment(Assignment);
    public Assignment DownloadAssignment(Assignment);
    public List<Assignment> getAssignments(User user, Lab lab);
}
