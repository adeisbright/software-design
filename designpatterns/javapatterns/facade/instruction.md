# Facade Design Pattern 

With a facade, we use just one interface within our facade class to gain access into a single or 
multiple method within our third party or third class.

This is useful when we need to use a third party class for a particular task but the third party 
has lots of classes or methods that does the tasks together. 

To make it easier to manage changes within our application we do not need to directly use each of the 
methods or classes within the third party, we will have to introduce a Facade that provides a single 
method to do the task we want to achieve. 

A facade defines a new interface for an existing class whereas an Adapter tries to make the existing 
interface usable. 

