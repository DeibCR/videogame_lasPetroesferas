# videogame_lasPetroesferas

A simple Java-based 2D video game project created to showcase programming, OOP, and GUI development skills.

## Table of Contents

- [Overview](#overview)
- [Features](#features)
- [Screenshots](#screenshots)
- [How to Run](#how-to-run)
- [Project Structure](#project-structure)
- [Technologies Used](#technologies-used)
- [Credits](#credits)
- [License](#license)

## Overview

**videogame_lasPetroesferas** is a 2D video game where the player controls a main character, avoiding obstacles and surviving as long as possible. The game demonstrates object-oriented programming (OOP), event-driven GUI programming, and basic game mechanics in Java.

The project is intended as a skills showcase, highlighting:
- Game logic and collision detection
- GUI development using Swing
- Use of threads for animation and background movement
- Clean code organization using MVC patterns

## Features

- **Player Control:** Move the main character using keyboard events (up, left, right arrows).
- **Obstacles:** Obstacles are created and managed dynamically; collisions reduce the player's lives.
- **Win/Lose Conditions:** The player wins by reaching a certain point; loses when lives reach zero.
- **Animated Background:** The game uses a moving background to enhance the visual experience.
- **Simple GUI:** Built with Java Swing, with custom panels and basic graphics drawing.

## Screenshots


```
_If you do not have screenshots yet, you can add them later in a `screenshots/` folder._

## How to Run

1. **Clone the repository:**
   ```sh
   git clone https://github.com/DeibCR/videogame_lasPetroesferas.git
   cd videogame_lasPetroesferas
   ```

2. **Ensure Java is installed:**
   - Requires Java 8 or newer.
   - Make sure `javac` and `java` are available in your PATH.

3. **Compile the project:**
   ```sh
   javac -d bin src/main/java/modelo/*.java src/main/java/controlador/*.java src/main/java/vista/*.java
   ```

4. **Run the game:**
   ```sh
   java -cp bin vista.GUI_Juego
   ```

   - The main entry point may be in a different class; adjust as necessary.

## Project Structure

```
videogame_lasPetroesferas/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── modelo/         # Game logic, main character, obstacles, area
│   │   │   ├── controlador/    # Event controllers, threads, main logic
│   │   │   └── vista/          # GUI windows, panels
│   │   └── resources/
│   │       └── imagenes/       # Game images (player, obstacles, background)
├── bin/                        # Compiled classes
├── README.md                   # This file
```

## Technologies Used

- **Java** (Primary Language)
- **Swing** (GUI)
- **OOP Principles**
- **MVC Design Pattern** (Model-View-Controller)

## Credits

Developed by [DEIBER](https://github.com/DeibCR).

## License


---
