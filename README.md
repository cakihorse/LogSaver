# LogSaver

LogSaver is an open-source program. It is a logging tool.

## Getting Started

If you have any projects that require a logging tool, LogSaver is the perfect library for you!

### How does it work?

There are three main functions:
* createFile: It creates a file with the specified name and extension.
* writeFile: It writes content to the specified file.
* readFile: It reads and displays the content of the specified file.

## createFile

```
// To create a file, follow these steps:
// Don't forget to provide the file name with the correct extension and import the necessary dependencies!

// Declare the file name:
String fileName = "YourFileNameHere.txt"; // The name must include the extension.

// Create the file:
createFile(fileName);
```

## writeFile

```
writeFile(fileName, "The text you want to put in the file.");
```

## readFile

```
// The file content will be displayed in the console.
readFile(fileName);
```

## Complete example

```
package com.yourpackage;

import static fr.cakihorse.FileHandler.*;

/*
                                _
                               | |
  _____  ____ _ _ __ ___  _ __ | | ___
 / _ \ \/ / _` | '_ ` _ \| '_ \| |/ _ \
|  __/>  < (_| | | | | | | |_) | |  __/
 \___/_/\_\__,_|_| |_| |_| .__/|_|\___|
                         | |
                         |_|
*/

public class ExampleLog {
    public static void main(String[] args) {
        // Creation of the file
        // TODO: Don't forget to provide the file name with the correct extension and import the necessary dependencies!

        String fileName = "YourFileNameHere.txt";
        createFile(fileName);

        // Writing to the file
        writeFile(fileName, "Your text here...");

        // Reading the file and displaying its content in the console
        readFile(fileName);
    }
}
```

## How to Use?

[![](https://jitpack.io/v/cakihorse/LogSaver.svg)](https://jitpack.io/#cakihorse/LogSaver)

```Coming soon...```
