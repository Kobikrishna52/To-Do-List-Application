# To-Do-List-Application
A simple command-line To-Do List application written in Java that allows users to manage tasks. Tasks can be added, marked as completed, removed, and are stored persistently in a text file.

Features
Add tasks to the list.
Mark tasks as completed.
Remove tasks from the list.
Save tasks locally in a .txt file for persistence.
Project Structure
bash
Copy code
ToDoApp/
│
├── src/
│   ├── com/todo/Task.java         # Represents a task
│   ├── com/todo/TaskManager.java  # Manages task operations
│   └── com/todo/ToDoApp.java      # Main class for user interaction
│
├── data/
│   └── tasks.txt                  # File where tasks are saved
│
├── README.md
└── .gitignore
Getting Started
Prerequisites
Java JDK 8 or later installed.
Basic understanding of command-line operations.
Running the Project
Clone the repository:

bash
Copy code
git clone https://github.com/Kobikrishna52/ToDoApp.git
Navigate to the project directory:

bash
Copy code
cd ToDoApp
Compile and run the application:

bash
Copy code
cd src
javac com/todo/ToDoApp.java
java com.todo.ToDoApp
Follow the prompts to add, complete, or remove tasks.

Usage
Once you run the program, you will see the following prompt:

less
Copy code
To-Do List:

1. [ ] Task 1
2. [x] Task 2

Commands: [add] [complete] [remove] [exit]
Enter command:
Commands:
add: Adds a new task. You will be prompted to enter the task description.
complete: Marks a task as completed. You will need to provide the task number.
remove: Removes a task from the list. You will need to provide the task number.
exit: Closes the application.
Saving and Loading Tasks
Tasks are automatically saved to a file named tasks.txt located in the data/ folder. The next time you run the application, it will load the tasks from this file.

Future Improvements
Sort tasks by completion status.
Add the ability to edit task descriptions.
Build a GUI using JavaFX or Swing for a better user interface.
Contributing
Contributions are welcome! If you find any bugs or have ideas for new features, feel free to open an issue or create a pull request.

License
This project is licensed under the MIT License - see the LICENSE file for details.

Feel free to modify this README.md to suit your needs or project specifics!
