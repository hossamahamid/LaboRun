/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.laborun.controller;

import com.laborun.entity.Intake;
import java.util.List;

/**
 *
 * @author dina
 */
public interface IntakeInt {
    public boolean insertIntake(Intake intake);
    public List<Intake> getIntakes();
}
