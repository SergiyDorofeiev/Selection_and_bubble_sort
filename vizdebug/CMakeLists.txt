cmake_minimum_required(VERSION 3.23)
project(vizdebug)

set(CMAKE_CXX_STANDARD 20)

find_package(Qt6 COMPONENTS
        Core
        Gui
        Widgets
        Quick
        REQUIRED)

add_executable(vizdebug v_debug.cpp main.cpp v_debug.h)

target_link_libraries(vizdebug
        Qt::Core
        Qt::Gui
        Qt::Widgets
        Qt::Quick
        )