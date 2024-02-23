<h1 align="center">🔷 Rectangle Drawing Application 🔷</h1>

Welcome to the Rectangle Drawing Application! This project enables users to create intricate drawings composed of multiple rectangles effortlessly. Whether you're an artist 🎨, designer ✏️, or simply love geometry 🔷, this application provides a versatile tool to express your creativity.

## Table of Contents

- [Description](#description) 📝
- [Features](#features) ✨
- [Usage](#usage) 🚀
- [Classes](#classes) 📚
- [Tools and Languages](#tools-and-languages) 🔧
- [Execution](#execution) 💻

## Description 📝

The Rectangle Drawing Application is a Java-based project designed to facilitate the creation and manipulation of rectangles within a graphical space. It includes a set of classes meticulously crafted to handle various aspects of rectangle management, including creation, modification, and visualization.

## Features ✨

- **Create Drawings**: Generate drawings with multiple rectangles to visualize complex layouts.
- **Add Rectangles**: Dynamically add rectangles to your drawing with customizable dimensions.
- **Calculate Area**: Obtain the total area covered by all rectangles in the drawing with a single click.
- **Calculate the number of objects created**: Get insights into the number of objects created in the application.

## Usage 🚀

1. **Clone the Repository**: Clone this repository to your local machine using `git clone `.
2. **Navigate to the Project Directory**: Open a terminal and move into the project directory.
3. **Navigate to the Source Directory**: Change directory to the `src` folder where the source code files are located.
4. **Compile and Run**: Compile and run the `TestPoint.java` file to launch the application.
   - To compile: `javac TestPoint.java`
   - To run: `java TestPoint`
5. **Interact with the Application**: Follow the on-screen instructions to create drawings, add rectangles, and calculate the total area.

## Classes 📚

### Point.java 🔹

The `Point` class represents a point in a 2D Cartesian coordinate system. It encapsulates the x and y coordinates of the point and provides methods to set and get the coordinates, as well as to add increments to the coordinates.

### Rectangle.java 🟩

The `Rectangle` class represents a rectangle in a 2D Cartesian coordinate system. It provides methods to calculate the length, width, and area of the rectangle. Additionally, it tracks the number of instances created.

#### Calculate the number of objects created 📊

The `Rectangle` class includes a method to calculate the total number of instances created. This feature provides insights into resource utilization and memory management.

### Dessin.java 🖼️

The `Dessin` class represents a drawing composed of multiple rectangles. It uses an **`array`** to store the rectangles and provides methods to add rectangles to the drawing and calculate the total area.

### Design.java 🎨

The `Design` class represents a design composed of multiple rectangles. It uses an **`ArrayList`** to store the rectangles and provides methods to add rectangles to the design and calculate the total area.

### TestPoint.java 🧪

The `TestPoint` class is the main program used to test the functionality of the `Dessin` and `Design` classes.

## Tools and Languages 🔧

- **`Java`**: Primary programming language used for development.
- **`IntelliJ IDEA`**: Integrated Development Environment (IDE) utilized for coding and debugging.

## Execution 💻
