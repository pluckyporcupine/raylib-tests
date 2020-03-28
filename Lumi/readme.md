## How to build:

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

## Notes about Lumi

* Lumi's syntax is *extremely* strict. You have to follow the rules [here](https://lumi-lang.readthedocs.io/en/latest/general-syntax.html) *exactly* or the compiler will throw errors. One thing that could perhaps be written a bit clearer is that you *cannot* have spaces at the end of a line. This means that, if you attempt to break a long function call or some other bit of code into multiple lines, you *absolutely must* delete the trailing space after the last comma on the original line or else the compiler will tell you that it `expected access, got "new-line"`.
* In case it isn't clear, you *cannot* use tabs. You *must* use spaces for indentation. Some editors may allow you to get around this by inserting spaces in place of tabs, but it isn't the default in many.