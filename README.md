# DesignPrinciplesSample

SOLID is an acronym that represents five principles very important when we develop with the OOP paradigm, in addition it is an essential knowledge that every developer must know.

Understanding and applying these principles will allow you to write better quality code and therefore be a better developer.
The SOLID principles were defined in the early 2000s by Robert C. Martin (Uncle Bob). Uncle Bob elaborated some of these and identified others already existing and said that these principles should be used to get a good management of dependencies in our code.

However, in the beginning these principles were not yet known as SOLID until Michael Feathers observed that the initials of these principles fit perfectly under the acronym SOLID and that it was also a very representative name for its definition.
These principles are a set of practical recommendations that when applied to our code helps us to obtain the following benefits:
####Ease to maintain.
####Ease to extend.
####Robust code.

But before we see what each SOLID principle means, we need to remember two relevant concepts in the development of any software.
The coupling and the cohesion:

##Coupling:
We can define it as the degree to which a class, method or any other software entity, is directly linked to another. This degree of coupling can also be seen as a degree of dependence.
example: when we want to use a class that is tightly bound (has a high coupling) to one or more classes, we will end up using or modifying parts of these classes for which we are dependent.

##Cohesion:
Cohesion is the measure in which two or more parts of a system work together to obtain better results than each part individually.
example: Han Solo and Chewbacca aboard the Millennium Falcon.

To obtain a good software we must always try to have a low coupling and a high cohesion, and SOLID principles help us with this task. If we follow these guidelines our code will be more robust, maintainable, reusable and extensible and we will avoid the tendency of our code to break in many places every time something is changed.
