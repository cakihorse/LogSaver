package fr.cakihorse;

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
