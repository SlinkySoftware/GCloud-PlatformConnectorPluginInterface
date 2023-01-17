/*
 *   platformconnectorplugin - PlatformConnectorPlugin.java
 *
 *   Copyright (c) 2022-2023, Slinky Software
 *
 *   This program is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU Affero General Public License as
 *   published by the Free Software Foundation, either version 3 of the
 *   License, or (at your option) any later version.
 *
 *   This program is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU Affero General Public License for more details.
 *
 *   A copy of the GNU Affero General Public License is located in the 
 *   AGPL-3.0.md supplied with the source code.
 *
 */
package com.slinkytoybox.gcloud.platformconnectorplugin;

import com.slinkytoybox.gcloud.platformconnectorplugin.health.HealthResult;
import com.slinkytoybox.gcloud.platformconnectorplugin.request.*;
import com.slinkytoybox.gcloud.platformconnectorplugin.response.*;
import java.util.List;
import org.pf4j.ExtensionPoint;

/**
 * Platform Connector Plugin interface defining the functions to be implemented for each plugin
 * 
 * @author Michael Junek (michael@juneks.com.au)
 */
public interface PlatformConnectorPlugin extends ExtensionPoint {
    
    // This is the default interface required for implementing a plugin.

    /**
     * getResponseFromRequest takes a PluginRequest abstract object, and returns
     * a PluginResponse abstract object. The concrete implementation of this method
     * should implement the various tasks for the extended classes of PluginRequest/Response
     * 
     * @param request The data for this request
     * @return The response for the request
     */
     public PluginResponse getResponseFromRequest(PluginRequest request);
            
     /**
      * getPluginHealth will enumerate the health of the plugin and return an
      * object which contains statuses and metrics on the plugin. At minimum 
      * this object should contain the overallStatus object.
      * 
      * @return HealthResult detailing the health of the plugin
      */
     public HealthResult getPluginHealth();
     
     
     /**
      * getValidOperations will return the operations supported by the plugin
      * If an operation is not supported, it should not be included in the list.
      * 
      * @return List of PluginOperations detailing what is supported
      */
     public List<PluginOperation> getValidOperations();
     
     /**
      * Sets the container interface object for callbacks to the main application
      * @param containerInterface 
      */
     
     public void setContainerInterface(ContainerInterface containerInterface);


}