# ArrayListOfObjects

## Assignment 4:
 * 100 points
 * Ready for code review Tuesday 2/26.
 * Code review due by Wed 2/27.
 * Final version due Thursday 2/28.
 
----
Adapt your ArrayOfPokemon code from Assignment 2 to use an ArrayList and your new Pokemon objects from Assignment 3.
 * The new program should still have the same main user menu.
 * There should still be two static methods, makePokemon and printArray.
 * When making a Pokemon in the makePokemon method, instead of asking the user to enter all the information, make a sub-menu for them to pick from the nine (or more) species implemented in A3: 
```
 Choose a Pokemon to add:
     1 for Bulbasaur
     2 for Ivysaur
     3 for Venusaur
     4 for Charmander
     5 for Charmeleon
     6 for Charizard
     7 for Squirtle
     8 for Wartortle
     9 for Blastoise
```
  * The only thing the user must choose is the species of Pokemon and if it gets a name.
    * If they want a name, then the program should ask them to enter one.
 * Then use a switch to call the constructor (with or without the name parameter) for the chosen Pokemon. For example: ``` case 1: Pokemon p = new Bulbasaur();``` or ```case 7: Pokemon p = new Squirtle(sName);``` or ```case 9: Pokemon p = new Blastoise());```
 * Change the Array from assignment 2 to a Java API ArrayList<Pokemon>. 
   * You must correctly declare the ArrayList generic type to hold Pokemon objects. This should still be local to the main method.
   * To add the first Pokemons you can use the ArrayList add method:  ``` ArrayList.add(E element) ```
   * For examples on using an ArrayList, see the slides ICS211_Lecture9_ListsAndContainers.pdf Laulima -> Resources -> Session 10,  the ArrayListDemo.java code included in this repo, and the PocketAL class in the ExampleCoinPocket GitHub repo https://github.com/ICSatKCC/ExampleCoinPocket. Also see the Java API website for ArrayList for available methods.
 * **The allowed number of stored Pokemon should still be limited to 6.** 
     - Don't let the ArrayList keep growing even though it can! 
     - Once there are 6 Pokemons in the list, to overwrite existing Pokemons use the ```ArrayList.set(int index, E element)``` method.
 * The printArray method should still be void, but will need to take in an ArrayList parameter instead of an array.

----
## Submitting

Submit your finished program, *including all of your Pokemon classes needed to run the program*, via GitHub.
 * Make a develop branch of this repository and do all you work there.
 * Make a pull request on GitHub to signal that your code is ready for code review by Tuesday 2/26. 
   - **You must have made a significant effort to finish your code before code review or I will not assign you a reviewer!**
 * Continue to push stuff to the develop branch on GitHub. Make good commit messages so I can understand what you are doing because I will be able to see all of your changes. Use the commit message "Final Assignment Submission" for the version you want graded by 2/28.

### Assignment 4 Grading

#### Rubric:

|    |  pts  |
| :-----------------------------------------------: | ----:|
| Menu for users to pick which Pokemon to add     |  25   |
| Users can choose to name Pokemon                |  10   |
| Correct use of Java API ArrayList               |  30   |
| Allowed number of Pokemon limited to 6          |  10   |
| Commenting and style, passes CheckStyle check   |  15   |
| Review someone else's code                      | 5    |
| Address suggestions from your reviewer          | 5    |
| **Total** | **100** |
