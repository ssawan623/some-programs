/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.trianglesoftware.dao;

import com.swcguild.trianglesoftware.dto.Triangle;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author apprentice
 */
public interface TriangleDao {

    public void addTriangleToDatabase(Triangle triangle);

    public Triangle getTriangleFromDatabase(int triangleId);
    
    public void getTrianglesFromDatabase() throws FileNotFoundException;
    
    public void loadTrianglesToDatabase() throws IOException;
    
    public List<Triangle> getAllTrianglesInDatabase();
    
    public void getCounterFromDatabase() throws FileNotFoundException;
    
    public void loadCounterToDatabase() throws IOException;

}
