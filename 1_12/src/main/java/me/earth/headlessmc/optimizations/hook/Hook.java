package me.earth.headlessmc.optimizations.hook;

@FunctionalInterface
public interface Hook<T> {
    void invoke(T callbackInfo);

}
