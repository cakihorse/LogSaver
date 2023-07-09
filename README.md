# LogSaver

LogSaver is an open-source program. It's a logger.

## Getting Started

If you have any projects in needs for a logger, LogSaver is the perfect lib for you !

### How does it function ?

There are 3 principals functions :
* createFile (it will create a file with name and extension you want)
* writeFile (it will write on the file you want write on)
* readFile (it will the file you want read)

## createFile
```
//for create a file you need to do this :
//Don't forget to name the file with the correct extension and also the correct import btw !

        //declare the name of the file :
        String fileName = "YourFileNameHere.txt"; //the name must contains the extension.

        //create file:
        createFile(fileName);'
```

## writeFile

```
writeFile(fileName, "The text you want to put in the file.");
```

## readFile

```
//the file is only read on the console.
readFile(fileName);
```

## Entire example :
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

public class ExampleLog{
    public static void main(String[] args) {
        //creation of the file
        //TODO: Don't forget to name the file with the correct extension and also the correct import btw !

        String fileName = "YourFileNameHere.txt";
        createFile(fileName);


        //writing on the file
        writeFile(fileName, "Your text here...");

        //reading the file and showing his content in the console
        readFile(fileName);
    }

}

```
## How Use ?
[![](https://jitpack.io/v/cakihorse/LogSaver.svg)](https://jitpack.io/#cakihorse/LogSaver)
``` soon... ```


