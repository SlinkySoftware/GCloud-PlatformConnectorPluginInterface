# Genesys Cloud Platform Connector Plugin Interface

These are the base classes used as an interface between the container application and the plugins.

When a new release is made of this code, the container and every plugin will need to be recompiled against the updated project. This will require updating the pom.xml file of each plugin as well as the container application. 

Plugins and the container MUST be compiled against the same version otherwise there will be problems.
