# Rectangle Drawing Application

This project allows users to create drawings composed of multiple rectangles. It provides functionality to add rectangles to the drawing and calculate the total area covered by all rectangles.

## Features:
- Create a drawing composed of multiple rectangles.
- Add rectangles to the drawing.
- Calculate the total area covered by all rectangles in the drawing.
  
## Usage

1. Run the `TestRectangle.java` file.

2. Enter the number of rectangles you want to add to the drawing.

3. For each rectangle, enter the coordinates of its bottom-left and top-right corners when prompted.

4. Once all rectangles are added, the program will calculate and display the total area covered by all rectangles in the drawing.

## Classes

### Rectangle.java

- Represents a rectangle with coordinates for its bottom-left and top-right corners.
- Provides methods to calculate the length, width, and area of the rectangle.

### Dessin.java

- Represents a drawing composed of multiple rectangles.
- Uses an array to store the rectangles.
- Provides methods to add rectangles to the drawing and calculate the total area.

### Design.java

- Represents a design composed of multiple rectangles.
- Uses an ArrayList to store the rectangles.
- Provides methods to add rectangles to the design and calculate the total area.

### TestRectangle.java

- Main program to test the functionality of the `Dessin` and `Design` classes.
