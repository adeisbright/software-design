# Adapter Design Pattern  

Assuming you have an application that gets data from a single or multipe external sources and 
uses the data obtained to plot graph , lets say these data are returned in XML format, and 
now , you have found a use case for integrating a third party visualization tool but this 
visualization only works with data in JSON format, how will you solve this problem ? 

To solve this problem, we will use the Adapter Design pattern by introducing a third class 
known as the Adapter. 


An adapter is a class that takes an interface from an existing object and make it 
usable or understandable to another class.
 
The way this works is to pick an interface(s) from the service class, and wrap an implementation 
within the adapter class that. 

When the client class needs to make a call for the method under review, it uses the method provided 
or exposed by the Adapter class. 

The structure of an Adapter Design Pattern Includes the following :

Adaptee : The existing class that has an incompatible interface 
Client : The class that wants to use the incompatible interface 
Adapter : The class that wraps a conversion implementation for the Adaptee method 
Interface : The interface that Adapter implements 