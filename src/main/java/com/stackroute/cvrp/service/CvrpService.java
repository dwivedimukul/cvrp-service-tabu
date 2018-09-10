package com.stackroute.cvrp.service;

import java.util.List;

import com.stackroute.cvrp.domain.Location;
import com.stackroute.cvrp.domain.Route;
import com.stackroute.cvrp.exceptions.IllegalLocationMatrixException;

public interface CvrpService {

	public Route getJson(Route route);
	public List<Location> getAllLocationsBySlot(String slotId);
	public Double[][] getDistanceMatrix(String slotId) throws IllegalLocationMatrixException;
	public Route getOrderedRoute();
	
	
}
