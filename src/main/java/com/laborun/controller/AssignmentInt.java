package com.laborun.controller;

import com.laborun.entity.AssignmentFiles;
import com.laborun.entity.Lab;
import com.laborun.entity.UserD;
import java.util.List;

/**
 * Created by Rainfall on 3/19/2015.
 */
public interface AssignmentInt {
    public void uploadAssignment(AssignmentFiles assignmentFiles);
    public AssignmentFiles DownloadAssignment(AssignmentFiles assignmentFiles);
    public List<AssignmentFiles> getAssignments(UserD user, Lab lab);
}
