<h1 align="center" style="font-weight: normal;"><b>HMC-Optimizations</b></h1>
<p align="center">Version specific optimizations for the HeadlessMc runtime.</p>
<p align="center"><a href="https://github.com/3arthqu4ke/mc-runtime-test">Mc-Runtime-Test</a> | <a href="https://github.com/3arthqu4ke/headlessmc">HMC</a> | <a href="https://github.com/3arthqu4ke/hmc-specifics">HMC-Specifics</a> | HMC-Optimizations</p>

<div align="center">

[![CodeFactor](https://www.codefactor.io/repository/github/3arthqu4ke/hmc-optimizations/badge/1.20.4)](https://www.codefactor.io/repository/github/3arthqu4ke/hmc-optimizations/overview/1.20.4)
[![GitHub All Releases](https://img.shields.io/github/downloads/3arthqu4ke/hmc-optimizations/total.svg)](https://github.com/3arthqu4ke/hmc-optimizations/releases)
![](https://github.com/3arthqu4ke/hmc-optimizations/actions/workflows/build.yml/badge.svg)
![GitHub](https://img.shields.io/github/license/3arthqu4ke/hmc-optimizations)
![Github last-commit](https://img.shields.io/github/last-commit/3arthqu4ke/hmc-optimizations)

</div>

Version specific optimizations for [HeadlessMC](https://github.com/3arthqu4ke/headlessmc).
The goal of HeadlessMC is to make the Minecraft client run on the command line. It does so by
hooking into the LWJGL library skipping all the code. This also makes it largely
Minecraft version independent, as I only have to target the LWJGL library.

**However**, all the Minecraft code for rendering will still run;
it is just the calls to LWJGL that do not do anything.
Also, due to the inextensible nature of Javas Buffers, the LWJGL library patched by us still
needs to allocate buffers when Minecrafts code tells it to, currently on the heap instead of off.

The goal of this project is to write mods that target Minecraft code specifically, patching out
anything rendering related with [Mixin](https://github.com/SpongePowered/Mixin).

Console output from a fresh, headless SinglePlayer world, without and with HMC-Optimizations:
```
> fps
1356 fps T: inffast fancy-clouds B: 2
> optimize
HMC-Optimizations enabled.
> fps
1826208 fps T: inffast fancy-clouds B: 2
```

:warning: This is work in progress.
