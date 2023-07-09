Bien sûr ! Voici une version améliorée du texte :

# LogSaver

LogSaver is an open-source program that serves as a powerful logging tool.

## Getting Started

If you're working on a project that requires robust logging capabilities, LogSaver is the perfect library for you!

### How does it work?

LogSaver provides three main functions:

- `createFile`: Creates a file with a specified name and extension.
- `writeFile`: Writes content to a specified file.
- `readFile`: Reads and displays the content of a specified file.

## Usage Example

### createFile

To create a file, follow these steps:

```java
// Declare the file name (including the extension):
String fileName = "YourFileNameHere.txt";

// Create the file:
createFile(fileName);
```

### writeFile

To write content to a file, use the following syntax:

```java
writeFile(fileName, "The text you want to put in the file.");
```

### readFile

To read the content of a file and display it in the console, use the following code:

```java
readFile(fileName);
```

## Complete Example

Here's a complete example that demonstrates the usage of LogSaver:

```java
package com.yourpackage;

import static fr.cakihorse.FileHandler.*;

public class ExampleLog {
    public static void main(String[] args) {
        // Creating the file
        String fileName = "YourFileNameHere.txt";
        createFile(fileName);

        // Writing to the file
        writeFile(fileName, "Your text here...");

        // Reading the file and displaying its content in the console
        readFile(fileName);
    }
}
```

## How to Use LogSaver?

[![](https://jitpack.io/v/cakihorse/LogSaver.svg)](https://jitpack.io/#cakihorse/LogSaver)

Detailed instructions on how to use LogSaver will be available soon. Stay tuned!
