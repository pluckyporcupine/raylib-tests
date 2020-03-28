switch operating-system
case 'windows
    load-library "libraylib.dll"
case 'linux
    load-library "libraylib.so"
case 'macos
    load-library "libraylib.dylib"
default
    error "Unsupported OS"
run-stage;

let rl =
    include "raylib.h"
     
vvv bind rl
do
    using rl.extern
    using rl.typedef
    using rl.define
    using rl.enum

    let LIGHTGRAY =
        Color
            r = 200
            g = 200
            b = 200
            a = 255
    
    let RAYWHITE =
        Color
            r = 245
            g = 245
            b = 245
            a = 255
    locals;

let screenWidth = 800
let screenHeight = 450

using rl

InitWindow screenWidth screenHeight "raylib [core] example - basic window"
SetTargetFPS 60

do
    while (not (WindowShouldClose))
        BeginDrawing;
        ClearBackground RAYWHITE
        DrawText "Congrats! You created your first window!" 190 200 20 LIGHTGRAY
        EndDrawing;

CloseWindow;