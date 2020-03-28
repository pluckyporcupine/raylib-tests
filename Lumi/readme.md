How to build:

* Install [MSYS2](https://www.msys2.org/) 
* Launch Mingw64 terminal
* Grab [the latest mingw release](https://github.com/raysan5/raylib/releases) of raylib
* Copy raylib to the bin/include/lib folders in your `mingw64` folder
* Clone the [Lumi](https://github.com/meircif/lumi-lang) repo and run `make` in the repo folder
  * Remove all instances of `sudo` in the makefile before running `make`
* Make a folder for Lumi development, eg. `D:\Code\Lumi`
* Copy the `stdlib` folder from the Lumi repo to your Lumi development folder
* Make another folder inside your Lumi development folder for this program
* Copy these files to that folder
* Move to the folder you copied these files to
* Run `./build`

To run the resulting program outside of MSYS2, `libraylib.dll` must be located either in the same folder as the executable or globally on your system.

**If you're on Linux or Mac:** Just ignore the first two steps and replace anything mention of mingw64 and its folders elsewhere with your OS and its folders. It should work the same way.