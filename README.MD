# HMC-Optimizations
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

:warning: This is work in progress and I have yet to benchmark any effects.
