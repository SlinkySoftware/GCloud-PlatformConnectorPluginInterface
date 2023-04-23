/*
 *   platformconnectorplugin - PluginRequest.java
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
package com.slinkytoybox.gcloud.platformconnectorplugin.request;

import java.time.OffsetDateTime;
import java.util.Map;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 *
 * @author Michael Junek (michael@juneks.com.au)
 */
@Data
@Accessors(chain=true)
public abstract class PluginRequest {
    
    private String requestId;
    private OffsetDateTime requestDate;
    private Map<String, String[]> requestParameters;
    
}
