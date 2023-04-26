/*
 *   platformconnectorplugin - ContainerInterface.java
 *
 *   Copyright (c) 2022-2023, Slinky Software
 *
 *   This program is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU Lesser General Public License as
 *   published by the Free Software Foundation, either version 3 of the
 *   License, or (at your option) any later version.
 *
 *   This program is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU Lesser General Public License for more details.
 *
 *   A copy of the GNU Lesser General Public License is located in the 
 *   LGPL-3.0.md supplied with the source code.
 *
 */
package com.slinkytoybox.gcloud.platformconnectorplugin;

import com.slinkytoybox.gcloud.platformconnectorplugin.health.HealthResult;

/**
 *
 * @author Michael Junek (michael@juneks.com.au)
 */
public interface ContainerInterface {

    /**
     * setPluginHealth allows the plugin to force a health update to the
     * main container
     *
     * @param pluginId The plugin identifier
     * @param healthResult The health update to be sent
     *
     */
    public void setPluginHealth(String pluginId, HealthResult healthResult);
    
    /**
     * encrypt will use the container interface classes to perform encryption
     * using the standard methodology and keys used by the application
     * @param plainText The plain text to be encrypted
     * @return String with the encrypted text, or NULL if encryption fails
     */
    public String encrypt (String plainText);
    
    /**
     * decrypt will use the container interface classes to perform decryption
     * using the standard methodology and keys used by the application
     * @param encryptedText The encrypted string to be decrypted
     * @return String with the decrypted text, or NULL if decryption fails
     */
    public String decrypt (String encryptedText);

}
