# smoothieMaker
Smoothie maker is an application which elaborates the decorator design pattern. 
It is modeled based on bottle which has a capacity of 500ml and can make a smoothie based on the ingredients that are personalized to individual users. In other words, the user gets to choose 5 ingredients(can have multiples of the same) of 100 ml each. Once this has been given, the application creates the personalized smoothie and gives an output consisting of the cost and the calorie content in each bottle. It is mandatory to give 5 ingredients to make the end product consistent with regards to its quantity.

Design Pattern

To formulate the solution, we choose the decorator pattern. We have chosen this due to the following reason.

• It allows you to modify an object dynamically. We need this in order to dynamically add the ingredients based on the user input at runtime.

• It is basically used when one wants the capabilities of inheritance with a subclass,but also when one needs to add them dynamically at runtime.

• It is more flexible than inheritance.

• Simplifies code because you add functionality using many simple classes.In our case,each ingredient is made of a simple class implementation of the interface.

• By using this design pattern, we can extend with new code rather than by modifying existing old code. It supports the open-closed principle.

For our implementation decorator design pattern seems the best fit, as we can have as many of the ingredients with different costs and description as required. If we no longer need a particular ingredient, we can choose to remove it from the project without causing any harm to its functioning.



