How to build:

* Install [MSYS2](https://www.msys2.org/) 
* Launch Mingw64 terminal
* Install raylib globally in the Mingw64 terminal
* Clone the [Lumi](https://github.com/meircif/lumi-lang) repo and run `make` in the repo folder
* Make a folder for Lumi development, eg. `D:\Code\Lumi`
* Copy the `stdlib` folder from the Lumi repo to your Lumi development folder
* Make another folder inside your Lumi development folder for this program
* Copy these files to that folder
* Move to the folder you copied these files to
* Run `./build`

To run the resulting program outside of MSYS2, `libraylib.dll` from raylib's latest `mingw` release must be located either in the same folder as the executable or globally on your system.

**If you're on Linux or Mac:** Just ignore the parts about MSYS2/Mingw64. It should work the same way. raylib should still be installed globally.